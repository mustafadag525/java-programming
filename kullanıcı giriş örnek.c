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
        int giriþ_hakký=3;
        String def_kullanýcý="mustafa";
        String def_parola="1234";
        System.out.println("-----------");
        System.out.println("hoþgeldiniz");
        System.out.println("------------");
        while (true)
        {
            System.out.println("kullanýcý adý: ");
            String kullanýcý=scanner.nextLine();
            System.out.println("parola: ");
            String parola=scanner.nextLine();
            if(kullanýcý.equals(def_kullanýcý) && parola.equals(def_parola))
            {
                System.out.println("welcome: "+kullanýcý);
                break;
            }
            else if(kullanýcý.equals(def_kullanýcý) && !parola.equals(def_parola))
            {
                System.out.println("parola yanlýþ");
                giriþ_hakký-=1;
                System.out.println("giriþ hakký: "+giriþ_hakký);
            }
            else if(!kullanýcý.equals(def_kullanýcý) && parola.equals(def_parola))
            {
                System.out.println("kullanýcý yanlýþ");
                giriþ_hakký-=1;
                System.out.println("giriþ hakký: "+giriþ_hakký);

            }
            else
            {
                System.out.println("kullanýcý ve parola yanlýþ");
                giriþ_hakký-=1;
                System.out.println("giriþ hakký: "+giriþ_hakký);

            }
            if(giriþ_hakký==0)
            {
                System.out.println("giriþ hakký bitti");
                System.out.println("güle güle");
                break;
            }



        }











    }


}