package pe.edu.upc.EsquivelDiego.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.upc.EsquivelDiego.entities.VehicleEntity;

@Repository
public interface VehicleRepository extends JpaRepository<VehicleEntity, Integer>{

}
