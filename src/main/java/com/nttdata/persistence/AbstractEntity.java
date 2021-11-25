package com.nttdata.persistence;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;

/**
 * NTT DATA - SUPERCLASE PARA ENTIDADES
 * 
 * @author alvar
 *
 */

@MappedSuperclass
public abstract class AbstractEntity implements Serializable {

	/** SERIAL VERSION */
	private static final long serialVersionUID = 1L;

	/** Auditoría - Usuario que actualiza el registro */
	private String updatedUser;

	/** Auditoría - Fecha en que se actualiza el registro */
	private Date updatedDate;

	/**
	 * @return updatedUser
	 */
	@Column(name = "C_UPDATED_USER", nullable = false)
	public String getUpdatedUser() {
		return updatedUser;
	}

	/**
	 * @param updatedUser
	 * 
	 */
	public void setUpdatedUser(String updatedUser) {
		this.updatedUser = updatedUser;
	}

	/**
	 * @return updatedDate
	 */
	@Column(name = "C_UPDATED_DATE", nullable = false)
	public Date getUpdatedDate() {
		return updatedDate;
	}

	/**
	 * @param updatedDate
	 *
	 */
	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

}
