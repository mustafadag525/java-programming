package com.company;

public class Main {

    public static int toplamm(int sy,int tp)
    {
        if (sy==1)
        {
            return tp;
        }
        else if(sy%2!=0)
        {
            tp+=sy;
        }
        tp=toplamm(sy-1,tp);
        return tp;
    }



    public static void main(String[] args) {

        int tp=1;
        System.out.println(toplamm(10,tp));

    }
}