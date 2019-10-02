package com.clara;

/**
 * Created by clara on 10/2/19.
 */
public class Human implements CatFeeder {
    @Override
    public void feedMe(String catName) {
        System.out.println("Opened can of cat food for " + catName);
    }
}
