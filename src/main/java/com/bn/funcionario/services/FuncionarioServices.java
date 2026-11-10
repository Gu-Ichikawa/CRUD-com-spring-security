package com.bn.funcionario.services;

import com.bn.funcionario.models.FuncionarioModel;
import com.bn.funcionario.repositories.FuncionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FuncionarioServices {

   @Autowired
   private FuncionarioRepository funcionarioRepository;

   public List<FuncionarioModel> findAll(){
       return  funcionarioRepository.findAll();
   }

   public FuncionarioModel buscarPorId(Long id){
       return  funcionarioRepository.findById(id).get();
   }

   public FuncionarioModel criarPessoa(FuncionarioModel funcionarioModel) {
       return  funcionarioRepository.save( funcionarioModel);
   }

   //deletar
    public void deletar(Long id){
       funcionarioRepository.deleteById(id);
    }
    //atualizar
    public FuncionarioModel atualizar(Long id, FuncionarioModel funcionarioModel){
       FuncionarioModel func = funcionarioRepository.findById(id).get();
       func.setNome(funcionarioModel.getNome());
       func.setCpf(funcionarioModel.getCpf());
       return  funcionarioRepository.save(func);
    }






}
