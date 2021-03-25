package com.csgi.proyecto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.csgi.proyecto.interfaceService.IdepartamentoService;
import com.csgi.proyecto.interfaces.IDepartamento;
import com.csgi.proyecto.modelo.Departamento;

@Service
public class DepartamentoService implements IdepartamentoService{
	
	@Autowired
	private IDepartamento data1;
	
	@Override
	public List<Departamento> mostrar() {		
		return (List<Departamento>) data1.findAll();
	}

	@Override
	public Optional<Departamento> mostrarId(int id_d) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int save(Departamento d) {
		int response=0;
		Departamento departamento=data1.save(d);
		if(!departamento.equals(null)) {
			response=1;
		}
		return response;
	}

	@Override
	public void delete(int id_d) {
		// TODO Auto-generated method stub
		
	}

}
