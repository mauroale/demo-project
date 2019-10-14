package com.exemple.demoproject.service;

import java.util.List;

import com.example.demoproject.domain.Cargo;

public interface CargoService {
	
	void salvar (Cargo cargo);
	
	void editar (Cargo cargo);
	
	void excluir (Long id);
	
	Cargo buscarPorId (Long id);
	
	List<Cargo> buscarTodos ();
	
	
}
