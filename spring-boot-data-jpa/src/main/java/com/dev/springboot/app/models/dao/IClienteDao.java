package com.dev.springboot.app.models.dao;

import java.util.List;

import com.dev.springboot.app.models.entity.Cliente;

public interface IClienteDao {

	public List<Cliente> findAll();
	
}