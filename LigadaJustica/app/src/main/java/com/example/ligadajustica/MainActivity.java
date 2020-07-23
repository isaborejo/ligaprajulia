package com.example.ligadajustica;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.RadioButton;

import java.text.DateFormat;

public class MainActivity extends AppCompatActivity {
    Intent intent=null;
   RadioButton rdb1;
   RadioButton rdb2;
   RadioButton rdb3;
   RadioButton rdb4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rdb1 =findViewById(R.id.rdb1);
        rdb2 = findViewById(R.id.rdb2);
        rdb3= findViewById(R.id.rdb3);
        rdb4=findViewById(R.id.rdb4);
    }
    public void Ler (View view){
       Uri uri = Uri.parse("https://pt.wikipedia.org/wiki/Liga_da_Justi%C3%A7a");
        Intent internet = new Intent (Intent.ACTION_VIEW, uri);
        startActivity(internet);
    }
    
    public void Trocar (View v)
    {
        if (rdb1.isChecked())
        {
            intent=new Intent (this, Main2Activity.class);
        }
        if (rdb2.isChecked())
        {
            intent=new Intent (this, Main3Activity.class);
        }
        if (rdb3.isChecked())
        {
            intent= new Intent (this, Main4Activity.class);
        }
        if (rdb4.isChecked())
        {
            intent=new Intent (this, Main5Activity.class);
        }
        startActivity(intent);
    }
}
