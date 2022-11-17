package com.example.gestionmagasinstock.Repositories;

import com.example.gestionmagasinstock.Entitys.Facture;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IFactureRepo extends JpaRepository<Facture,Long> {
}
