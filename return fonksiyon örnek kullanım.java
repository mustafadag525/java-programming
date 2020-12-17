import jdk.jshell.SourceCodeAnalysis;

import javax.crypto.spec.PSource;
import javax.print.DocFlavor;
import javax.print.attribute.AttributeSetUtilities;
import jdk.jshell.SourceCodeAnalysis;

import java.awt.desktop.SystemSleepEvent;
import java.util.Scanner;
import java.util.spi.AbstractResourceBundleProvider;

public class Main
{

   public static int ikiçarp(int a)
   {
       return a*2;
   }
   public static int ikiyletopla(int a)
   {
       return a+2;
   }
   public static int dortçarp(int a)
   {

       return a*4;
   }

    public static void main(String[] args) {

       dortçarp(ikiyletopla(ikiçarp(10)));
        System.out.println("degerr: "+       dortçarp(ikiyletopla(ikiçarp(1))));



    }


}



