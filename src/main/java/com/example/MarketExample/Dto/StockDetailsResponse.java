package com.example.MarketExample.Dto;

import com.example.MarketExample.Entity.StockDetails;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.http.HttpStatus;

import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;

@Data
@NoArgsConstructor
public class StockDetailsResponse {
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public StockDetails getStockDetails() {
        return stockDetails;
    }

    public void setStockDetails(StockDetails stockDetails) {
        this.stockDetails = stockDetails;
    }

    public HttpStatus getHttpStatus() {
        return httpStatus;
    }

    public void setHttpStatus(HttpStatus httpStatus) {
        this.httpStatus = httpStatus;
    }

    public String getStatusCode() {
        return statusCode;
    }

    public void setStatusCode(String statusCode) {
        this.statusCode = statusCode;
    }

    public String getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(String timestamp) {
        this.timestamp = timestamp;
    }

    private String message;
    private StockDetails stockDetails;
    private HttpStatus httpStatus;
    private String statusCode;
    private String timestamp;

    public StockDetailsResponse(String message, StockDetails stockDetails, HttpStatus httpStatus, String timestamp) {
        this.message = message;
        this.stockDetails = stockDetails;
        this.httpStatus = httpStatus;
        this.statusCode = String.valueOf(httpStatus);

        ZoneId zoneId=timestamp!=null ? ZoneId.of(timestamp) :ZoneId.systemDefault();
        this.timestamp=ZonedDateTime.now(zoneId).format(DateTimeFormatter.ISO_OFFSET_DATE_TIME);
    }
}
