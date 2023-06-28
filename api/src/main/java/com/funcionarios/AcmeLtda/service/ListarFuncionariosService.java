package com.funcionarios.AcmeLtda.service;

import com.funcionarios.AcmeLtda.controller.dto.FuncionarioDto;
import com.funcionarios.AcmeLtda.domain.Funcionario;
import com.funcionarios.AcmeLtda.mapper.FuncionarioMapper;
import com.funcionarios.AcmeLtda.repository.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ListarFuncionariosService {

    @Autowired
    private FuncionarioRepository funcionarioRepository;

    public List<FuncionarioDto> listar() {

        return funcionarioRepository.findAll().stream()
                .map(FuncionarioMapper::toDto)
                .collect(Collectors.toList());
    }

    public Page<FuncionarioDto> listarPaginado(Pageable pageable) {

        Page<Funcionario> funcionarios = funcionarioRepository.findAll(pageable);

        return funcionarios.map(FuncionarioMapper::toDto);
    }
}
