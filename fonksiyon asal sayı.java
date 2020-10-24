import java.util.Scanner;

public class Main{

    public static boolean asal_m?(int say?)
    {
        if(say?==1)
        {
            return false;
        }
        else if(say?==2)
        {
            return true;
        }
        else
        {
            for(int i=2;i<say?;i++)
            {
                if(say?%i==0)
                {
                    return false;
                }
            }return true;
        }


    }


    public static void main(String[] args){

        for(int i=2;i<1000;i++)

        {
            if(asal_m?(i))
            {
                System.out.println(i);
            }
        }





    }




}