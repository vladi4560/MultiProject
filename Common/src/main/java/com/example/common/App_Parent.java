package com.example.common;

import android.app.Application;

import com.example.common.utils.DataMn;
import com.example.common.utils.MSP;

public abstract class  App_Parent extends Application {
    protected static Class<?> reviewClass;

    @Override
    public void onCreate() {
        super.onCreate();

        MSP.initHelper(this);
        DataMn.initHelper();


    }

}
