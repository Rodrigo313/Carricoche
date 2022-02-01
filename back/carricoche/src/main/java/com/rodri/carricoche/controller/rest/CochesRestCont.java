/**
 * 
 */
package com.rodri.carricoche.controller.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rodri.carricoche.dao.NegocioDAO;
import com.rodri.carricoche.dtos.CocheDTO;

/**
 * @author rodri
 *
 */
@RestController
@RequestMapping(value="/descuento")
@CrossOrigin(origins = "*", methods= {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class CochesRestCont {
	    @Autowired
	    private NegocioDAO negocioDAO;

	    @PostMapping(value="/aplicar")
	    Double anadirProducto(@RequestBody CocheDTO coche){
	        Double precioTotal=negocioDAO.obtenerPrecioFinal(coche) ;
	        return precioTotal;

	    }

}
