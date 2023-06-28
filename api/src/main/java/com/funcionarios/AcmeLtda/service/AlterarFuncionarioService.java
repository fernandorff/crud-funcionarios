package com.funcionarios.AcmeLtda.service;

import com.funcionarios.AcmeLtda.controller.dto.FuncionarioDto;
import com.funcionarios.AcmeLtda.controller.request.AlterarFuncionarioRequest;
import com.funcionarios.AcmeLtda.domain.Funcionario;
import com.funcionarios.AcmeLtda.repository.FuncionarioRepository;
import com.funcionarios.AcmeLtda.service.validations.ObterFuncionarioValido;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import static com.funcionarios.AcmeLtda.mapper.FuncionarioMapper.toDto;

@Service
public class AlterarFuncionarioService {

    @Autowired
    private ObterFuncionarioValido obterFuncionarioValido;

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public FuncionarioDto alterar(Long id, AlterarFuncionarioRequest request) {

        Funcionario funcionario = obterFuncionarioValido.porId(id);

        funcionario.alterar(request);

        funcionarioRepository.save(funcionario);

        return toDto(funcionario);
    }
}
