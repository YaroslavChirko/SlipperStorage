package com.slippers.micro.data.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Id;
/**
 * 
 * @author erick
 * Entity model class to represent slippers in database.<br/>
 * Can be fitted to either of the legs or fit both.<br/>
 * Contains enums for type and side fields.
 */
@Entity
public class Slipper {

	@Id
	private String name;
	
	@Enumerated
	private Side side;
	
	@Enumerated
	private Type type;
	private float price;
	
	public Slipper () {}
	 /**
	  * 
	  * @param name
	  * @param side
	  * @param type
	  * @param price
	  * 
	  * All args constructor, the price is changed by random amount (price change, discount)
	  */
	public Slipper (String name, Side side, Type type, float price){
		
		this.name = name;
		this.side = side;
		this.type = type;
		this.price = price + (float)Math.random()*5-1;
	} 
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Side getSide() {
		return side;
	}
	public void setSide(Side side) {
		this.side = side;
	}
	public Type getType() {
		return type;
	}
	public void setType(Type type) {
		this.type = type;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	
	@Override
	public String toString() {
		return "slipper: {name: "+name+", side: "+side.toString()+", type: "+type.toString()+", price: "+price+"}";
	}



	public enum Side {
		LEFT, RIGHT, UNIFORM;
	}
	
	public enum Type {
		CLASSIC, MULE, CLOG, TOEPOST, MOCCASIN, SANDAL;
	}
}
