package com.example.ktgk;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;


import java.util.ArrayList;

public class CauThuBongDaActivity extends AppCompatActivity {
    ListView lvBaiHat;
    ArrayList<CauThuBongDa> arrayBaiHat;
    CauThuBongDaAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cauthubongda);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        AnhXa();
        adapter = new CauThuBongDaAdapter(this, R.layout.layoutbaihat, arrayBaiHat);
        lvBaiHat.setAdapter(adapter);
        lvBaiHat.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if(position==0){
                    Intent myIntent = new Intent(CauThuBongDaActivity.this, a_messi.class);
                    startActivity(myIntent);
                }
                if(position==1){
                    Intent myIntent = new Intent(CauThuBongDaActivity.this, b_iniesta.class);
                    startActivity(myIntent);
                }
                if(position==2){
                    Intent myIntent = new Intent(CauThuBongDaActivity.this, c_ramos.class);
                    startActivity(myIntent);
                }
                if(position==3){
                    Intent myIntent = new Intent(CauThuBongDaActivity.this, d_benzema.class);
                    startActivity(myIntent);
                }
                if(position==4){
                    Intent myIntent = new Intent(CauThuBongDaActivity.this, e_debruyne.class);
                    startActivity(myIntent);
                }
                if(position==5){
                    Intent myIntent = new Intent(CauThuBongDaActivity.this, f_neymar.class);
                    startActivity(myIntent);
                }
                if(position==6){
                    Intent myIntent = new Intent(CauThuBongDaActivity.this, g_dimaria.class);
                    startActivity(myIntent);
                }
                if(position==7){
                    Intent myIntent = new Intent(CauThuBongDaActivity.this, h_aguero.class);
                    startActivity(myIntent);
                }
                if(position==8){
                    Intent myIntent = new Intent(CauThuBongDaActivity.this, i_lampard.class);
                    startActivity(myIntent);
                }
                if(position==9){
                    Intent myIntent = new Intent(CauThuBongDaActivity.this, j_alves.class);
                    startActivity(myIntent);
                }

            }
        });
    }
    private void AnhXa(){
        lvBaiHat = (ListView) findViewById(R.id.listviewBaiHat);
        arrayBaiHat = new ArrayList<>();
        arrayBaiHat.add(new CauThuBongDa("Lionel Messi", "Argentina-PSG",R.drawable.messi));
        arrayBaiHat.add(new CauThuBongDa("Andres Iniesta", "Spain-Barcelona",R.drawable.iniesta));
        arrayBaiHat.add(new CauThuBongDa("Sergio Ramos", "Spain-PSG",R.drawable.ramos));
        arrayBaiHat.add(new CauThuBongDa("Karim Benzema", "France_Real Madrid",R.drawable.benzema));
        arrayBaiHat.add(new CauThuBongDa("Kevin De Bruyne", "Belgium-Man City",R.drawable.debruyne));
        arrayBaiHat.add(new CauThuBongDa("Neymar Junior", "Brazil-PSG",R.drawable.neymar));
        arrayBaiHat.add(new CauThuBongDa("Angel Di Maria", "Argentina-Juventus",R.drawable.dimaria));
        arrayBaiHat.add(new CauThuBongDa("Sergio Aguero", "Argentina-Man city",R.drawable.aguero));
        arrayBaiHat.add(new CauThuBongDa("Frank Lampard ", "England-Chelsea",R.drawable.lampard));
        arrayBaiHat.add(new CauThuBongDa("Dani Alves", "Brazil-Barcelona",R.drawable.alves));
    }


}
