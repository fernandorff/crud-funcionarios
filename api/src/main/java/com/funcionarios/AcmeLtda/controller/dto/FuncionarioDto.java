package com.funcionarios.AcmeLtda.controller.dto;

import com.funcionarios.AcmeLtda.domain.enums.Cargo;
import lombok.*;

import java.math.BigDecimal;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class FuncionarioDto {

    private Long id;
    private String nome;
    private String cpf;
    private Cargo cargo;
    private String cargoString;
    private BigDecimal salario;
}
