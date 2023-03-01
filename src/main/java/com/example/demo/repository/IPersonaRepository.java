package com.example.demo.repository;

import java.util.List;

import com.example.demo.modelo.Persona;

public interface IPersonaRepository {
	
	public List<Persona> buscarTodos();
	public List<Persona> buscarId(Integer id);
	public void actualizar(Persona persona);
	public void eliminar(Integer id);
	public void guardar(Persona persona);

}
