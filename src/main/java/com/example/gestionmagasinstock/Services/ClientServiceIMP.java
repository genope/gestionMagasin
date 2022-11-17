package com.example.gestionmagasinstock.Services;

import com.example.gestionmagasinstock.Entitys.Client;
import com.example.gestionmagasinstock.Repositories.IClientRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceIMP implements IClientService{


    @Autowired
    IClientRepo iClientRepo;
    @Override
    public List<Client> retrieveAllClients() {
        return iClientRepo.findAll();
    }

    @Override
    public Client addClient(Client c) {
        return iClientRepo.save(c);
    }

    @Override
    public void deleteClient(long id) {
        iClientRepo.deleteById(id);

    }

    @Override
    public Client updateClient(Client c) {
        return iClientRepo.save(c);
    }

    @Override
    public Client retrieveClient(Long id) {
        return iClientRepo.findById(id).orElse(null);
    }
}
