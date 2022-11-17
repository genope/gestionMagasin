package com.example.gestionmagasinstock.Services;

import com.example.gestionmagasinstock.Entitys.Stock;
import com.example.gestionmagasinstock.Repositories.IStockrepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StockServiceIMP implements IStockService{

    @Autowired
    IStockrepo iStockrepo;

    @Override
    public List<Stock> retrieveAllStocks() {
        return iStockrepo.findAll();
    }

    @Override
    public Stock addStock(Stock s) {
        return iStockrepo.save(s);
    }

    @Override
    public Stock updateStock(Stock u) {
        return iStockrepo.save(u);
    }

    @Override
    public Stock retrieveStock(Long id) {
        return iStockrepo.findById(id).orElse(null);
    }
}
