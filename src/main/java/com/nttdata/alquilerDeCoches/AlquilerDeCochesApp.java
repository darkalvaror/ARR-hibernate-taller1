package com.nttdata.alquilerDeCoches;

import java.util.Date;

import org.hibernate.Session;

import com.nttdata.persistence.Client;
import com.nttdata.services.ClientServiceI;
import com.nttdata.services.ClientServiceImpl;

/**
 * NTT Data - ALQUILER DE COCHES (Main App)
 * 
 * @author alvar
 *
 */
public class AlquilerDeCochesApp {

	/**
	 * Método principal.
	 * 
	 * @param args
	 */
	public static void main(String[] args) {

		// Apertura de sesión.
		final Session session = AlquilerDeCochesSessionUtil.getSessionFactory().openSession();

		// Inicialización de servicios.
		final ClientServiceI clientService = new ClientServiceImpl(session);

		// Lógica de negocio.
		
		//Cliente 1
		final Client client1 = new Client();
		client1.setAdress("Calle Real");
		client1.setCreditCardNumber(1232321321);
		client1.setDNI("47546665F");
		client1.setDriverName("Alvaro");
		client1.setPhoneNumber(666215966);
		client1.setUpdatedDate(new Date());
		client1.setUpdatedUser("alvaro.nttdata");
		
		//Cliente 2
		final Client client2 = new Client();
		client2.setAdress("Calle Real");
		client2.setCreditCardNumber(1232321322);
		client2.setDNI("47546665E");
		client2.setDriverName("Maria");
		client2.setPhoneNumber(666214966);
		client2.setUpdatedDate(new Date());
		client2.setUpdatedUser("maria.nttdata");
		
		// Añadir clientes
		clientService.addClient(client1);
		clientService.addClient(client2);
		
		// Actualizar información
		client1.setAdress("Calle Arenal");
		clientService.update(client1);
		
		// Buscar por ID
		System.out.println("El cliente buscado por ID es: " + clientService.searchById(1));
		
		// Buscar todos los clientes
		System.out.println("Lista con todos los clientes: " + clientService.findAllClients());
		
		
		//Borrar a un cliente
		//clientService.delete(client1);
		 
		
		// Buscar cliente por su nombre
		System.out.println("Cliente buscado por su  nombre: " + clientService.searchByDriverName("Alvaro"));
		
		// Cierre de sesión
		session.close();
	}
}
