package com.example.recipes;


import com.example.common.App_Parent;

public class App extends App_Parent {

    @Override
    public void onCreate() {
        super.onCreate();

        reviewClass = ReviewActivity_Recipes.class;

    }
}
