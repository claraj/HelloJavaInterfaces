package com.clara;

/**
 * Created by clara on 10/2/19.
 */
public class CatFoodDispenser implements CatFeeder {
    
    @Override
    public void feedMe(String catName) {
        System.out.println("Dispensed measured quantity of food for " +catName+ ". Beep.");
    }
}
