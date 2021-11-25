package com.nttdata.services;

import java.util.List;

import org.hibernate.Session;

import com.nttdata.persistence.Client;
import com.nttdata.persistence.ClientDaoI;
import com.nttdata.persistence.ClientDaoImpl;

/**
 * NTT DATA - SERVICIO DE GESTIÓN DE CLIENTES
 * 
 * @author alvar
 *
 */
public class ClientServiceImpl implements ClientServiceI {

	/** DAO: T_PERSON */
	private ClientDaoI clientDao;

	/**
	 * Constructor
	 */
	public ClientServiceImpl(final Session session) {
		this.clientDao = new ClientDaoImpl(session);
	}
	
	/**
	 * Añadir cliente
	 */
	@Override
	public Integer addClient(Client newClient) {

		// ID resultante.
		Integer idClientSaved = null;

		// Verificación.
		if (newClient != null && newClient.getIdClient() == null) {

			// Añadido de persona.
			idClientSaved = clientDao.insert(newClient);
		}

		return idClientSaved;
	}
	
	/**
	 * Buscar por el nombre del conductor
	 */
	@Override
	public Client searchByDriverName(String searchDriverName) {

		Client clientResult = null;

		// Verificación
		if (searchDriverName != null && !searchDriverName.isBlank()) {

			clientResult = clientDao.searchByDriverName(searchDriverName);
		}

		return clientResult;

	}
	
	/**
	 * Buscar a todos los clientes
	 */
	@Override
	public List<Client> findAllClients() {
		return clientDao.searchAllClients();
	}
	
	/**
	 * Eliminar cliente
	 */
	@Override
	public void delete(Client removeClient) {
		if (removeClient != null && removeClient.getIdClient() != null) {

			// Eliminado de persona.
			clientDao.delete(removeClient);
		}

	}
	
	/**
	 * Actualizar la base datos
	 */
	@Override
	public void update(Client updateClient) {
		if (updateClient != null && updateClient.getIdClient() != null) {

			// Actualizado de persona.
			clientDao.update(updateClient);
		}
	}
	
	/**
	 * Buscar por ID
	 */
	@Override
	public Client searchById(Integer ClientIdToSearch) {
		return clientDao.searchById(ClientIdToSearch);
	}

}
