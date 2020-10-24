import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        int vize_notu,final_notu;
        System.out.println("vize notu: ");
        vize_notu=scanner.nextInt();
        System.out.println("final notu: ");
        final_notu =scanner.nextInt();
        double ortalama=(vize_notu*0.4)+(final_notu*0.6);
        System.out.println("ortalama: "+ortalama);
        if(ortalama>=90)
        {
            System.out.println("AA aldýnýz..");
        }
        else if(ortalama>=85)
        {
            System.out.println("BA aldýnýz..");
        }
        else if(ortalama>=80)
        {
            System.out.println("BB aldýnýz..");
        }
        else if(ortalama>=75)
        {
            System.out.println("CB aldýnýz..");
        }
        else if(ortalama>=70)
        {
            System.out.println("CC aldýnýz..");

        }
        else if(ortalama>=60)
        {
            System.out.println("DD aldýnýz");
        }
        else
        {
            System.out.println("FF aldýnýz ve kaldýnýz ..");
        }

}
    }