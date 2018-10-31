package com.example.taruc.lab22menu;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.SurfaceHolder;
import android.view.View;
import android.widget.Toast;

public class aboutactivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutactivity);
    }

    public void visitTARUC(View v) {
        String uri ="http://www.tarc.edu.my";
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse(uri));
        startActivity(intent);




        }
    public void showMain(View v){
        Intent intent = new Intent(Intent.ACTION_MAIN);
        startActivity(intent);

    }

    public void showDial(View v){
        Intent intent = new Intent(Intent.ACTION_DIAL,
        Uri.parse("Tel:" + "01234567"));
        startActivity(intent);
    }
    public void showSendTo(View v){
        Intent intent = new Intent(Intent.ACTION_SENDTO),

        intent.setData(Uri.parse("Mailto:" + "infot@acd.tarc.edu.my"));
        if(intent.resolveActivity(getPackageManager())!=null){
            startActivity(intent);

        }else{
            Toast.makeText(this,"No app to handle intent",Toast.LENGTH_SHORT).show();
        }
}
}