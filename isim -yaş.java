import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner=new Scanner(System.in);
        System.out.println("yaş gir:");
        int yaş=scanner.nextInt();
        scanner.nextLine();
        System.out.println("isim gir:");
        String isim=scanner.nextLine();
        System.out.println("yaş: "+yaş);
        System.out.println("isim: "+isim);
    }
}

}
