package com.ecommerce.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.Entity.EcommerceEntity;

@Repository

public interface RepositoryEcom extends JpaRepository<EcommerceEntity, Integer>{

}
