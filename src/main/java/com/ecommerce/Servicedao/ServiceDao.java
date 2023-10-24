package com.ecommerce.Servicedao;

import java.util.List;

import com.ecommerce.Entity.EcommerceEntity;

public abstract class ServiceDao {
	
	public abstract EcommerceEntity insertecomEntity(EcommerceEntity ecomsave);
	
	public abstract List<EcommerceEntity> getAllEcommerceRecord();
	
	public abstract EcommerceEntity FindEcomRecordid(int id);
	
	public abstract String deleteEcomRecord(int id);
	

}
