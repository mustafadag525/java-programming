import jdk.jshell.SourceCodeAnalysis;

import javax.print.attribute.AttributeSetUtilities;
import jdk.jshell.SourceCodeAnalysis;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("say� gir: ");
        int say�=scanner.nextInt();i
        System.out.println("basamak: ");
        int bas_say�s�=scanner.nextInt();
        int toplam=0;
        int gecic=say�;
        do {
            int bas_degeri=gecic%10;
            gecic/=10;
            toplam+=Math.pow(bas_degeri,bas_say�s�);

        }while (gecic>0);
        if(say�==toplam)
        {
            System.out.println("armstrong");
        }
        else
        {
            System.out.println("degil");
        }







