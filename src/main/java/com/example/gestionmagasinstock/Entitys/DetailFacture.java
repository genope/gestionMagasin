package com.example.gestionmagasinstock.Entitys;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetailFacture {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetailFacture;
    private int qte;
    private float prixTotale;
    private int pourcentageRemise;
    private int montantRemise;

    @ManyToOne
    private Produit produit;

    @ManyToOne()
    private Facture facture;
}
