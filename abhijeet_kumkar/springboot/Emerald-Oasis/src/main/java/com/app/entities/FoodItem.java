package com.app.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="fooditem")
public class FoodItem {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private int foodItemId;
	private String name;
	private String image;
	private double price;
	private int quantity;
	@ManyToOne
	@JoinColumn(name = "cuisineId")
	private Cuisine cuisine;
	
	public FoodItem() {
		
	}

	public FoodItem(int foodItemId, String name, String image, double price, int quantity) {
		super();
		this.foodItemId = foodItemId;
		this.name = name;
		this.image = image;
		this.price = price;
		this.quantity = quantity;
	}

	public int getFoodItemId() {
		return foodItemId;
	}

	public void setFoodItemId(int foodItemId) {
		this.foodItemId = foodItemId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public Cuisine getCuisine() {
		return cuisine;
	}

	public void setCuisine(Cuisine cuisine) {
		this.cuisine = cuisine;
	}

	@Override
	public String toString() {
		return "FoodItem [foodItemId=" + foodItemId + ", name=" + name + ", image=" + image + ", price=" + price
				+ ", quantity=" + quantity + "]";
	}
	
	
	
	
}
