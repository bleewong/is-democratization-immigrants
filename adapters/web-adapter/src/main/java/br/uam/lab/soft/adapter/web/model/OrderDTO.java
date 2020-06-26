package br.uam.lab.soft.adapter.web.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Data
public class OrderDTO {
    @JsonProperty("codigo_order")
    private String orderId;
    @JsonProperty("date_register_order")
    private String registerOrder;
    private UserDTO user;
    @JsonProperty("type_pay")
    private String payType;
}
