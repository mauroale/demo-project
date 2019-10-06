package com.example.demoproject.dao;

import java.util.List;

import com.example.demoproject.domain.Cargo;
import com.example.demoproject.domain.Departamento;

public interface CargoDao {
	
	void save(Cargo cargo);

    void update(Cargo cargo);

    void delete(Long id);

    Cargo findById(Long id);

    List<Cargo> findAll();

}
