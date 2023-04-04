package com.corebeautycommerceidservice.Pojo.Model;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

import java.util.UUID;

/*
Created By IntelliJ IDEA 2022.3.1 (Community Edition)
Build #IC-223.8214.52, built on December 20, 2022
@Author ASUS a.k.a. Aldi Cahya Ramadhan
Java Developer
Created on 04/04/2023 21:48
@Last Modified 04/04/2023 21:48
Version 1.0
*/
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Carts {

    @JsonProperty("cartId")
    private UUID cartId;
    @JsonProperty("cartSessionId")
    private UUID cartSessionId  ;
    @JsonProperty("productId")
    private UUID productId;

    @JsonProperty("quantity")
    private String quantity;

    @SneakyThrows
    @Override
    public String toString() {
        return new ObjectMapper().writeValueAsString(this);
    }


}
