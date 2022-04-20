package com.company;

public class ZavFive {
    public ZavFive (){
        }

    public static void main(String[] args) {
           int i,n;
           i = 1;
           n = 10;
           for(int a = 1; a <= n; a++ ){
               i = i * a;
           }
           System.out.println(n + "! = " + i);

    }
}
