package com.stock.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.stock.entity.Stock;
import com.stock.service.IStockService;

@RestController
@RequestMapping("/stock")
public class StockController {
	@Autowired
	private IStockService stockService;
	@PostMapping("/add")
	public Stock addStock(@RequestBody Stock stock) {
		return stockService.addStock(stock);
	}
	
	
}
