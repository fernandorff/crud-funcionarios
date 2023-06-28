package com.funcionarios.AcmeLtda.service;

import com.funcionarios.AcmeLtda.controller.dto.FuncionarioDto;
import com.funcionarios.AcmeLtda.controller.request.IncluirFuncionarioRequest;
import com.funcionarios.AcmeLtda.domain.Funcionario;
import com.funcionarios.AcmeLtda.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import static com.funcionarios.AcmeLtda.mapper.FuncionarioMapper.toDto;
import static com.funcionarios.AcmeLtda.mapper.FuncionarioMapper.toEntity;

@Service
public class IncluirFuncionarioService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    @Transactional
    public FuncionarioDto incluir(IncluirFuncionarioRequest request) {

        Funcionario funcionario = toEntity(request);

        funcionarioRepository.save(funcionario);

        return toDto(funcionario);
    }
}
