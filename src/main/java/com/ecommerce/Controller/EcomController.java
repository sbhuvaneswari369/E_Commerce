package com.ecommerce.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.ecommerce.Entity.EcommerceEntity;
import com.ecommerce.ServiceImplementation.ServiceEcom;

@RestController

public class EcomController {
	
	@Autowired
	public ServiceEcom service;
	
	@PostMapping("/Ecom_Store")
	public EcommerceEntity saveecom(@RequestBody EcommerceEntity e) {
		return service.insertecomEntity(e);
		
	}
	@GetMapping("/get_Ecom_Rec")
	public List<EcommerceEntity> getAllEcom(){
		return service.getAllEcommerceRecord();
		
	}
	@DeleteMapping("/Ecom_delete/{id}")
	public String deleteEcomid(@PathVariable int id) {
		return service.deleteEcomRecord(id);
		
	}

}
