package com.example.MarketExample.Controller;

import com.example.MarketExample.Dto.StockDetailsResponse;
import com.example.MarketExample.Entity.StockDetails;
import com.example.MarketExample.Service.StockService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Optional;

@RestController
@RequestMapping("/Stock")
public class HomeStockController {
@Autowired private StockService stockService;
    @PostMapping(value = "/register", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Object> register(@RequestBody StockDetails stockDetails)throws Exception{
        try {
            StockDetailsResponse message= stockService.registerStock(stockDetails);
            return ResponseEntity.ok(message);
        } catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @GetMapping("/{stockName}")
    public ResponseEntity<Optional<StockDetails>> get(@PathVariable String stockName)throws Exception{
        try {
            Optional<StockDetails> stockData=stockService.getStockDetails(stockName);
            return ResponseEntity.ok(stockData);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }
    @DeleteMapping("{stockName}")
    public ResponseEntity<Object> delete(@PathVariable String stockName)throws Exception{
        try {
            String message=stockService.deleteStock(stockName);
            return ResponseEntity.ok(message);
        }catch (Exception e){
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
