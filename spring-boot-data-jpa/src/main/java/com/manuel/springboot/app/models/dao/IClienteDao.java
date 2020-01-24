package com.manuel.springboot.app.models.dao;


import org.springframework.data.repository.PagingAndSortingRepository;

import com.manuel.springboot.app.models.entity.Cliente;

public interface IClienteDao extends PagingAndSortingRepository<Cliente, Long>{

	
	
}
