package com.charter.customer;

import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.*;

@Component
public class CustomerDataStore {

     Map<String, CustomerInfo>  customerMap = new HashMap<>();

     @PostConstruct
     public  void init() {

          customerMap.put ("custId1", new CustomerInfo("custId1", "customer1", Arrays.asList(
                  new Subscription( "Jan", 120) ,
                  new Subscription( "Feb", 60) ,
                  new Subscription( "March", 120) ,
                  new Subscription( "Jan", 60) ,
                  new Subscription( "Feb", 120) ,
                  new Subscription( "March", 60) ,
                  new Subscription( "Jan", 60) ,
                  new Subscription( "Feb", 120) ,
                  new Subscription( "March", 60) ,
                  new Subscription( "March", 40))));
          customerMap.put ("custId2",  new CustomerInfo("custId2", "customer2", Arrays.asList(
                  new Subscription( "Jan", 140) ,
                  new Subscription( "Feb", 70) ,
                  new Subscription( "March", 140) ,
                  new Subscription( "Jan", 70) ,
                  new Subscription( "Feb", 140) ,
                  new Subscription( "March", 70) ,
                  new Subscription( "Jan", 140) ,
                  new Subscription( "Feb", 70) ,
                  new Subscription( "Match", 45))));
          customerMap.put ("custId3",  new CustomerInfo("custId3", "customer3", Arrays.asList(
                  new Subscription( "Jan", 130) ,
                  new Subscription( "Feb", 75) ,
                  new Subscription( "Jan", 130) ,
                  new Subscription( "Feb", 75) ,
                  new Subscription( "Jan", 130) ,
                  new Subscription( "Feb", 75) ,
                  new Subscription( "Jan", 130) ,
                  new Subscription( "Feb", 75) ,
                  new Subscription( "March", 38))));
    }

     CustomerInfo getCustomerInfo(String custId) {
           return customerMap.get(custId);
     }

     List<CustomerInfo> getAllCustomers() {

          List<CustomerInfo> customerInfos = new ArrayList<>();

          customerMap.forEach((k,v) -> customerInfos.add(v));

          return customerInfos;

     }



}
