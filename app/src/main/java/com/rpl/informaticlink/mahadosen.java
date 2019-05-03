package com.rpl.informaticlink;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class mahadosen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mahadosen);
        ImageButton ukt = findViewById(R.id.ukt);
        ImageButton krs = findViewById(R.id.krs);
        ImageButton khs = findViewById(R.id.khs);
        ImageButton jadwal = findViewById(R.id.jadwal);
        ImageButton presensi = findViewById(R.id.presens);
        ImageButton dosen = findViewById(R.id.dsen);

        ukt.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        Intent goToX = new Intent(mahadosen.this,activity_ukt.class);
        startActivity(goToX);
        mahadosen.this.onPause();
        }
        });
        krs.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        Intent goToX = new Intent(mahadosen.this,krsActivity.class);
        startActivity(goToX);
        mahadosen.this.onPause();
        }
        });
        khs.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        Intent goToX = new Intent(mahadosen.this,khsActivity.class);
        startActivity(goToX);
        mahadosen.this.onPause();
        }
        });
        jadwal.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        Intent goToX = new Intent(mahadosen.this,jadwalActivity.class);
        startActivity(goToX);
        mahadosen.this.onPause();
        }
        });
        presensi.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        Intent goToX = new Intent(mahadosen.this,presensiActivity.class);
        startActivity(goToX);
        mahadosen.this.onPause();
        }
        });
        dosen.setOnClickListener(new View.OnClickListener() {
@Override
public void onClick(View v) {
        Intent goToX = new Intent(mahadosen.this,mahadosen.class);
        startActivity(goToX);
        mahadosen.this.onPause();
        }
        });
    }
}
