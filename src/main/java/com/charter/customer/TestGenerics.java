package com.charter.customer;

public class TestGenerics {
    public static void main(String[] args) {
        TestGenerics testGenerics = new TestGenerics();
        System.out.println("True Eligible:"+ testGenerics.runEligibilty(true));
        System.out.println("False Eligible:"+ testGenerics.runEligibilty(false));
        System.out.println("Blacklist Eligible:"  + testGenerics.runEligibilty(new BlackList()));
        System.out.println("Whitelist Eligible:"  + testGenerics.runEligibilty(new Whitelist()));
    }

    public <T> boolean runEligibilty(T allowedrestrtiction) {
        if (allowedrestrtiction instanceof Boolean) {
            System.out.println("Instance is boolean");
            return (Boolean)allowedrestrtiction;
        } else {
            if (allowedrestrtiction instanceof  RestrictionType) {
                 if ( allowedrestrtiction instanceof  BlackList) {
                     System.out.println("Instance is Blacklist");
                     return false;
                 } else if (allowedrestrtiction instanceof  Whitelist) {
                     System.out.println("Instance is whitelist");
                     return true;
                 }
            }
        }

        return true;
    }


}

 interface RestrictionType {

 }

 class BlackList implements RestrictionType {

 }

 class Whitelist implements RestrictionType {

 }
