/**
 * 
 */
package com.rodri.carricoche.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.rodri.carricoche.entities.AnuncioEntity;
import com.rodri.carricoche.entities.ProvinciaEntity;
import com.rodri.carricoche.repositories.AnuncioRepository;
import com.rodri.carricoche.repositories.ProvinciaRepository;

/**
 * @author rodri
 *
 */

@RestController
@RequestMapping("/v1")
@CrossOrigin(origins = "*", methods = {RequestMethod.GET, RequestMethod.POST, RequestMethod.DELETE, RequestMethod.PUT})
public class AnuncioRestCont {
	
	@Autowired
	private AnuncioRepository anuncioRepository;
	
	@Autowired
	private ProvinciaRepository provinciaRepository;
	
	@PostMapping(value = "/anuncios")
	public ResponseEntity <String> insertarAnuncio(@RequestBody AnuncioEntity anuncio){
		anuncioRepository.save(anuncio);	
		return new ResponseEntity<>("Anuncio añadido correctamente", HttpStatus.OK);
	}
	
	@GetMapping(value = "/anuncios")
	public Iterable<AnuncioEntity> listarAnuncios(){
		return anuncioRepository.findAll();
	}
	
	@GetMapping(value = "/provincias")
	public Iterable<ProvinciaEntity> listarProvincias(){
		return provinciaRepository.findAll();
	}
	
	@PutMapping(value = "/anuncios/{id_anuncio}")
	public ResponseEntity<String> actualizarAnuncio(@RequestBody AnuncioEntity anuncio){
		anuncioRepository.save(anuncio);
		return new ResponseEntity<>("Anuncio actualizado correctamente", HttpStatus.OK);
	}
	
	@DeleteMapping(value = "/anuncios/{id_anuncio}")
	public ResponseEntity<String> borrarAnuncio(@PathVariable("id_anuncio") Integer id_anuncio){
		anuncioRepository.deleteById(id_anuncio);
		return new ResponseEntity<>("Anuncio borrado correctamente", HttpStatus.OK);
	}
}
