package com.charter.customer;

import java.util.Map;

public class CustomerReward {

    private String customerId;
    private String customerName;
    private double averageRewardsPerMonth;
    private int totalRewards;

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public void setAverageRewardsPerMonth(double averageRewardsPerMonth) {
        this.averageRewardsPerMonth = averageRewardsPerMonth;
    }

    public void setTotalRewards(int totalRewards) {
        this.totalRewards = totalRewards;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public double getAverageRewardsPerMonth() {
        return averageRewardsPerMonth;
    }

    public int getTotalRewards() {
        return totalRewards;
    }
}
