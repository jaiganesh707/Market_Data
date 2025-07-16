package com.example.MarketExample.Entity;

import jakarta.persistence.*;

import java.math.BigInteger;


@Entity
@Table(name = "stock_db")
public class StockDetails {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;
    private String stockId;
    private String stockSymbol;
    private String stockName;
    private String stockExchange;
    private String stockSector;
    private Double stockPrice;
    private BigInteger stockVolume;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStockId() {
        return stockId;
    }

    public void setStockId(String stockId) {
        this.stockId = stockId;
    }

    public String getStockSymbol() {
        return stockSymbol;
    }

    public void setStockSymbol(String stockSymbol) {
        this.stockSymbol = stockSymbol;
    }

    public String getStockName() {
        return stockName;
    }

    public void setStockName(String stockName) {
        this.stockName = stockName;
    }

    public String getStockExchange() {
        return stockExchange;
    }

    public void setStockExchange(String stockExchange) {
        this.stockExchange = stockExchange;
    }

    public String getStockSector() {
        return stockSector;
    }

    public void setStockSector(String stockSector) {
        this.stockSector = stockSector;
    }

    public Double getStockPrice() {
        return stockPrice;
    }

    public void setStockPrice(Double stockPrice) {
        this.stockPrice = stockPrice;
    }

    public BigInteger getStockVolume() {
        return stockVolume;
    }

    public void setStockVolume(BigInteger stockVolume) {
        this.stockVolume = stockVolume;
    }
}
