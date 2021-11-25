package com.nttdata.persistence;

import java.util.List;

import org.hibernate.Session;

/**
 * NTT Data - IMPLEMENTACION DAO ENTIDAD CLIENTE
 * 
 * @author alvar
 *
 */

public class ClientDaoImpl implements ClientDaoI {

	/** Sesión de conexión con BBDD */
	private Session session;

	/**
	 * Constructor sobrecargado.
	 * 
	 * @param session
	 */
	public ClientDaoImpl(final Session session) {
		super();
		this.session = session;
	}
	
	/**
	 * Insertar cliente en la base de datos
	 */
	@Override
	public Integer insert(Client newClient) {

		// Verificación de sesión abierta
		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}

		// Insercción
		Integer newClientId = (Integer) session.save(newClient);

		// Commit
		session.getTransaction().commit();

		return newClientId;
	}
	
	/**
	 * Eliminar cliente de la base de datos
	 */
	@Override
	public void delete(Client removeClient) {
		// Verificación de sesión abierta.
		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}

		// Actualización.
		session.remove(removeClient);

		// Commit.
		session.getTransaction().commit();
	}
	
	/**
	 * Actualizar la base de datos
	 */
	@Override
	public void update(Client updateClient) {
		// Verificación de sesión abierta
		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}

		// Actualizamos.
		session.update(updateClient);

		// Commit.
		session.getTransaction().commit();
	}
	
	/**
	 * Buscar por ID
	 */
	@Override
	public Client searchById(Integer ClientIdToSearch) {
		// Verificación de sesión abierta.
		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}

		// Búsqueda por ID (PK)
		Client entityResult = (Client) session.get(Client.class, ClientIdToSearch);

		return entityResult;
	}
	
	
	/**
	 * Buscar todos los clientes en la base de datos
	 */
	@SuppressWarnings("unchecked")
	@Override
	public List<Client> searchAllClients() {
		// Verificación de sesión abierta.
		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}

		// Búsqueda completa.
		final List<Client> entityListResult = session.createQuery("FROM Client").list();

		return entityListResult;
	}
	
	/**
	 * Buscar por el nombre del conductor
	 */
	@Override
	public Client searchByDriverName(String ClientDriverNameToSearch) {
		if (!session.getTransaction().isActive()) {
			session.getTransaction().begin();
		}
		final Client client = (Client) session.createQuery("FROM Client WHERE Driver_Name = '" + ClientDriverNameToSearch + "'").uniqueResult();
		return client;
	}
}
