package com.company;

public class Main {

   public static String cevir(int sayi)
   {
       String temp="";
       while (sayi>0)
       {
           temp=sayi%2+temp;
           sayi/=2;
       }
       return sayi;
   }



    public static void main(String[] args) {
       String data=cevir(90);
        System.out.println(data);

    }
}