public class Araba {

private String renk;
private int tekerlek;
private String model;
private int kapilar;


public void setModel(String model){

    this.model=model;

}
public String getModel()
{
    return this.model;
}


    public String getRenk() {
        return renk;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public int getTekerlek() {
        return tekerlek;
    }

    public void setTekerlek(int tekerlek) {
        this.tekerlek = tekerlek;
    }

    public int getKapilar() {
        return kapilar;
    }

    public void setKapilar(int kapilar) {
        if (kapilar<0)
        {
            System.out.println("kapılar 0 danküçük olamaz");
        }
        else
        {
            this.kapilar=kapilar;
        }
    }


}
