package com.cerna.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cerna.model.Producto;
import com.cerna.repo.IGenericRepo;
import com.cerna.repo.IProductoRepo;
import com.cerna.service.IProductoService;

@Service
public class ProductoServiceImpl extends CRUDImpl<Producto, Integer> implements IProductoService {

	@Autowired
	private IProductoRepo repo;
	
	@Override
	protected IGenericRepo<Producto, Integer> getRepo(){
		return repo;
	}
	
}
