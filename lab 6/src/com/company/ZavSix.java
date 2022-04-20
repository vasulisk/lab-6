package com.company;

public class ZavSix {
    public ZavSix() {
    }

    public static void main(String[] args) {
        int i = 1;
        int a = 1;
        int n = 10;
        while (a <= n){
            i = i * a;
            a++;
        }
        System.out.println(n + "! = " + i);
    }
}
