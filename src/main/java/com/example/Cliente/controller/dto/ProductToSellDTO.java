package com.example.Cliente.controller.dto;

import lombok.Data;

@Data
public class ProductToSellDTO {
    public ProductToSellDTO(Integer code, Integer unitsToSell) {
        this.code = code;
        this.unitsToSell = unitsToSell;
    }
    private Integer code;
    private Integer unitsToSell;
}
