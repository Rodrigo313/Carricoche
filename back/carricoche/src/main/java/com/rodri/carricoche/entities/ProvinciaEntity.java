/**
 * 
 */
package com.rodri.carricoche.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author rodri
 *
 */
@Entity
@Table(name = "provincias")
public class ProvinciaEntity {
	
	@Id
	@Column(name = "id_provincia")
	private Integer id_provincia;
	
	@Column(name = "nombre")
	private String nombre;

	
	/**
	 * 
	 */
	public ProvinciaEntity() {
		super();
	}

	/**
	 * @param id_provincia
	 * @param nombre
	 */
	public ProvinciaEntity(Integer id_provincia, String nombre) {
		super();
		this.id_provincia = id_provincia;
		this.nombre = nombre;
	}

	
	public Integer getId_provincia() {
		return id_provincia;
	}

	public void setId_provincia(Integer id_provincia) {
		this.id_provincia = id_provincia;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
