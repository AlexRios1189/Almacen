package com.accenture.Almacen.Models;

public class Order{
	
	private int orderId;
	private int hStart;
	private int hEdit;
    private int hDelete;
	private int delivery = 2000;
	private double totalValue;
	private double netValue;
	private int price;
	private int quantity;
	private final double iva = 0.019;
	
	public Order() {
		
	}
	
	
	
	public Order(int price, int quantity, int hStart){
		
		this.price = price;
		this.quantity = quantity;
		this.hStart = hStart;
	}

	

	public Order(int orderId, int hStart, int hEdit, int hDelete, int delivery, double totalValue, double netValue,
			int price, int quantity) {

		this.orderId = orderId;
		this.hStart = hStart;
		this.hEdit = hEdit;
		this.hDelete = hDelete;
		this.delivery = delivery;
		this.totalValue = totalValue;
		this.netValue = netValue;
		this.price = price;
		this.quantity = quantity;
	}



	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public int gethStart() {
		return hStart;
	}

	public void sethStart(int hStart) {
		this.hStart = hStart;
	}

	public int gethEdit() {
		return hEdit;
	}

	public void sethEdit(int hEdit) {
		this.hEdit = hEdit;
	}

	public int gethDelete() {
		return hDelete;
	}

	public void sethDelete(int hDelete) {
		this.hDelete = hDelete;
	}

	public int getDelivery() {
		return delivery;
	}
	

public double getTotalValue() {
		return totalValue;
	}

	public void setTotalValue(double totalValue) {
		this.totalValue = totalValue;
	}
	
	

public double getNetValue() {
		return netValue;
	}

	public void setNetValue(double netValue) {
		this.netValue = netValue;
	}
	
	

public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}



	public int getQuantity() {
		return quantity;
	}



	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}



	public double getIva() {
		return iva;
	}



public boolean equals(Order o) {
		
		if(this.orderId == o.getOrderId()) {
			return true;
		}
		
		return false;
		
	}

public String GeneratedOrder() {
	
	if(price * quantity >= 70000) {
	
		netValue = price * quantity;
		
		totalValue = netValue + (netValue * iva) +delivery;
			
	}if(price* quantity > 100000) {
		
		delivery = 0;
		
		netValue = price * quantity;
		
		totalValue = netValue + (netValue * iva);	
		
	}
	
	return "El valor de los productos es de: " + netValue +
			"El IVA es de: " + netValue* iva +
			"El total de su compra es de: " + totalValue ;
	
}

public void setDelivery(int delivery) {
	this.delivery = delivery;
}



@Override
public String toString() {
	return "orderId= " + orderId + ", Domicilio= " + delivery + ", Valor Total =" + totalValue + ", Valor Neto= " + netValue + ", Precio= " + price
			+ ", Cantidad= " + quantity;
}






	
	
}
