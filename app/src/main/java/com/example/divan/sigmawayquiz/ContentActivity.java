package com.example.divan.sigmawayquiz;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ContentActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_content);
    }

    public void leansix(View view) {

        startActivity(new Intent(getApplicationContext(),LeanActivity.class));

    }

    public void mlclick(View view) {
        startActivity(new Intent(getApplicationContext(),MLActivity.class));

    }

    public void analyticsclick(View view) {
        startActivity(new Intent(getApplicationContext(),AnalyticsActivity.class));

    }

    public void iotclick(View view) {

        startActivity(new Intent(getApplicationContext(),iotActivity.class));

    }



    public void loginscreen(View view) {

        //startActivity(new Intent(ContentActivity.this,LoginActivity.class));
        finish();

    }


    @Override
    public void onBackPressed() {
        AlertDialog.Builder builder = new AlertDialog.Builder(this);
        builder.setMessage("Are you sure you want to Logout?")
                .setCancelable(false)
                .setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        ContentActivity.this.finish();
                    }
                })
                .setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int id) {
                        dialog.cancel();
                    }
                });
        AlertDialog alert = builder.create();
        alert.show();

    }
}
