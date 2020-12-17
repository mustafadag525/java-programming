public class test {


    public static void main(String[] args){


        Araba araba1=new Araba();
        araba1.setModel("renault");
        System.out.println("model: "+araba1.getModel());


        araba1.setKapilar(-4);



        //Araba araba2=null; //henüz hiçbir refarens göstermiyor anlamında
        //araba2.setModel("renalt");//deger atamadan erişemezsin hata verir

    }
}


