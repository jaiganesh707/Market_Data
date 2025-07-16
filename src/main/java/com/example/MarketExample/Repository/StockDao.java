package com.example.MarketExample.Repository;

import com.example.MarketExample.Entity.StockDetails;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface StockDao extends JpaRepository<StockDetails,Integer> {
    Optional<StockDetails> findByStockName(String stockName);
}
