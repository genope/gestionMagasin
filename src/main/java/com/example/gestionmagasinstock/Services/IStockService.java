package com.example.gestionmagasinstock.Services;

import com.example.gestionmagasinstock.Entitys.Stock;

import java.util.List;

public interface IStockService {
    List<Stock> retrieveAllStocks();

    Stock addStock(Stock s);

    Stock updateStock(Stock u);

    Stock retrieveStock(Long id);
}
