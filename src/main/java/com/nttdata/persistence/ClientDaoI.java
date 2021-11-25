package com.nttdata.persistence;

import java.util.List;

public interface ClientDaoI {
	
	/**
	 * Método para insertar clientes
	 * 
	 * @param newClient
	 * @return newClient
	 */
	
	public Integer insert(final Client newClient);
	
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
	 * Método para buscar por Id al cliente
	 * 
	 * @param ClientIdToSearch
	 * @return Client
	 */
	
	public Client searchById(final Integer ClientIdToSearch);
	
	/**
	 * Método para buscar todos los clientes que son VIP
	 * 
	 * @return List<Client>
	 */
	
	public List<Client> searchAllClients();
	
	/**
	 * Método para buscar a un cliente por su nombre
	 * 
	 * @param ClientDriverNameToSearch
	 * @return Client
	 */
	
	public Client searchByDriverName(final String ClientDriverNameToSearch);
	
	

}
