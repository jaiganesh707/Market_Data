package com.example.MarketExample.Service;

import com.example.MarketExample.Dto.StockDetailsResponse;
import com.example.MarketExample.Entity.StockDetails;
import org.springframework.cache.annotation.Cacheable;

import java.util.Optional;

public interface StockService {
    public StockDetailsResponse registerStock(StockDetails stockDetails)throws Exception;
    public Optional<StockDetails> getStockDetails(String stockName) throws Exception;
    public String deleteStock(String stockName) throws Exception;
}
