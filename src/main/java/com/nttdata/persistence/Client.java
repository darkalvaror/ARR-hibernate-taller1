package com.nttdata.persistence;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

/**
 * NTT Data - ENTIDAD CLIENTE
 * 
 * @author alvar
 *
 */

@Entity
@Table(name = "CLIENTE")
public class Client extends AbstractEntity implements Serializable{

	/** SERIAL VERSION */
	private static final long serialVersionUID = 1L;
	
	/** Id de cliente*/
	private Integer IdClient;

	/** DNI del cliente */
	private String DNI;
	
	/** Nombre del cliente*/
	private String DriverName;
	
	/** Dirección del cliente */
	private String adress;
	
	/** Telefono del cliente */
	private int phoneNumber;
	
	/** Tarjeta de credito del cliente */
	private int creditCardNumber;
	
	/**
	 * 
	 * @return ID
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public Integer getIdClient() {
		return IdClient;
	}
	
	/**
	 * 
	 * @param idClient
	 */
	public void setIdClient(Integer idClient) {
		IdClient = idClient;
	}
	
	/**
	 * 
	 * @return DNI
	 */
	@Column(name = "DNI", unique = true, length = 9)
	public String getDNI() {
		return DNI;
	}
	
	/**
	 * 
	 * @param dNI
	 */
	public void setDNI(String dNI) {
		DNI = dNI;
	}
	
	/**
	 * 
	 * @return nombreConductor
	 */
	@Column(name = "Driver_Name", nullable = false)
	public String getDriverName() {
		return DriverName;
	}
	
	/**
	 * 
	 * @param driverName
	 */
	public void setDriverName(String driverName) {
		this.DriverName = driverName;
	}
	
	/**
	 * 
	 * @return adress
	 */
	@Column(name = "Adress")
	public String getAdress() {
		return adress;
	}
	
	/**
	 * 
	 * @param adress
	 */
	public void setAdress(String adress) {
		this.adress = adress;
	}
	
	/**
	 * 
	 * @return phoneNumber
	 */
	@Column(name = "Phone_Number")
	public int getPhoneNumber() {
		return phoneNumber;
	}
	
	/**
	 * 
	 * @param telefono
	 */
	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	
	/**
	 * 
	 * @return creditCardNumber
	 */
	@Column(name = "Credit_Card_Number", nullable = false)
	public int getCreditCardNumber() {
		return creditCardNumber;
	}
	
	/**
	 * 
	 * @param creditCardNumber
	 */
	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}
	
	@Override
	public String toString() {
		return "Client [IdClient=" + IdClient + ", DNI=" + DNI + ", DriverName=" + DriverName + ", adress=" + adress
				+ ", phoneNumber=" + phoneNumber + ", creditCardNumber=" + creditCardNumber + "]";
	}
	
	
	

}
