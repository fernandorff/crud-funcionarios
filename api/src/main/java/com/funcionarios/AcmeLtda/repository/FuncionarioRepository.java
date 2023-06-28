package com.funcionarios.AcmeLtda.repository;

import com.funcionarios.AcmeLtda.domain.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
