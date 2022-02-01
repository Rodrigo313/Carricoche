/**
 * 
 */
package com.rodri.carricoche.dao;

import org.springframework.stereotype.Service;

import com.rodri.carricoche.dtos.CocheDTO;

/**
 * @author rodri
 *
 */
@Service
public class NegocioDAO {

	public Double obtenerPrecioFinal(CocheDTO coche) {
		double precio_final = coche.getPrecio();
		if(coche.isFamilia_numerosa()) {
			precio_final = coche.getPrecio()*0.9;
		}else if(coche.isRango_edad()) {
			precio_final = coche.getPrecio()*0.85;
		}
		return precio_final;
	}

}
