import jdk.jshell.SourceCodeAnalysis;

import javax.print.DocFlavor;
import javax.print.attribute.AttributeSetUtilities;
import jdk.jshell.SourceCodeAnalysis;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int giriş_hakkı=3;
        String def_kullanıcı="mustafa";
        String def_parola="1234";
        System.out.println("-----------");
        System.out.println("hoşgeldiniz");
        System.out.println("------------");
        while (true)
        {
            System.out.println("kullanıcı adı: ");
            String kullanıcı=scanner.nextLine();
            System.out.println("parola: ");
            String parola=scanner.nextLine();
            if(kullanıcı.equals(def_kullanıcı) && parola.equals(def_parola))
            {
                System.out.println("welcome: "+kullanıcı);
                break;
            }
            else if(kullanıcı.equals(def_kullanıcı) && !parola.equals(def_parola))
            {
                System.out.println("parola yanlış");
                giriş_hakkı-=1;
                System.out.println("giriş hakkı: "+giriş_hakkı);
            }
            else if(!kullanıcı.equals(def_kullanıcı) && parola.equals(def_parola))
            {
                System.out.println("kullanıcı yanlış");
                giriş_hakkı-=1;
                System.out.println("giriş hakkı: "+giriş_hakkı);

            }
            else
            {
                System.out.println("kullanıcı ve parola yanlış");
                giriş_hakkı-=1;
                System.out.println("giriş hakkı: "+giriş_hakkı);

            }
            if(giriş_hakkı==0)
            {
                System.out.println("giriş hakkı bitti");
                System.out.println("güle güle");
                break;
            }



        }











    }


}
