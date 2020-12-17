import java.util.Scanner;

public class Main{

    public static int ebob_bulma(int sayi1,int sayi2)
    {
        int ebob=1;
        for (int i=1;i<=sayi1 && i<=sayi2;i++)
        {
            if (sayi1%i==0 && sayi2%i==0)
            {
                ebob=i;
            }
        }
        return ebob;



    }


    public static void main(String[] args){

        Scanner scanner=new Scanner(System.in);
        int s1,s2;
        System.out.println("birinci sayi: ");
        s1=scanner.nextInt();
        System.out.println("ikinci sayi: ");
        s2=scanner.nextInt();
        System.out.println("iki sayinin ebobu: "+ebob_bulma(s1,s2));





    }