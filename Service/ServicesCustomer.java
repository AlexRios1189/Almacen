package com.accenture.Almacen.Service;

import com.accenture.Almacen.Models.Customer;

public class ServicesCustomer {
	
private Customer[] customer;
	
	public ServicesCustomer() {
			this.customer = new Customer[5];
	}
	
	public ServicesCustomer(int tamanio) {
		this.customer = new Customer[tamanio];
		}

	String id;
	
	public void AddCustomer(Customer c) {            //Agrega un nuevo cliente
		if(existCustomer(c)) {
			System.out.println("El cliente ya existe");
		}else {
			boolean encontrado = false;
			for(int i = 0; i<customer.length && !encontrado; i++) {
				if(customer[i] == null) {
					customer[i] = c;
					encontrado = true;
				}
			}
		}
		
		
		
	}
	
	public boolean existCustomer(Customer c) {             //Verifica si ya hay un cliente con la misma cedula
		for(int i = 0; i<customer.length; i++) {
			if(customer[i] !=null && c.equals(customer[i])) {
				return true;	
			}
		}
		
		return false;
		}
	
	
	public void ListCustomer(Customer c) {          //Lista todos los clientes
		for(int i=0; i<customer.length; i++) {
			System.out.println(customer[i]);
		}
	}
	
	public void DeleteCustomer(Customer c) {              //Elimina un cliente
		boolean encontrado = false;
		for(int i = 0; i<customer.length; i++) {
			if(customer[i] != null && customer[i].equals(c)) {
				customer[i] = null;
			}
		}
		
	}
}
