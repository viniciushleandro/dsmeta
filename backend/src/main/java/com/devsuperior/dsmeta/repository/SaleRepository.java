package com.devsuperior.dsmeta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.devsuperior.dsmeta.entities.Sale;


public interface SaleRepository extends JpaRepository<Sale, Long>{

}
