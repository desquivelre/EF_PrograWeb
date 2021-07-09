package pe.edu.upc.EsquivelDiego.controller;

import java.util.List;
import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import pe.edu.upc.EsquivelDiego.entities.VehicleEntity;
import pe.edu.upc.EsquivelDiego.service.VehicleService;



@Controller
@RequestMapping("/")
public class VehicleController {

	@Autowired
	private VehicleService vehicleService;
	
	
	 @GetMapping
	    public String mostrar(Model model) {
		 	try {
				
				VehicleEntity vehicle = new VehicleEntity();

				model.addAttribute("newVehicle", vehicle);
			
			} catch (Exception e) {
				e.printStackTrace();
				System.err.println(e.getMessage());
			}
		 
	     return "index.html";
	    }
	
		
	 @PostMapping("/new")
		public String newVehicle(@Valid @ModelAttribute("newVehicle") VehicleEntity vehicle, BindingResult result, Model model)  throws Exception {
		
			if(result.hasErrors()) {
				
				return "/index.html";
			}else {
				
				
				List<VehicleEntity> numVehicle = vehicleService.getAll();
				vehicle.setEridVehicle(numVehicle.size()+1);
				          
	            VehicleEntity customerReturn = vehicleService.create(vehicle);
	            
			}
		
			return "/index.html";
		}
	
	@GetMapping("/list")
		public String listar(Model model) { 	
			 try {
				List<VehicleEntity> list = vehicleService.getAll();
				model.addAttribute("vehicles", list);
				
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		     return "list.html";
		}
		
}

