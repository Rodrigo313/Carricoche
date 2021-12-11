/**
 * 
 */
package com.rodri.carricoche.dtos;

/**
 * @author rodri
 *
 */
public class AnuncioDTO {
	
	private Integer id_anuncio;
	private String coche;
	private String provincia;
	private Integer id_provincia;
	private Integer telefono;
	private String correo_electronico;
	private double precio;
	private boolean segunda_mano;
	
	
	/**
	 * @param id_anuncio
	 * @param coche
	 * @param provincia
	 * @param id_provincia
	 * @param telefono
	 * @param correo_electronico
	 * @param precio
	 * @param segunda_mano
	 */
	public AnuncioDTO(Integer id_anuncio, String coche, String provincia, Integer id_provincia, Integer telefono,
			String correo_electronico, double precio, boolean segunda_mano) {
		super();
		this.id_anuncio = id_anuncio;
		this.coche = coche;
		this.provincia = provincia;
		this.id_provincia = id_provincia;
		this.telefono = telefono;
		this.correo_electronico = correo_electronico;
		this.precio = precio;
		this.segunda_mano = segunda_mano;
	}

	/**
	 * @param id_anuncio
	 * @param coche
	 * @param provincia
	 * @param id_provincia
	 * @param telefono
	 * @param correo_electronico
	 * @param precio
	 */
	public AnuncioDTO(Integer id_anuncio, String coche, String provincia, Integer id_provincia, Integer telefono,
			String correo_electronico, double precio) {
		super();
		this.id_anuncio = id_anuncio;
		this.coche = coche;
		this.provincia = provincia;
		this.id_provincia = id_provincia;
		this.telefono = telefono;
		this.correo_electronico = correo_electronico;
		this.precio = precio;
	}

	/**
	 * @param id_anuncio
	 * @param coche
	 * @param provincia
	 * @param id_provincia
	 * @param telefono
	 * @param correo_electronico
	 */
	public AnuncioDTO(Integer id_anuncio, String coche, String provincia, Integer id_provincia, Integer telefono,
			String correo_electronico) {
		super();
		this.id_anuncio = id_anuncio;
		this.coche = coche;
		this.provincia = provincia;
		this.id_provincia = id_provincia;
		this.telefono = telefono;
		this.correo_electronico = correo_electronico;
	}

	/**
	 * @param id_anuncio
	 * @param coche
	 * @param provincia
	 * @param id_provincia
	 * @param telefono
	 */
	public AnuncioDTO(Integer id_anuncio, String coche, String provincia, Integer id_provincia, Integer telefono) {
		super();
		this.id_anuncio = id_anuncio;
		this.coche = coche;
		this.provincia = provincia;
		this.id_provincia = id_provincia;
		this.telefono = telefono;
	}

	/**
	 * @param id_anuncio
	 * @param coche
	 * @param provincia
	 * @param id_provincia
	 */
	public AnuncioDTO(Integer id_anuncio, String coche, String provincia, Integer id_provincia) {
		super();
		this.id_anuncio = id_anuncio;
		this.coche = coche;
		this.provincia = provincia;
		this.id_provincia = id_provincia;
	}

	/**
	 * @param id_anuncio
	 * @param coche
	 * @param provincia
	 */
	public AnuncioDTO(Integer id_anuncio, String coche, String provincia) {
		super();
		this.id_anuncio = id_anuncio;
		this.coche = coche;
		this.provincia = provincia;
	}

	/**
	 * @param id_anuncio
	 * @param coche
	 */
	public AnuncioDTO(Integer id_anuncio, String coche) {
		super();
		this.id_anuncio = id_anuncio;
		this.coche = coche;
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

	public String getProvincia() {
		return provincia;
	}

	public void setProvincia(String provincia) {
		this.provincia = provincia;
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
