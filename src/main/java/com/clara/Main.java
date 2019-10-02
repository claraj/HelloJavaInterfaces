package com.clara;

public class Main {

    public static void main(String[] args) {
        
        Human human = new Human();
        Cat maru = new Cat("Maru", human);
        
        maru.wantFood();
        
        CatFoodDispenser catFoodDispenser = new CatFoodDispenser();
        Cat nala = new Cat("Nala", catFoodDispenser);
        
        nala.wantFood();
    }
}
