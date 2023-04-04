package com.corebeautycommerceidservice.Pojo.Model;
import java.util.UUID;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.ObjectMapper;
import jakarta.websocket.Decoder.Text;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.SneakyThrows;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
    
    @JsonProperty("addressId")
    private UUID addressId;
    @JsonProperty("recipientName")
    private String recipientName;
    @JsonProperty("fullAddress")
    private Text fullAddress;
    @JsonProperty("province")
    private String province;
    @JsonProperty("city")
    private String city;
    @JsonProperty("postalCode")
    private int postalCode;
    @JsonProperty("phoneNumber")
    private String phoneNumber;

    @SneakyThrows
    @Override
    public String toString() {
        return new ObjectMapper().writeValueAsString(this);
    }
}