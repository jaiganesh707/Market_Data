package com.example.MarketExample.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.sql.Timestamp;
import java.util.Date;


public class ByeSell {
    private int id;
    private String productName;
    private int productPrice;
    private int productQuantity;
    private User userDetails;
    private Date byeDate;
}
