package com.funcionarios.AcmeLtda.service;

import com.funcionarios.AcmeLtda.controller.dto.CargoDto;
import com.funcionarios.AcmeLtda.domain.enums.Cargo;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class ListarCargosService {

    public List<CargoDto> listar() {
        return Arrays.stream(Cargo.values())
                .map(cargo -> new CargoDto(cargo.name(), cargo.getValue()))
                .collect(Collectors.toList());
    }
}
