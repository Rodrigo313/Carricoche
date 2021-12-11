/**
 * 
 */
package com.rodri.carricoche.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.rodri.carricoche.dtos.ComboDTO;
import com.rodri.carricoche.entities.ProvinciaEntity;

/**
 * @author rodri
 *
 */
@Repository
public interface ProvinciaRepository extends CrudRepository<ProvinciaEntity, Integer>{
	
	@Query(value = "select new com.rodri.carricoche.dtos.ComboDTO (p.id_provincia, p.nombre) "
			+ "FROM com.rodri.carricoche.entities.ProvinciaEntity p "
			+ "WHERE (p.id_provincia LIKE CONCAT ('%',:id_provincia,'%') or :id_provincia is null)"
			+ "AND p.nombre LIKE CONCAT ('%',:nombre,'%')")
				List<ComboDTO>buscaProvinciaPorIdyNombre(@Param("id_provincia") Integer id_provincia, @Param("nombre") String nombre);	
}
