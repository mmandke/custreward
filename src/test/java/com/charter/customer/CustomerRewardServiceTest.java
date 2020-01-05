package com.charter.customer;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerRewardServiceTest {

     @Autowired
     CustomerRewardService customerRewardService;

     @Test
     public void testCustomerRewardService() {

          //CustomerRewardService customerRewardService = new CustomerRewardService();
          CustomerReward customerReward = customerRewardService.calculateRewards("custId1");

          System.out.println("Custormer Avg Reward: " + customerReward.getAverageRewardsPerMonth());
          System.out.println("Custormer Total Reward: " + customerReward.getTotalRewards());

          customerReward = customerRewardService.calculateRewards("custId2");
          System.out.println("Custormer Avg Reward: " + customerReward.getAverageRewardsPerMonth());
          System.out.println("Custormer Total Reward: " + customerReward.getTotalRewards());


     }
}
