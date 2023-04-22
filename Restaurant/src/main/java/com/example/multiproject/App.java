package com.example.multiproject;

import com.example.common.App_Parent;

public class App extends App_Parent {

    @Override
    public void onCreate() {
        super.onCreate();

        reviewClass = ReviewActivity_Restaurant.class;

    }
}
