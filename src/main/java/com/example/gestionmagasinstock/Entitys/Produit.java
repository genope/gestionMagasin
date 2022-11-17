package com.example.gestionmagasinstock.Entitys;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Produit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long idProduit ;
    private String codeProduit;
    private String libelleProduit;
    private float prixUnitaire;

    @ManyToMany()
    private List<Produit> produits;

    @ManyToOne()
    private Rayon rayon;

    @ManyToOne()
    private Stock stock;

    @OneToOne()
    private DetailProduit detailProduit;

    @OneToMany(mappedBy = "produit" )
    private List<DetailFacture>detailFactures;

    @ManyToMany
    private List<Fournisseur> fournisseurs;






}
