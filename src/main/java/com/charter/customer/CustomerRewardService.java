package com.charter.customer;

import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.OptionalDouble;

@Service
public class CustomerRewardService implements RewardService {

    @Resource
    private CustomerDataStore customerDataStore;

    @Override
    public CustomerReward calculateRewards(String custId) {
        CustomerInfo customerInfo =  customerDataStore.getCustomerInfo(custId);

        CustomerReward customerReward = new CustomerReward();
        customerReward.setCustomerId(customerInfo.getId());
        customerReward.setCustomerName(customerInfo.getName());

        OptionalDouble optionalDouble = customerInfo.getSubscriptionList().stream().map(s-> this.calculateRewards(s.getAmountSpent())).mapToInt(v->v).average();

        if (optionalDouble.isPresent()) {
            customerReward.setAverageRewardsPerMonth(Math.round(optionalDouble.getAsDouble() * 100.00)/100.00);
        }

        int totalRewards = customerInfo.getSubscriptionList().stream().map(s-> this.calculateRewards(s.getAmountSpent())).mapToInt(v->v).sum();
        customerReward.setTotalRewards(totalRewards);

        return customerReward;
    }


    private int calculateRewards(int amountSpent) {
        int rewardPoints = 0;
        if ( amountSpent > 100) {
            rewardPoints += (amountSpent - 100) * 2;
        } else if ( amountSpent > 50) {
            rewardPoints += (amountSpent - 50) * 1;
        }
        return rewardPoints;
    }
}
