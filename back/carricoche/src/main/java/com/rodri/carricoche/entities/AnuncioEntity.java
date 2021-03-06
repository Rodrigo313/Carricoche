/**
 * 
 */
package com.rodri.carricoche.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @author rodri
 *
 */

@Entity
@Table(name = "anuncios")
public class AnuncioEntity {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	@Column(name = "id_anuncio")
	private Integer id_anuncio;
	
	@Column(name = "coche")
	private String coche;
	
	@Column(name = "id_provincia")
	private Integer	 id_provincia;
	
	@Column(name = "telefono")
	private Integer telefono;
	
	@Column(name = "correo_electronico")
	private String correo_electronico;
	
	@Column(name = "precio")
	private double precio;
	
	@Column(name = "segunda_mano")
	private boolean segunda_mano;

	
	/**
	 * 
	 */
	public AnuncioEntity() {
		super();
	}

	/**
	 * @param id_anuncio
	 */
	public AnuncioEntity(Integer id_anuncio) {
		super();
		this.id_anuncio = id_anuncio;
	}

	/**
	 * @param id_anuncio
	 * @param coche
	 * @param id_provincia
	 * @param telefono
	 * @param correo_electronico
	 * @param precio
	 * @param segunda_mano
	 */
	public AnuncioEntity(Integer id_anuncio, String coche, Integer id_provincia, Integer telefono,
			String correo_electronico, double precio, boolean segunda_mano) {
		super();
		this.id_anuncio = id_anuncio;
		this.coche = coche;
		this.id_provincia = id_provincia;
		this.telefono = telefono;
		this.correo_electronico = correo_electronico;
		this.precio = precio;
		this.segunda_mano = segunda_mano;
	}

	
	public Integer getId_anuncio() {
		return id_anuncio;
	}

	public void setId_anuncio(Integer id_anuncio) {
		this.id_anuncio = id_anuncio;
	}

	public String getCoche() {
		return coche;
	}

	public void setCoche(String coche) {
		this.coche = coche;
	}

	public Integer getId_provincia() {
		return id_provincia;
	}

	public void setId_provincia(Integer id_provincia) {
		this.id_provincia = id_provincia;
	}

	public Integer getTelefono() {
		return telefono;
	}

	public void setTelefono(Integer telefono) {
		this.telefono = telefono;
	}

	public String getCorreo_electronico() {
		return correo_electronico;
	}

	public void setCorreo_electronico(String correo_electronico) {
		this.correo_electronico = correo_electronico;
	}

	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}

	public boolean isSegunda_mano() {
		return segunda_mano;
	}

	public void setSegunda_mano(boolean segunda_mano) {
		this.segunda_mano = segunda_mano;
	}
}
