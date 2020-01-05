package com.charter.customer;

import java.util.List;

public class CustomerInfo {
    String id;
    String name;
    List<Subscription> subscriptionList;

    public CustomerInfo() {

    }

    public CustomerInfo(String id, String name, List<Subscription> subscriptionList) {
        this.id = id;
        this.name = name;
        this.subscriptionList = subscriptionList;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setSubscriptionList(List<Subscription> subscriptionList) {
        this.subscriptionList = subscriptionList;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public List<Subscription> getSubscriptionList() {
        return subscriptionList;
    }
}
