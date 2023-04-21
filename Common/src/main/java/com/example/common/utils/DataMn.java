package com.example.common.utils;

import android.content.Context;

import com.example.common.Item;
import com.example.common.UserReview;

import java.util.ArrayList;

public class DataMn {

    private static DataMn dataMn;
    private ArrayList<Item> itemList;
    private DataMn() {
       this.itemList= new ArrayList<>();
    }

    public static DataMn getInstance() {
        return dataMn;
    }

    public static DataMn initHelper() {
        if(dataMn == null){
            dataMn = new DataMn();
        }
        return dataMn;
    }

    public void setData(ArrayList<Item> list){
        this.itemList = list ;
    }

    public ArrayList<Item> getItemList() {
        return itemList;
    }
}
