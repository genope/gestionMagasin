package com.example.gestionmagasinstock.Controllers;

import com.example.gestionmagasinstock.Entitys.Produit;
import com.example.gestionmagasinstock.Services.IProduitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/produit")
public class ProduitController {

    @Autowired
    IProduitService iProduitService;

    @GetMapping()
    public List<Produit> getAll(){return iProduitService.retrieveAllProduits();}

    @GetMapping("/{id}")
    public Produit getOne(@PathVariable Long id){return iProduitService.retrieveProduit(id);}

    @PutMapping("/{idRayon}/{idStock}")
    public Produit addOne(@RequestBody Produit p, @PathVariable Long idRayon, @PathVariable Long idStock)
    {return iProduitService.addProduit(p,idRayon,idStock);}

    @PutMapping("/{idProduit}/{idStock}")
    public void assignProduitToStock(@PathVariable Long idProduit, @PathVariable Long idStock)
    {  iProduitService.assignProduitToStock(idProduit,idStock);}


}
