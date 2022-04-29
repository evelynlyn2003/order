package com.fju.order;

public class Order {
    public int shipFeed;
    int amount;
    Delivery delivery;

    public Order(int amount, Delivery delivery) {
        this.amount = amount;
        this.delivery = delivery;
    }

    public int total() {
        return 0;
    }
}
