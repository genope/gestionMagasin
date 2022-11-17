package com.example.gestionmagasinstock.Repositories;

import com.example.gestionmagasinstock.Entitys.Stock;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IStockrepo extends JpaRepository<Stock,Long> {
}
