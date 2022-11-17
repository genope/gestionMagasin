package com.example.gestionmagasinstock.Controllers;

import com.example.gestionmagasinstock.Entitys.Client;
import com.example.gestionmagasinstock.Services.IClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/client")
public class ClientController {

    @Autowired
    IClientService iClientService;

    @GetMapping
    public List<Client> getall(){return iClientService.retrieveAllClients();}

    @PostMapping()
    public Client addOne(@RequestBody Client c){return iClientService.addClient(c);}

    @DeleteMapping("/{c}")
    public void deleteOne(@PathVariable  long c){iClientService.deleteClient(c);}

    @PutMapping()
    public Client updateOne(@RequestBody Client c){return iClientService.updateClient(c);}

    @GetMapping("/{id}")
    public Client getOne(@PathVariable long id){return  iClientService.retrieveClient(id);}
}
