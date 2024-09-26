package com.vast.vo;

public class Order {

	private int order_Id;
	private int user_Id;
	private int product_Id;
	private double total_Price;
	
	public int getOrder_Id() {
		return order_Id;
	}
	public void setOrder_Id(int order_Id) {
		this.order_Id = order_Id;
	}
	public int getUser_Id() {
		return user_Id;
	}
	public void setUser_Id(int user_Id) {
		this.user_Id = user_Id;
	}
	public int getProduct_Id() {
		return product_Id;
	}
	public void setProduct_Id(int product_Id) {
		this.product_Id = product_Id;
	}
	public double getTotal_Price() {
		return total_Price;
	}
	public void setTotal_Price(double total_Price) {
		this.total_Price = total_Price;
	}
	
	@Override
	public String toString() {
		return "Order [order_Id=" + order_Id + ", user_Id=" + user_Id + ", product_Id=" + product_Id + ", total_Price="
				+ total_Price + "]";
	}

}
