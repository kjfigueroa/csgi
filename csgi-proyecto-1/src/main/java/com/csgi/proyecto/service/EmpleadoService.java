package com.csgi.proyecto.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.csgi.proyecto.interfaceService.IempleadoService;
import com.csgi.proyecto.interfaces.IEmpleado;
import com.csgi.proyecto.modelo.Empleado;

@Service
public class EmpleadoService implements IempleadoService{

	@Autowired
	private IEmpleado data;
	@Override
	public List<Empleado> mostrar() {		
		return (List<Empleado>) data.findAll();
	}

	@Override
	public Optional<Empleado> mostrarId(int id) {
		return data.findById(id);
	}

	@Override
	public int save(Empleado e) {
		int response=0;
		Empleado persona=data.save(e);
		if(!persona.equals(null)) {
			response=1;
		}
		return response;
	}

	@Override
	public void delete(int id) {
		data.deleteById(id);		
	}

}
