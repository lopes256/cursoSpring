package br.com.deltatgn.curso.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.deltatgn.curso.model.Cliente;
import br.com.deltatgn.curso.repository.ClientesRepository;

@Service
public class ClientesService {
	
	private ClientesRepository repository;
	
	@Autowired
	public ClientesService(ClientesRepository repository) {
		this.repository = repository;
	}

	public void salvarClinete(Cliente cliente) {
		validarClente(cliente);
		this.repository.persistir(cliente);
	}
	
	public void validarClente(Cliente cliente) {
		// validação de clientes
	}
}
