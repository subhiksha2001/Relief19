package com.example.covid;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class Handling extends AppCompatActivity {
    Button bt1;

    @SuppressLint({"WrongViewCast", "CutPasteId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_handling);




        bt1 = findViewById(R.id.buttonCall);

        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });



    }

    public void openActivity2() {
        Intent intent = new Intent(Intent.ACTION_VIEW);
        intent.setData(Uri.parse("https://www.deccanherald.com/national/comic-book-issued-by-government-to-spread-coronavirus-awareness-among-children-813064.html#3"));
        startActivity(intent);
    }

}


