import jdk.jshell.SourceCodeAnalysis;

import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class Main {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
       int bakiye=1000;
       String işlemler="1. bakiye  öğrenme\n" +
               "2. para çekme\n" +
               "3. para yatırma\n" +
               "4. çıkış (çıkış ıçin q ya bas";
        System.out.println("----------------------");
        System.out.println(işlemler);
        System.out.println("-----------------------");

        while (true)
        {
            System.out.print("işlem seç: ");
            işlemler=scanner.nextLine();
            if(işlemler.equals("q"))
            {
                System.out.println("programdan çıkılıyor..");
                System.out.println("kullanıdığınız için teşekkür ederiz...");
                break;
            }
            else if(işlemler.equals("1"))
            {
                System.out.println("bakiyeniz: "+bakiye);
            }
            else if(işlemler.equals("2"))
            {
                System.out.print("çekmek istediğiniz tutar: ");
                int tutar=scanner.nextInt();
                scanner.nextLine();//döngü başa döner intten sonra line kullanıldığı için bu işlem uygulanır,
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
            else if(işlemler.equals("3"))
            {
                System.out.print("yatıracağınız toplam tutarı girin: ");
               int tutar= scanner.nextInt();
                scanner.nextLine();
                System.out.println(tutar+" tl yatırıldı..");
                bakiye+=tutar;
                System.out.println("yeni bakiye: "+bakiye);
            }
            else
            {
                System.out.println("gecersiz işlem..");
                System.out.println("tekrar deneyin..");
            }

        }




    }


}




