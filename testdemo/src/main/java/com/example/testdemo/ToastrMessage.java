package com.example.testdemo;

import android.content.Context;
import android.widget.Toast;

public class ToastrMessage {

    public static void s(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}
