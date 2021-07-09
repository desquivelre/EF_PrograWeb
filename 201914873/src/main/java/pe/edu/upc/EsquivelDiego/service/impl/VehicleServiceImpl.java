package pe.edu.upc.EsquivelDiego.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Service;

import pe.edu.upc.EsquivelDiego.entities.VehicleEntity;
import pe.edu.upc.EsquivelDiego.repository.VehicleRepository;
import pe.edu.upc.EsquivelDiego.service.VehicleService;


@Service
public class VehicleServiceImpl implements VehicleService {

	@Autowired
	private VehicleRepository customerRepository;

	@Override
	public JpaRepository<VehicleEntity, Integer> getRepository() {
		// TODO Auto-generated method stub
		return customerRepository;
	}


	
}
