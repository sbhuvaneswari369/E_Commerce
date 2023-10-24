package com.ecommerce.ServiceImplementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.Entity.EcommerceEntity;
import com.ecommerce.Repository.RepositoryEcom;
import com.ecommerce.Servicedao.ServiceDao;

@Service
public class ServiceEcom extends ServiceDao{
	@Autowired
	RepositoryEcom repo;

	@Override
	public EcommerceEntity insertecomEntity(EcommerceEntity ecomsave) {
		return repo.save(ecomsave);
	}

	@Override
	public List<EcommerceEntity> getAllEcommerceRecord() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public EcommerceEntity FindEcomRecordid(int id) {
		// TODO Auto-generated method stub
		return repo.findById(id).get();
	}

	@Override
	public String deleteEcomRecord(int id) {
		// TODO Auto-generated method stub
		repo.deleteById(id);
		return "Deleted Successfully";
	}

	
}
	