import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
       int bakiye=1000;
       String iþlemler="1. bakiye  öðrenme\n" +
               "2. para çekme\n" +
               "3. para yatýrma\n" +
               "4. çýkýþ (çýkýþ ýçin q ya bas";
        System.out.println("----------------------");
        System.out.println(iþlemler);
        System.out.println("-----------------------");

        while (true)
        {
            System.out.print("iþlem seç: ");
            iþlemler=scanner.nextLine();
            if(iþlemler.equals("q"))
            {
                System.out.println("programdan çýkýlýyor..");
                System.out.println("kullanýdýðýnýz için teþekkür ederiz...");
                break;
            }
            else if(iþlemler.equals("1"))
            {
                System.out.println("bakiyeniz: "+bakiye);
            }
            else if(iþlemler.equals("2"))
            {
                System.out.print("çekmek istediðiniz tutar: ");
                int tutar=scanner.nextInt();
                scanner.nextLine();//döngü baþa döner intten sonra line kullanýldýðý için bu iþlem uygulanýr,
                System.out.println(tutar+" tl çekildi..");

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
            else if(iþlemler.equals("3"))
            {
                System.out.print("yatýracaðýnýz toplam tutarý girin: ");
               int tutar= scanner.nextInt();
                scanner.nextLine();
                System.out.println(tutar+" tl yatýrýldý..");
                bakiye+=tutar;
                System.out.println("yeni bakiye: "+bakiye);
            }
            else
            {
                System.out.println("gecersiz iþlem..");
                System.out.println("tekrar deneyin..");
            }

        }




    }


}




