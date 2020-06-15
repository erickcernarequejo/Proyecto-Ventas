package com.cerna.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cerna.model.Venta;
import com.cerna.repo.IGenericRepo;
import com.cerna.repo.IVentaRepo;
import com.cerna.service.IVentaService;

@Service
public class VentaServiceImpl extends CRUDImpl<Venta, Integer> implements IVentaService {

	@Autowired
	private IVentaRepo repo;
	
	@Override
	protected IGenericRepo<Venta, Integer> getRepo(){
		return repo;
	}
	
	@Override
	public Venta registrarTransaccional(Venta venta) throws Exception {
		venta.getDetalleVenta().forEach(det -> det.setVenta(venta));
		return repo.save(venta);
	}
	
	
	
}
