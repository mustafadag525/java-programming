public class Hesap {

    private String kulanici_adi;
    private String parola;
    private int bakiye;


    public Hesap(String kulanici_adi,String parola,int bakiye){


        this.setKulanici_adi(kulanici_adi);
        this.setParola(parola);
        this.setBakiye(bakiye);


    }


    public String getKulanici_adi() {
        return kulanici_adi;
    }

    public void setKulanici_adi(String kulanici_adi) {
        this.kulanici_adi = kulanici_adi;
    }

    public String getParola() {
        return parola;
    }

    public void setParola(String parola) {
        this.parola = parola;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public void parayatırma(double tutar){

        this.bakiye+=tutar;
        System.out.println("yeni bakiy: "+bakiye);
    }

    public void paracekme(double tutar){

        if (bakiye-tutar<0)
        {
            System.out.println("yetersiz bakiye , bakiyeniz: "+bakiye);
        }
        else
        {
            bakiye-=tutar;
            System.out.println("yeni bakiye: "+bakiye);
        }
    }









}
