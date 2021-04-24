package com.accenture.Almacen;


import java.util.Scanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.accenture.Almacen.Models.Customer;
import com.accenture.Almacen.Models.Order;
import com.accenture.Almacen.Service.ServiceOrder;
import com.accenture.Almacen.Service.ServicesCustomer;


@SpringBootApplication
public class AlmacenApplication {

	public static void main(String[] args) {
		
		Scanner lector = new Scanner(System.in);
		
		 int inicio = 0;
	     int seleccion = 0;
	     
	     ServiceOrder order = new ServiceOrder();
	     Customer customer = new Customer();
	     ServicesCustomer c = null;
	     
	     
	     String id = null;
	     String name = null;
	     String address = null;
	     int price = 0;
	     int quantity = 0;
	     int hStart = 0;
	     int orderId = 0;
	     int hDelete = 0;
	     double newTotal = 0;
	     
	     Order o = null;
	     
	     
	     do {
	            do {
	                System.out.println("Selecciones una opcion: ");
	                System.out.println(" 1. Agregar Pedido");
	                System.out.println(" 2. Listar Pedido");
	                System.out.println(" 3. Eliminar Pedido");
	                System.out.println(" 4. Salir");
	                seleccion = lector.nextInt();

	                if (seleccion >= 1 && seleccion <= 4) {
	                    inicio = 1;
	                } else {
	                    System.out.println("Esta opcion no esta disponible elija entre 1 y 4");
	                }

	            } while (inicio == 0);
	            
	            switch (seleccion) {
	                case 1:
	                	
	                	
	                    System.out.println("Escribe precio");
	                    price = lector.nextInt();
	                    System.out.println("Escribe cantidad");
	                    quantity = lector.nextInt();
	                    System.out.println("Escribe hora de la compra");
	                    hStart = lector.nextInt();
	                    
	                    
	                   o = new Order(price, quantity, hStart);
	                   order.AddOrder(o);
	                   
	                   System.out.println(o.GeneratedOrder());
	                   
	                	
	                    
	                    break;
	                case 2:
	                	order.ListOrders(o);
	                    
	                    
	                    break;
	                case 3:
	                	
	                		System.out.println("Escribe hora para eliminar el pedido");
	                		hDelete = lector.nextInt();
	                		
	                	if(hDelete - hStart < 12) {	
	                		
	                		
	                	System.out.println("Digite el codigo del pedido para eliminar");
	                	orderId = lector.nextInt();
	                  order.DeleteOrder(o);
	                  
	                	}if(hDelete - hStart > 12) {
	                		
	                		newTotal = o.getTotalValue() * 0.10;
	                		
	                		System.out.println("El pedido está cancelado, y como canceló despues de"
	                				+ " 12 horas, debe pagar una parte del pedido: " + newTotal);
	                		
	                	}
	                	
	               
	                    
	                    break;
	                case 4:
	                    System.out.println("Muchas gracias!!!");
	                    inicio = 2;
	                    break;
	                default:
	                    break;
	            }
	            
	        } while (inicio != 2);
	    }
	    


	}



