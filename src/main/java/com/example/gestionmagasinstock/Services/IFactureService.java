package com.example.gestionmagasinstock.Services;

import com.example.gestionmagasinstock.Entitys.Facture;

import java.util.List;

public interface IFactureService {
    List<Facture> retrieveAllFactures();

    void cancelFacture(Long id);

    Facture retrieveFacture(Long id);
    List<Facture> getFacturesByClient(Long idClient);
}
