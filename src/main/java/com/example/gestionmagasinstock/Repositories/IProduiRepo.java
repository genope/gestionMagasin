package com.example.gestionmagasinstock.Repositories;

import com.example.gestionmagasinstock.Entitys.Produit;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IProduiRepo extends JpaRepository<Produit,Long> {
}
