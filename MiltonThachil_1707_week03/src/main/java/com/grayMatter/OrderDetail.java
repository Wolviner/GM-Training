package com.grayMatter;

public class OrderDetail {
    private int orderId;
    private String date;
    private int itemId;
    private int quantity;
    private double cost;

    // Constructors
    public OrderDetail() {}

    public OrderDetail(int orderId, String date, int itemId, int quantity, double cost) {
        this.orderId = orderId;
        this.date = date;
        this.itemId = itemId;
        this.quantity = quantity;
        this.cost = cost;
    }

    // Getters and Setters
    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public int getItemId() {
        return itemId;
    }

    public void setItemId(int itemId) {
        this.itemId = itemId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
