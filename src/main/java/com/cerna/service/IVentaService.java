package com.cerna.service;

import com.cerna.model.Venta;

public interface IVentaService extends ICRUD<Venta, Integer> {
	
	Venta registrarTransaccional(Venta venta) throws Exception;

}
