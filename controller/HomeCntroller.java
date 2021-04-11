package com.example.almacen.controller;







import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.almacen.model.Customer;
import com.example.almacen.model.Product;



@RestController 
public class HomeCntroller {
	
	

	@GetMapping("/GenerateBill")
	public String GenerateBill() {
		
		Customer user = new Customer();
		Product product = new Product();
		
		
		user.setDocument("12345");
		user.setAddress("carrera 11#14-08");
		
	
		
	
		
		
		product.setProductId(101);
		product.setName("Camiseta Polo");
		product.setPrice(10000);
		product.setPrice2(5000);              //Datos predeterminados
		product.setQuantity(7);
		product.setDelivery(5000);
		product.setTimeStart(5);
		product.setTimeEdit(6);
	
		
	
			return product.Bill(); //Devuelve el valor del pedido
			
		
}

				
			
			
	}		
		
		
	
	
	
	
     
         
	

			
		
		
	
	


