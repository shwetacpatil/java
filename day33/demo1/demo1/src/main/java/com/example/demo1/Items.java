package com.example.demo1;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Items {
@Id

private int items_id;
private String items_des;
private int items_cost;

@ManyToOne
@JoinColumn(name="cart_id")
private Cart cart_obj;
public Items() {
	
}
public int getItems_id() {
	return items_id;
}
public void setItems_id(int items_id) {
	this.items_id = items_id;
}
public String getItems_des() {
	return items_des;
}
public void setItems_des(String items_des) {
	this.items_des = items_des;
}
public int getItems_cost() {
	return items_cost;
}
public void setItems_cost(int items_cost) {
	this.items_cost = items_cost;
}
public Cart getCart_obj() {
	return cart_obj;
}
public void setCart_obj(Cart cart_obj) {
	this.cart_obj = cart_obj;
}
public Items(int items_id, String items_des, int items_cost, Cart cart_obj) {
	super();
	this.items_id = items_id;
	this.items_des = items_des;
	this.items_cost = items_cost;
	this.cart_obj = cart_obj;
}
	
}
