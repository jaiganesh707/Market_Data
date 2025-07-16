package com.example.MarketExample.Service;

import com.example.MarketExample.Dto.StockDetailsResponse;
import com.example.MarketExample.Entity.StockDetails;
import com.example.MarketExample.Repository.StockDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.expression.ExpressionException;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class StockServiceImpl implements StockService {
    @Autowired private StockDao stockDao;
    @Override
    public StockDetailsResponse registerStock(StockDetails stockDetails) throws Exception {
        Optional<StockDetails> stockData=stockDao.findByStockName(stockDetails.getStockName());
        if(stockData.isPresent()){
            return new StockDetailsResponse("Dai Losu Pu! Inthis Stock Alredy Registed Daa", stockDetails, HttpStatus.ALREADY_REPORTED, "Asia/Kolkata");
        }
        stockDao.save(stockDetails);
        return new StockDetailsResponse("Dai Mairu New Register Daa : " + stockDetails.getStockName(), stockDetails, HttpStatus.OK, "Asia/Kolkata");
    }

    @Cacheable(value = "StockDetails", key="#stockName")
    @Override
    public Optional<StockDetails> getStockDetails(String stockName) throws Exception {
        try {
            Thread.sleep(3000);
            return Optional.ofNullable(stockDao.findByStockName(stockName)
                    .orElseThrow(() -> new RuntimeException("Stock not found: " + stockName)));
        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            throw new RuntimeException("Operation interrupted");
        }
    }

    @Override
    public String deleteStock(String stockName) throws Exception {
        int stockId=stockDao.findByStockName(stockName).get().getId();
        stockDao.deleteById(stockId);
        return "Deleted Stock"+stockName;
    }
}
