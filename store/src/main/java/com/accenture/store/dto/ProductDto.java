package com.accenture.store.dto;

import lombok.Data;

import java.util.UUID;

@Data
public class ProductDto {

    private UUID uuid;

    private String category;

    private String description;

    private String identification;

    private String initdate;

    private String productname;

    private String value;
}
