package com.example.multiproject;

import com.example.common.Item;
import com.example.common.ReviewActivity_Parent;
import com.example.common.UserReview;
import com.example.common.utils.DataMn;

import java.util.ArrayList;

public class ReviewActivity_Restaurant extends ReviewActivity_Parent {
    private DataMn dataMn;
    @Override
    protected void getData() {
        dataMn = DataMn.getInstance();
        ArrayList<Item> itemList  = new ArrayList<>();
        ArrayList<UserReview> list  = new ArrayList<>();
        list.add(new UserReview("Vladi",4,"Very good food and quit place"));
        list.add(new UserReview("James",3,"Regular food , nothing special"));
        list.add(new UserReview("Michael",1,"bad food "));
        itemList.add(new Item("GDB Burger",list));
        ArrayList<UserReview> list2  = new ArrayList<>();
        list2.add(new UserReview("Wade",4,"Very good food and quit place"));
        list2.add(new UserReview("Omer",5,"Love the food"));
        list2.add(new UserReview("Chris",4,"Had a great time"));
        itemList.add(new Item("A restaurant",list2));
        itemList.add(new Item("KISU",list));
        itemList.add(new Item("The Bakery",list2));
        dataMn.setData(itemList);
    }

}