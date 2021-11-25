package com.nttdata.services;

import java.util.List;

import com.nttdata.persistence.Client;

public interface ClientServiceI {
	
	/**
	 * Método para añadir clientes.
	 * 
	 * @param newClient
	 * @return Long
	 */
	public Integer addClient(final Client newClient);
	
	/**
	 * Método para buscar clientes por dni.
	 * 
	 * @param dniToSearch
	 * @return Client
	 */
	public Client searchByDriverName(final String SearchDriverName);
	
	/**
	 * Método para eliminar clientes
	 * 
	 * @param removeCliente
	 */
	
	public void delete(final Client removeCliente);
	
	/**
	 * Método para actualizar los clientes
	 * 
	 * @param updateClient
	 * @return Client
	 */
	
	public void update(final Client updateClient);
	
	/**
	 * Método para devolver todos los clientes.
	 * 
	 * @return List<Client>
	 */
	public List<Client> findAllClients();
	
	/**
	 * Método para buscar por Id al cliente
	 * 
	 * @param ClientIdToSearch
	 * @return Client
	 */
	
	public Client searchById(final Integer ClientIdToSearch);
}
