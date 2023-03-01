package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.modelo.Persona;
import com.example.demo.repository.IPersonaRepository;

@Service
public class PersonaServiceImpl implements IPersonaService {

	@Autowired
	private IPersonaRepository iPersonaRepository;
	
	@Override
	public List<Persona> buscarTodos() {
		// TODO Auto-generated method stub
		return this.iPersonaRepository.buscarTodos();
	}

	@Override
	public List<Persona> buscarId(Integer id) {
		// TODO Auto-generated method stub
		return this.iPersonaRepository.buscarId(id);
	}

	@Override
	public void actualizar(Persona persona) {
		// TODO Auto-generated method stub
		this.iPersonaRepository.actualizar(persona);
	}

	@Override
	public void eliminar(Integer id) {
		// TODO Auto-generated method stub
		this.iPersonaRepository.eliminar(id);
	}

	@Override
	public void guardar(Persona persona) {
		// TODO Auto-generated method stub
		this.iPersonaRepository.guardar(persona);
	}

}
