package com.stock.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.stock.entity.Stock;
import com.stock.repository.Stockrepository;

@Service
public class StockService implements IStockService {
	@Autowired
	private Stockrepository stockRepository;

	@Override
	public Stock addStock(Stock stock) {
		return stockRepository.save(stock);
	}
	
	
	
}
