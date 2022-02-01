/**
 * 
 */
package com.rodri.carricoche.dtos;

/**
 * @author rodri
 *
 */
public class CocheDTO {
	private String descripcion;
	private Integer precio;
	private boolean segunda_mano;
	private boolean familia_numerosa;
	private boolean rango_edad;
	
	/**
	 * @return the familia_numerosa
	 */
	public boolean isFamilia_numerosa() {
		return familia_numerosa;
	}

	/**
	 * @param familia_numerosa the familia_numerosa to set
	 */
	public void setFamilia_numerosa(boolean familia_numerosa) {
		this.familia_numerosa = familia_numerosa;
	}

	/**
	 * @return the rango_edad
	 */
	public boolean isRango_edad() {
		return rango_edad;
	}

	/**
	 * @param rango_edad the rango_edad to set
	 */
	public void setRango_edad(boolean rango_edad) {
		this.rango_edad = rango_edad;
	}

	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	
	/**
	 * @return the precio
	 */
	public Integer getPrecio() {
		return precio;
	}
	
	/**
	 * @param precio the precio to set
	 */
	public void setPrecio(Integer precio) {
		this.precio = precio;
	}
	
	/**
	 * @return the segunda_mano
	 */
	public boolean isSegunda_mano() {
		return segunda_mano;
	}
	
	/**
	 * @param segunda_mano the segunda_mano to set
	 */
	public void setSegunda_mano(boolean segunda_mano) {
		this.segunda_mano = segunda_mano;
	}
	
	
	
	
	/**
	 * @param descripcion
	 * @param precio
	 * @param segunda_mano
	 * @param familia_numerosa
	 * @param rango_edad
	 */
	public CocheDTO(String descripcion, Integer precio, boolean segunda_mano, boolean familia_numerosa,
			boolean rango_edad) {
		super();
		this.descripcion = descripcion;
		this.precio = precio;
		this.segunda_mano = segunda_mano;
		this.familia_numerosa = familia_numerosa;
		this.rango_edad = rango_edad;
	}

	/**
	 * 
	 */
	public CocheDTO() {
		super();
	}
}
