package com.stock.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="stock_tbl")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Stock {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer stockId;
	private String productName;
	private Integer qty;

}
