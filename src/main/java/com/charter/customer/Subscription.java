package com.charter.customer;


public class Subscription {
    String month;
    int amountSpent;

    public Subscription(String month, int amountSpent) {
        this.month = month;
        this.amountSpent = amountSpent;
    }

    public String getMonth() {
        return month;
    }

    public int getAmountSpent() {
        return amountSpent;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public void setAmountSpent(int amountSpent) {
        this.amountSpent = amountSpent;
    }
}
