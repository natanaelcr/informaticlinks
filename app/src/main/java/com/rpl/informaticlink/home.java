package com.rpl.informaticlink;

import android.content.Intent;
import android.media.Image;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class home extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ImageButton profile  = findViewById(R.id.profile);
        ImageButton about = findViewById(R.id.about);
        ImageButton home = findViewById(R.id.home);
        ImageButton ukt = findViewById(R.id.ukt);
        ImageButton krs = findViewById(R.id.krs);
        ImageButton khs = findViewById(R.id.khs);
        ImageButton jadwal = findViewById(R.id.jadwal);
        ImageButton presensi = findViewById(R.id.presens);
        ImageButton dosen = findViewById(R.id.dsen);
        ImageButton fortos = findViewById(R.id.s);

        profile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(home.this,profileActivity.class);
                startActivity(goToX);
                home.this.onPause();
            }
        });

        about.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(home.this,aboutActivity.class);
                startActivity(goToX);
                home.this.onPause();
            }
        });

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(home.this,home.class);
                startActivity(goToX);
                home.this.onRestart();
            }
        });
        ukt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(home.this,activity_ukt.class);
                startActivity(goToX);
                home.this.onPause();
            }
        });
        krs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(home.this,krsActivity.class);
                startActivity(goToX);
                home.this.onPause();
            }
        });
        khs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(home.this,khsActivity.class);
                startActivity(goToX);
                home.this.onPause();
            }
        });
        jadwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(home.this,jadwalActivity.class);
                startActivity(goToX);
                home.this.onPause();
            }
        });
        presensi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(home.this,presensiActivity.class);
                startActivity(goToX);
                home.this.onPause();
            }
        });
        dosen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(home.this,mahadosen.class);
                startActivity(goToX);
                home.this.onPause();
            }
        });
        fortos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(home.this,profileActivity.class);
                startActivity(goToX);
                home.this.onPause();
            }
        });
    }
}
