package com.xmlparsing.parsing.executor;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Taskq {

    private String name ;

    public Taskq(String name) {
        this.name = name;
    }

    public void run(){
        for (int i=0; i<5;i++){
            if (i==0){
                Date d = new Date();
                SimpleDateFormat simpleDateFormat= new SimpleDateFormat("HH:MM:SS");
                System.out.println("task name is intitilized :"+name+"time is"+simpleDateFormat.format(d));

            } else {
                Date d = new Date();
                SimpleDateFormat simpleDateFormat= new SimpleDateFormat("HH:MM:SS");
                System.out.println("task name is excuted :"+name+"time is"+simpleDateFormat.format(d));
            }
        }
    }
}
