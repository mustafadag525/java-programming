import java.util.Scanner;

public class Login {

    public  boolean login(Hesap hesap){

        Scanner scanner=new Scanner(System.in);
        String kulanici_adi;
        String parola;
        System.out.println("kullanıcı adı: ");
        kulanici_adi=scanner.nextLine();
        System.out.println("parola: ");
        parola=scanner.nextLine();

        if (hesap.getKulanici_adi().equals(kulanici_adi) && hesap.getParola().equals(parola))
        {
            return true;
        }
        else
        {
            return false;
        }

    }


}
