package com.csgi.proyecto.interfaceService;

import java.util.List;
import java.util.Optional;

import com.csgi.proyecto.modelo.Departamento;

public interface IdepartamentoService {
	public List<Departamento>mostrar();
	public Optional<Departamento>mostrarId(int id);
	public int save(Departamento d);
	public void delete (int id);
}
