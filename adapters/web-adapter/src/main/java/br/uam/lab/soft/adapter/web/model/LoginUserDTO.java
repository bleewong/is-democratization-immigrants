package br.uam.lab.soft.adapter.web.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class LoginUserDTO {
    private String email;
    private String name;
    private List<OrderDTO> orderDTOList;
}
