import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
       int bakiye=1000;
       String i�lemler="1. bakiye  ��renme\n" +
               "2. para �ekme\n" +
               "3. para yat�rma\n" +
               "4. ��k�� (��k�� ��in q ya bas";
        System.out.println("----------------------");
        System.out.println(i�lemler);
        System.out.println("-----------------------");

        while (true)
        {
            System.out.print("i�lem se�: ");
            i�lemler=scanner.nextLine();
            if(i�lemler.equals("q"))
            {
                System.out.println("programdan ��k�l�yor..");
                System.out.println("kullan�d���n�z i�in te�ekk�r ederiz...");
                break;
            }
            else if(i�lemler.equals("1"))
            {
                System.out.println("bakiyeniz: "+bakiye);
            }
            else if(i�lemler.equals("2"))
            {
                System.out.print("�ekmek istedi�iniz tutar: ");
                int tutar=scanner.nextInt();
                scanner.nextLine();//d�ng� ba�a d�ner intten sonra line kullan�ld��� i�in bu i�lem uygulan�r,
                System.out.println(tutar+" tl �ekildi..");

                if(bakiye-tutar<0)
                {
                    System.out.print("yetersiz bakiye.." + " bakiyeniz: "+bakiye);
                }
                else
                {
                    bakiye-=tutar;
                    System.out.println("yeni bakiye: "+bakiye);
                }
            }
            else if(i�lemler.equals("3"))
            {
                System.out.print("yat�raca��n�z toplam tutar� girin: ");
               int tutar= scanner.nextInt();
                scanner.nextLine();
                System.out.println(tutar+" tl yat�r�ld�..");
                bakiye+=tutar;
                System.out.println("yeni bakiye: "+bakiye);
            }
            else
            {
                System.out.println("gecersiz i�lem..");
                System.out.println("tekrar deneyin..");
            }

        }




    }


}




