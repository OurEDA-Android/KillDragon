package com.example.means88.test;

/**
 * Created by Means88 on 2016/6/5.
 */
public class MainTest {

    public static void main(String[] args) {
        for(int i=0; i<1000; i++) {
            for(int j=0; j<1000; j++) {
                if(i+j != ultraPlus(i,j)) {
                    System.out.println("error");
                }
            }
        }
    }

    public static int ultraPlus(int a, int b) {
        return a+b;
    }

}
