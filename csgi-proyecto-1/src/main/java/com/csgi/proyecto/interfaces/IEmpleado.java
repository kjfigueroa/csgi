package com.csgi.proyecto.interfaces;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.csgi.proyecto.modelo.Empleado;

@Repository
public interface IEmpleado extends CrudRepository<Empleado, Integer>{

}
