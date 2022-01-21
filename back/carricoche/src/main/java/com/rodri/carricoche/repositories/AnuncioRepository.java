/**
 * 
 */
package com.rodri.carricoche.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rodri.carricoche.dtos.AnuncioDTO;
import com.rodri.carricoche.entities.AnuncioEntity;

/**
 * @author rodri
 *
 */
@Repository
public interface AnuncioRepository extends CrudRepository<AnuncioEntity, Integer>{
	
	@Query(value = "select new com.rodri.carricoche.dtos.AnuncioDTO (a.id_anuncio, a.coche, p.nombre, p.id_provincia,"
			+ "a.telefono, a.correo_electronico, a.precio, a.segunda_mano) FROM com.rodri.carricoche.entities.AnuncioEntity a,"
			+ "com.rodri.carricoche.entities.ProvinciaEntity p WHERE a.id_provincia = p.id_provincia AND"
			+ "(a.id_anuncio LIKE CONCAT ('%', :id_anuncio,'%') or :id_anuncio IS NULL) AND a.coche LIKE CONCAT ('%',:coche,'%')")
				List<AnuncioDTO>buscaAnuncioPorIdyCoche(@Param("id_anuncio") Integer id_anuncio, @Param("coche")String coche);
	
	@Query(value = "select new com.rodri.carricoche.dtos.AnuncioDTO (a.id_anuncio, a.coche, p.nombre, p.id_provincia,"
			+ "a.telefono, a.correo_electronico, a.precio, a.segunda_mano) FROM com.rodri.carricoche.entities.AnuncioEntity a,"
			+ "com.rodri.carricoche.entities.ProvinciaEntity p WHERE a.id_provincia = p.id_provincia AND"
			+ "(a.id_anuncio LIKE CONCAT ('%', :id_anuncio,'%') or :id_anuncio IS NULL)")
				List<AnuncioDTO>buscaAnuncioPorId(@Param("id_anuncio") Integer id_anuncio);
}
