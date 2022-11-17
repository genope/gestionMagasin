package com.example.gestionmagasinstock.Services;

import com.example.gestionmagasinstock.Entitys.Client;

import java.util.List;

public interface IClientService {
    public List<Client> retrieveAllClients();

    public Client addClient(Client c);

    public void deleteClient(long id);

    public Client updateClient(Client c);

    public Client retrieveClient(Long id);
}
