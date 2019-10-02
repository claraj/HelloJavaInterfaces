package com.clara;

import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 * Created by clara on 2019-09-26.
 */
public class Cat {
    
    String name;
    CatFeeder foodSupply;
    
    /* Cat just wants something that can feed it. Doesn't care if human or automatic
    cat food dispenser or whatever.
    */
    Cat(String name, CatFeeder foodSupply) {
        this.name = name;
        this.foodSupply = foodSupply;
        
        int hungryInterval = new Random().nextInt(2000);
        
        Timer isHungry = new Timer();
        isHungry.scheduleAtFixedRate(new TimerTask() {
            @Override
            public void run() {
                Cat.this.wantFood();
            }
        }, 0, hungryInterval);   // Call the wantFood method at regular intervals
    }
    
    public void wantFood() {
        foodSupply.feedMe(name);   // Call the foodSupply's feed method
    }
    
}
