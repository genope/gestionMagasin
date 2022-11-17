package com.example.gestionmagasinstock.Entitys;


import com.example.gestionmagasinstock.Enumerations.CategorieProduit;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class DetailProduit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idDetailProduit;
    @Temporal(TemporalType.DATE)
    private Date dateCreation;
    @Temporal(TemporalType.DATE)
    private Date dateDerniereModification;
    private CategorieProduit categorieProduit;

    @OneToOne(mappedBy = "detailProduit")
    private Produit produit;



}
