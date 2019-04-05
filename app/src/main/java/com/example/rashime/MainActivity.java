 package com.example.rashime;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

 public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

     public void openAbout(View view) {
         Intent i=new Intent(this,AboutUs.class);
         startActivity(i);
     }

     public void openGallery(View view) {
         Intent i=new Intent(this,Gallery.class);
         startActivity(i);
     }

     public void contact(View view) {
         Intent i=new Intent(this,Contact.class);
         startActivity(i);
     }
 }
