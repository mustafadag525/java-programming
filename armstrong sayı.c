import jdk.jshell.SourceCodeAnalysis;

import javax.print.attribute.AttributeSetUtilities;
import jdk.jshell.SourceCodeAnalysis;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("sayý gir: ");
        int sayý=scanner.nextInt();i
        System.out.println("basamak: ");
        int bas_sayýsý=scanner.nextInt();
        int toplam=0;
        int gecic=sayý;
        do {
            int bas_degeri=gecic%10;
            gecic/=10;
            toplam+=Math.pow(bas_degeri,bas_sayýsý);

        }while (gecic>0);
        if(sayý==toplam)
        {
            System.out.println("armstrong");
        }
        else
        {
            System.out.println("degil");
        }







