package com.rpl.informaticlink;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class profileActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);
        ImageButton ukt = findViewById(R.id.ukt);
        ImageButton krs = findViewById(R.id.krs);
        ImageButton khs = findViewById(R.id.khs);
        ImageButton jadwal = findViewById(R.id.jadwal);
        ImageButton presensi = findViewById(R.id.presens);
        ImageButton dosen = findViewById(R.id.dsen);

        ukt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(profileActivity.this,activity_ukt.class);
                startActivity(goToX);
                profileActivity.this.onPause();
            }
        });
        krs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(profileActivity.this,krsActivity.class);
                startActivity(goToX);
                profileActivity.this.onPause();
            }
        });
        khs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(profileActivity.this,khsActivity.class);
                startActivity(goToX);
                profileActivity.this.onPause();
            }
        });
        jadwal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(profileActivity.this,jadwalActivity.class);
                startActivity(goToX);
                profileActivity.this.onPause();
            }
        });
        presensi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(profileActivity.this,presensiActivity.class);
                startActivity(goToX);
                profileActivity.this.onPause();
            }
        });
        dosen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent goToX = new Intent(profileActivity.this,profileActivity.class);
                startActivity(goToX);
                profileActivity.this.onPause();
            }
        });
    }
}
