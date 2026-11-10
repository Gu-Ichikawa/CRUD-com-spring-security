package com.bn.funcionario.repositories;


import com.bn.funcionario.models.FuncionarioModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends  JpaRepository<FuncionarioModel, Long> {
}
