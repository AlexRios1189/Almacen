package com.example.almacen.model;

public class Product {

	public int orderID;
	public int productId;
	public String name;
    public double price;
    public int quantity;
    public double delivery = 2000;
    public double grossTotal;
    public double netTotal;
    public int timeStart;
    public int timeEdit;
    public int timeDelete;
    public int price2;
    


	public int getOrderID() {
		return orderID;
	}


	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}


	public double getNetTotal() {
		return netTotal;
	}


	public void setNetTotal(double netTotal) {
		this.netTotal = netTotal;
	}


	public void setDelivery(double delivery) {
		this.delivery = delivery;
	}
	public final double iva = 0.19;
    
    
    
    
    public double getDelivery() {
		return delivery;
	}

	
	public double getIva() {
		return iva;
	}
	
	
	public Double getGrossTotal() {
		
		return grossTotal;
	}
	
	public void setGrossTotal(double grossTotal) {
		this.grossTotal = grossTotal;
		
		}

	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	
	
	
	public int getTimeStart() {
		return timeStart;
	}


	public void setTimeStart(int timeStart) {
		this.timeStart = timeStart;
	}


	public int getTimeEdit() {
		return timeEdit;
	}


	public void setTimeEdit(int timeEdit) {
		this.timeEdit = timeEdit;
	}


	public int getTimeDelete() {
		return timeDelete;
	}


	public void setTimeDelete(int timeDelete) {
		this.timeDelete = timeDelete;
	}


	public int getPrice2() {
		return price2;
	}


	public void setPrice2(int price2) {
		this.price2 = price2;
	}

	
	
	
	

	@Override
	public String toString() {
		return "orderID=" + orderID + ", productId=" + productId + ", name=" + name + ", price=" + price
				+ ", quantity=" + quantity;
	}


	public String Bill() {                 //Metodo que muestra el valor de la factura
		netTotal = quantity * price;
		
		if(price * quantity >=70000 && price * quantity < 100000) {
			
			grossTotal = netTotal+(netTotal*iva)+delivery;
			
		}if(price * quantity >= 100000) {
			delivery = 0;
			grossTotal = netTotal+(netTotal*iva);
			
		}if(price * quantity >= 10000 && price * quantity < 70000 ) {
			
			grossTotal = netTotal + getDelivery();
		}
		
		return "Su valor es de: " + (quantity * price) + " "+
				"Iva: " + (netTotal*iva) + " " +
				"Domicilio: " + delivery + " " +
				"Su cuenta total es de: " + grossTotal;
	}
	

	
}


