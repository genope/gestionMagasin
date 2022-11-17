package com.example.gestionmagasinstock.Repositories;

import com.example.gestionmagasinstock.Entitys.Fournisseur;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFournisseurRepo extends JpaRepository<Fournisseur,Long> {
}
