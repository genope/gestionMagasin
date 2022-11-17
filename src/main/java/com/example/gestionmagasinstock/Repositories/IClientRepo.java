package com.example.gestionmagasinstock.Repositories;

import com.example.gestionmagasinstock.Entitys.Client;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IClientRepo extends JpaRepository<Client,Long> {
}
