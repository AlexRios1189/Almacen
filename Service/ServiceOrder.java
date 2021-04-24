package com.accenture.Almacen.Service;

import com.accenture.Almacen.Models.Order;


public class ServiceOrder {
	
	private Order[] order;
	
	public ServiceOrder() {
		this.order = new Order[5];
		
			}
	
	public ServiceOrder(int tamanio) {
		this.order = new Order[tamanio];
		
	}
	
	public void AddOrder(Order o) {          //Agrega una orden
		if(existOrder(o)) {
			System.out.println("El cliente ya existe");
		}else {
			boolean encontrado = false;
			for(int i = 0; i<order.length && !encontrado; i++) {
				if(order[i] == null) {
					order[i] = o;
					encontrado = true;
				}
			}
		}
		
	}
	
	public boolean existOrder(Order o) {              //Verifica si hay una ordern existente
		for(int i = 0; i<order.length; i++) {
			if(order[i] !=null && o.equals(order[i])) {
				return true;	
			}
		}
		
		return false;
		}
	

	public void ListOrders(Order o) {            //Me lista todas las orden que hay
		for(int i=0; i<order.length; i++) {
			System.out.println(order[i]);
		}
	}
	
	public void DeleteOrder(Order o) {          //Elimina una orden
		boolean encontrado = false;
		for(int i = 0; i<order.length; i++) {
			if(order[i] != null && order[i].equals(o)) {
				order[i] = null;
			}
		}
		
	}
	
	

}
