import java.security.UnrecoverableEntryException;
import java.util.Scanner;

public class ATM {
    public void calis(Hesap hesap){


        Login login=new Login();

        Scanner scanner=new Scanner(System.in);

        System.out.println("bankamızı hhoşgeldiniz..");
        System.out.println("------------");
        System.out.println("kullanıcı girişi");
        System.out.println("-------------");
        int giris_hakkı=3;

        while (true){
            if (login.login(hesap))
            {
                System.out.println("giriş başarıli");
                break;
            }
            else
            {
                System.out.println("giriş başarısız");
                giris_hakkı-=1;
                System.out.println("kalan giriş hakkınız: "+giris_hakkı);

            }
            if (giris_hakkı==0)
            {

                System.out.println("giriş hakkı bitti");
                return;
            }




        }


        System.out.println("-------------");
        String islemler="1 bakiye öğrenme\n" +
                "2 para yatırma\n" +
                "3 para çekme\n" +
                "çıkış için q ya bas";
        System.out.println(islemler);
        System.out.println("--------------");

        while (true)
        {
            System.out.println("işlem sec: ");
            String islem=scanner.nextLine();

            if (islem.equals("q"))
            {
                System.out.println("programadan çıkılıyor");
                break;
            }
            else if(islem.equals("1"))
            {
                System.out.println("bakiyeniz: "+hesap.getBakiye());
            }
            else if(islem.equals("2"))
            {
                System.out.println("yatıracagınız tutar: ");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                hesap.parayatırma(tutar);
            }
            else if(islem.equals("3"))
            {
                System.out.println("çekeceğiniz tutar: ");
                int tutar=scanner.nextInt();
                scanner.nextLine();
                hesap.paracekme(tutar);
            }
            else
            {
                System.out.println("gecersiz işlem");
            }


        }




    }




}
