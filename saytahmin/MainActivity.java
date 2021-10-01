package com.mustafadag.saytahmin;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView txtKalanHak,txtSonuc;
    private EditText edtSayı;
    private String gelenDeger;
    private int kalandeger=3,randomsayı;
    private Random rndSayı;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtKalanHak=(TextView)findViewById(R.id.txtKalanHak);
        txtSonuc=(TextView)findViewById(R.id.txtSonuc);
        edtSayı=(EditText)findViewById(R.id.edtSayı);
        rndSayı=new Random();
        randomsayı=rndSayı.nextInt(5);
        System.out.println("Random sayı : "+randomsayı);
    }


public void btnTahminEt(View v)
{
    gelenDeger=edtSayı.getText().toString();
    if(!TextUtils.isEmpty(gelenDeger)){
        if(kalandeger>0){
            if(gelenDeger.equals(String.valueOf(randomsayı))) // randomsayı int olduğu için onu stringe dönüştürdüm;
            {
                sonucGoster("Tebrikler doğru tahmin");
            }
            else
            {
                kalandeger--;
            }
            txtKalanHak.setText("Kalan hak: "+kalandeger);
            if(kalandeger==0)
            {
                sonucGoster("Tahmin hakkınız bitti");
            }
        }
        else
        {
            txtSonuc.setText("Oyun bitti");
        }
    }
    else
    {
        txtSonuc.setText("Girilen değer boş olamaz");
    }

}

    private void sonucGoster(String mesaj) {
        edtSayı.setEnabled(false);
        txtSonuc.setText(mesaj);
    }


}