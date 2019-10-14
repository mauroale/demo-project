package com.exemple.demoproject.service;

import java.util.List;


import com.example.demoproject.domain.Funcionario;

public interface FuncionarioService {

	void salvar (Funcionario funcionario);
	
	void editar (Funcionario funcionario);
	
	void excluir (Long id);
	
	Funcionario buscarPorId (Long id);
	
	List<Funcionario> buscarTodos ();
	
}
