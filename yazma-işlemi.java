package com.company;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Main {



    public static void main(String[] args) {

        FileWriter mywriter=new FileWriter("sayi.txt",true);
        String yaz="";
        for (int i=1;i<101;i++)
        {
            if (i%2==0)
            {
                yaz+=Integer.toString(i);
            }
        }
        mywriter.write(yaz);
        mywriter.close();




    }
}