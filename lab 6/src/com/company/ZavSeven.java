package com.company;

public class ZavSeven {


    public static void main(String[] args){
        int a = 0;

        for(int hour = 1;hour <= 24;hour++){
            for(int minute = 0 ;minute <= 59;minute++){
                if(hour / 10 % 10 == minute % 10 & hour % 10 == minute / 10 % 10){
                    a++;
                }
            }
        }
        System.out.println("Всього " + a + " співпадінь");
    }
}
