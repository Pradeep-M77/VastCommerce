package com.vast.vo;

public class Product {

	private int product_Id;
	private String product_Name;
	private double product_Price;
	private String product_Category;
	
	
	public int getProduct_Id() {
		return product_Id;
	}
	public void setProduct_Id(int product_Id) {
		this.product_Id = product_Id;
	}
	public String getProduct_Name() {
		return product_Name;
	}
	public void setProduct_Name(String product_Name) {
		this.product_Name = product_Name;
	}
	public double getProduct_Price() {
		return product_Price;
	}
	public void setProduct_Price(double product_Price) {
		this.product_Price = product_Price;
	}
	public String getProduct_Category() {
		return product_Category;
	}
	public void setProduct_Category(String product_Category) {
		this.product_Category = product_Category;
	}
	
	
	@Override
	public String toString() {
		return "Product [product_Id=" + product_Id + ", product_Name=" + product_Name + ", product_Price="
				+ product_Price + ", product_Category=" + product_Category + "]";
	}	

}
