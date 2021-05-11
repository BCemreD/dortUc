package dortUc.entities.concrete;

import dortUc.entities.IOrder;

public class Order implements IOrder {

	int orderId;
	String gameName;
	String gameCategory;
	int unitPrice;
	
	public Order(int orderId, String gameName, String gameCategory, int unitPrice) {
		super();
		this.orderId = orderId;
		this.gameName = gameName;
		this.gameCategory = gameCategory;
		this.unitPrice = unitPrice;
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getGameName() {
		return gameName;
	}

	public void setGameName(String gameName) {
		this.gameName = gameName;
	}

	public String getGameCategory() {
		return gameCategory;
	}

	public void setGameCategory(String gameCategory) {
		this.gameCategory = gameCategory;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}
}
