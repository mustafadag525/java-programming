public class Account {

private String telefonno;
private int bakiye;
private String  email;
private String hesapno;
private String isim;



public Account()
{
    System.out.println("kendi yazdıgımız contrukcor");
}

public Account(String telefonno,int bakiye,String email,String hesapno,String  isim)
{
    this.telefonno=telefonno;
    this.bakiye=bakiye;
    this.email=email;
    this.hesapno=hesapno;
    this.isim=isim;

}



public void parayatırma(double miktar)
{
    bakiye+=miktar;
    System.out.println("yeni bakiye: "+bakiye);
}

public void paracekme(double miktar)
{
    if(miktar>1500)
    {
        System.out.println("1 günde en fazla 1000 tl çekebilirisniz..");
    }
    if (bakiye-miktar<0)
    {
        System.out.println("yetersiz bakiye, bakiyeniz: "+bakiye);
    }
    else
    {
        bakiye-=miktar;
        System.out.println("yeni bakiye: "+bakiye);
    }

}









    public String getTelefonno() {
        return telefonno;
    }

    public void setTelefonno(String telefonno) {
        this.telefonno = telefonno;
    }

    public int getBakiye() {
        return bakiye;
    }

    public void setBakiye(int bakiye) {
        this.bakiye = bakiye;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getHesapno() {
        return hesapno;
    }

    public void setHesapno(String hesapno) {
        this.hesapno = hesapno;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }






}
