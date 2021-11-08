package com.company;

import java.util.Scanner;

public class Main {

    public static void arraybastır(int [] array)
    {
        for (int i=0;i<array.length;i++)
        {
            System.out.println("eleman: "+(i+1)+ ";"+array[i]);
        }
    }

    public static  void ortlama(int [] arrayb)
    {
        double toplam;
        for (int i=0;i<arrayb.length;i++)
        {
            toplam+=arrayb[i];
        }
        return;toplam/arrayb.length;
    }



    public static void main(String[] args) {


        /*int [] dizi=new int[5];
        dizi[1]=2;*/
       /* int [] dizia={1,2,3,4,5,6,7,8,9}; // arrayin diğer kullanımı
        System.out.println(dizia[5]);*/
        Scanner scanner=new Scanner(System.in);
        /*for (int i=0;i<5;i++)

        {
            dizi[i]=scanner.nextInt()*4;

        }
        for (int i=0;i<5;i++)
        {
            System.out.println(dizi[i]);
        }

         */

        int [] dizib={1,2,3,4,5,6,7,8};
        System.out.println("dizi uzunluğu: "+ dizib.length); // dizi uzunluğu bulmak için

        arraybastır(dizib);

        ortlama();








    }
}
