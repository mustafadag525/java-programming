
import java.util.Scanner;

public class Main{

    public static boolean asal_mı(int sayı)
    {
        if(sayı==1)
        {
            return false;
        }
        else if(sayı==2)
        {
            return true;
        }
        else
        {
            for(int i=2;i<sayı;i++)
            {
                if(sayı%i==0)
                {
                    return false;
                }
            }return true;
        }


    }


    public static void main(String[] args){

        for(int i=2;i<1000;i++)

        {
            if(asal_mı(i))
            {
                System.out.println(i);
            }
        }





    }




}
