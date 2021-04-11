package com.example.almacen.model;


public class Order {
	
    private Product[] product;
    
    
    public Order(){
    this.product = new Product[5];
    }
    
    public Order(int tamanio){
        this.product = new Product[tamanio];
    }
    
    Product pro = new Product();
    
    public void agregarPedido(Product p){                //Agrega nuevo pedido
        if(existeProduct(p)){
            System.out.println("El cliente ya existe");
        }else{

        
        boolean encontrado = false;
        for(int i = 0; i<product.length && !encontrado; i++){
            if(product[i]==null){
                product[i]=p;
                encontrado = true;
            }
        }
        if(encontrado){
            System.out.println("Se ha agregado un nuevo pedido");
        }else{
            System.out.println("No se ha podido agregar al pedido");
        }
       }
    }
     
 public boolean existeProduct(Product p){                   //Revisa que no haya otro pedido igual
        
        for(int i = 0; i<product.length; i++){
            if(product[i] != null && p.equals(product[i])){
                return true;
            }
        }
        return false;
    }
   
   public void EliminarOrden(Product p){               //Elimina el pedido
    boolean encontrado = false;
   if(p.timeDelete - p.timeStart < 12) {
     for(int i = 0; i<product.length; i++){
         if(product[i]!=null && product[i].equals(p)){
        	 product[i]=null;
        	 
         }if(!encontrado){
             System.out.println("no se pudo eliminar al cliente");
         }
     }
     }
    
   }
   }

