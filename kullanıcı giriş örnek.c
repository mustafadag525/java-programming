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
        int giri�_hakk�=3;
        String def_kullan�c�="mustafa";
        String def_parola="1234";
        System.out.println("-----------");
        System.out.println("ho�geldiniz");
        System.out.println("------------");
        while (true)
        {
            System.out.println("kullan�c� ad�: ");
            String kullan�c�=scanner.nextLine();
            System.out.println("parola: ");
            String parola=scanner.nextLine();
            if(kullan�c�.equals(def_kullan�c�) && parola.equals(def_parola))
            {
                System.out.println("welcome: "+kullan�c�);
                break;
            }
            else if(kullan�c�.equals(def_kullan�c�) && !parola.equals(def_parola))
            {
                System.out.println("parola yanl��");
                giri�_hakk�-=1;
                System.out.println("giri� hakk�: "+giri�_hakk�);
            }
            else if(!kullan�c�.equals(def_kullan�c�) && parola.equals(def_parola))
            {
                System.out.println("kullan�c� yanl��");
                giri�_hakk�-=1;
                System.out.println("giri� hakk�: "+giri�_hakk�);

            }
            else
            {
                System.out.println("kullan�c� ve parola yanl��");
                giri�_hakk�-=1;
                System.out.println("giri� hakk�: "+giri�_hakk�);

            }
            if(giri�_hakk�==0)
            {
                System.out.println("giri� hakk� bitti");
                System.out.println("g�le g�le");
                break;
            }



        }











    }


}