package com.example.gestionmagasinstock.Services;

import com.example.gestionmagasinstock.Entitys.Facture;
import com.example.gestionmagasinstock.Repositories.IFactureRepo;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class FactureServiceIMP implements IFactureService {
    @Autowired
    IFactureRepo iFactureRepo;
    @Override
    public List<Facture> retrieveAllFactures() {
        return iFactureRepo.findAll();
    }

    @Override
    public void cancelFacture(Long id) {
        iFactureRepo.deleteById(id);
    }

    @Override
    public Facture retrieveFacture(Long id) {
        return iFactureRepo.findById(id).orElse(null);
    }

    @Override
    public List<Facture> getFacturesByClient(Long idClient) {
        return iFactureRepo.findById(idClient);
    }
}
