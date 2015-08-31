package com.ggl.mule;

import java.io.Serializable;

import com.fasterxml.jackson.annotation.JsonAutoDetect;


@JsonAutoDetect
public class ProductOrder {
	
	private long orderId;
	private String productId;
	private long quantity;
	
	public long getOrderId() {
		return orderId;
	}
	public void setOrderId(long orderId) {
		this.orderId = orderId;
	}
	public String getProductId() {
		return productId;
	}
	public void setProductId(String productId) {
		this.productId = productId;
	}
	public long getQuantity() {
		return quantity;
	}
	public void setQuantity(long quantity) {
		this.quantity = quantity;
	}
	
	

}
