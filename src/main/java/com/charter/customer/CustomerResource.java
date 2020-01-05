package com.charter.customer;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.ZonedDateTime;

@RestController
@RequestMapping("/rewards")
public class CustomerResource {

    @Autowired
    private CustomerRewardService customerRewardService;

    @GetMapping("/{id}")
    public ResponseEntity<CustomerReward> getCustomerRewards(@PathVariable String id) {

        CustomerReward customerReward = customerRewardService.calculateRewards(id);
        if (customerReward != null) {
            return ResponseEntity.ok(customerReward);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
