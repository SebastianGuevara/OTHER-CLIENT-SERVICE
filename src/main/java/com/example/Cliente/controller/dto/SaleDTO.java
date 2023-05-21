package com.example.Cliente.controller.dto;

import lombok.Data;

import java.util.List;

@Data
public class SaleDTO {
    public SaleDTO(List<ProductToSellDTO> products, Integer clientDocument) {
        this.products = products;
        this.clientDocument = clientDocument;
    }

    private List<ProductToSellDTO> products;
    private Integer clientDocument;
}
