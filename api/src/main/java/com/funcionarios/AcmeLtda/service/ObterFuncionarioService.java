package com.funcionarios.AcmeLtda.service;

import com.funcionarios.AcmeLtda.controller.dto.FuncionarioDto;
import com.funcionarios.AcmeLtda.domain.Funcionario;
import com.funcionarios.AcmeLtda.service.validations.ObterFuncionarioValido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.funcionarios.AcmeLtda.mapper.FuncionarioMapper.toDto;

@Service
public class ObterFuncionarioService {

    @Autowired
    private ObterFuncionarioValido obterFuncionarioValido;

    public FuncionarioDto obter(Long id) {

        Funcionario funcionario = obterFuncionarioValido.porId(id);

        return toDto(funcionario);
    }
}
