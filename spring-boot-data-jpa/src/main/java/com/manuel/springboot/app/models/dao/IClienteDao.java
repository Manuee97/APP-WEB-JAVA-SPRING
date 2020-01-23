package com.manuel.springboot.app.models.dao;

import java.util.List;

import com.manuel.springboot.app.models.entity.Cliente;

public interface IClienteDao {

	public List<Cliente> findAll();
	
}
