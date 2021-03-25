package com.csgi.proyecto.interfaceService;

import java.util.List;
import java.util.Optional;

import com.csgi.proyecto.modelo.Empleado;

public interface IempleadoService {
	public List<Empleado>mostrar();
	public Optional<Empleado>mostrarId(int id);
	public int save(Empleado e);
	public void delete (int id);
}
