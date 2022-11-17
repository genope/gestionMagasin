package com.example.gestionmagasinstock.Services;

import com.example.gestionmagasinstock.Entitys.Fournisseur;
import com.example.gestionmagasinstock.Entitys.Produit;
import com.example.gestionmagasinstock.Entitys.Rayon;
import com.example.gestionmagasinstock.Entitys.Stock;
import com.example.gestionmagasinstock.Repositories.IFournisseurRepo;
import com.example.gestionmagasinstock.Repositories.IProduiRepo;
import com.example.gestionmagasinstock.Repositories.IRayonRepo;
import com.example.gestionmagasinstock.Repositories.IStockrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProduitServiceIMP implements IProduitService {

    @Autowired
    IProduiRepo iProduiRepo;

    @Autowired
    IStockrepo iStockrepo;

    @Autowired
    IRayonRepo iRayonRepo;

    @Autowired
    IFournisseurRepo iFournisseurRepo;

    @Autowired


    @Override
    public List<Produit> retrieveAllProduits() {
        return iProduiRepo.findAll();
    }

    @Override
    public Produit addProduit(Produit p, Long idRayon, Long idStock) {

        Stock stock = iStockrepo.findById(idStock).get();
        Rayon rayon = iRayonRepo.findById(idRayon).get();
        if (rayon != null && stock != null) {
            p.setRayon(rayon);
            p.setStock(stock);
            return iProduiRepo.save(p);
        }
        return null;
    }

    @Override
    public Produit retrieveProduit(Long id) {
        return iProduiRepo.findById(id).orElse(null);
    }

    @Override
    public void assignProduitToStock(Long idProduit, Long idStock) {
            Stock stock = iStockrepo.findById(idStock).get();
            Produit produit = iProduiRepo.findById(idProduit).get();

            if((stock != null) && (produit != null)){
                produit.setStock(stock);
                iProduiRepo.save(produit);


            }
    }

    @Override
    public void assignFournisseurToProduit(Long fournisseurId, Long produitId) {

        Fournisseur fournisseur= iFournisseurRepo.findById(fournisseurId).get();
        Produit produit = iProduiRepo.findById(produitId).get();
        List<Fournisseur>fournisseurs =produit.getFournisseurs();
        if((fournisseur != null) && (produit != null)){
            if(produit.getFournisseurs() != null)
            produit.getFournisseurs().add(fournisseur);
            iProduiRepo.save(produit);

        }
    }
}
