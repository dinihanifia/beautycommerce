package com.corebeautycommerceidservice.Pojo.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;
import org.w3c.dom.Text;

import java.util.UUID;

/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author ASUS a.k.a. Aldi Cahya Ramadhan
Java Developer
Created on 04/04/2023 21:43
@Last Modified 04/04/2023 21:43
Version 1.0
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Products {

    @JsonProperty("productId")
    private UUID productId;

    @JsonProperty("categoryId")
    private UUID categoryId;

    @JsonProperty("discountId")
    private UUID discountId;

    @JsonProperty("rateId")
    private UUID rateId;

    @JsonProperty("productName")
    private String productName;
    @JsonProperty("productImages")
    private String productImages;
    @JsonProperty("price")
    private String price;
    @JsonProperty("brand")
    private String brand;
    @JsonProperty("expirationDate")
    private String expirationDate;
    @JsonProperty("ingredients")
    private String ingredients;
    @JsonProperty("description")
    private Text description;
    @JsonProperty("isActive")
    private Boolean isActive;
    @JsonProperty("createdAt")
    private String createdAt;
    @JsonProperty("modifiedAt")
    private String modifiedAt;

    @SneakyThrows
    @Override
    public String toString() {
        return new ObjectMapper().writeValueAsString(this);
    }
}
