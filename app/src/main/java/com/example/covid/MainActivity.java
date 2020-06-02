package com.example.covid;


import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainActivity extends AppCompatActivity {
    CardView bt1,bt2,bt3,bt4,bt5,bt6,bt7,bt8,bt9;

    @SuppressLint({"WrongViewCast", "CutPasteId"})
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        bt1 = findViewById(R.id.b1);
        bt2 = findViewById(R.id.b2);
        bt3 = findViewById(R.id.b3);
        bt4 = findViewById(R.id.b4);
        bt5 = findViewById(R.id.b5);
        bt6 = findViewById(R.id.b6);
        bt7 = findViewById(R.id.b7);
        bt8 = findViewById(R.id.b8);
        bt9 = findViewById(R.id.b9);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity2();
            }
        });
        bt2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity3();
            }
        });
        bt3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity4();
            }
        });
        bt4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity5();
            }
        });
        bt5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity6();
            }
        });
        bt6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity7();
                //addNotification();
            }
        });
        bt7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity8();
            }
        });
        bt8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity9();
            }
        });
        bt9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openActivity10();
            }
        });


    }

    public void openActivity2() {
        Intent intent = new Intent(this, ReliefBot.class);
        startActivity(intent);
    }
    public void openActivity3() {
        Intent intent = new Intent(this, help1.class);
        startActivity(intent);
    }

    public void openActivity4() {
        Intent intent = new Intent(this, Covidcases.class);
        startActivity(intent);
    }

    public void openActivity5() {
        Intent intent = new Intent(this, register.class);
        startActivity(intent);
    }

    public void openActivity6() {
        Intent intent = new Intent(this, precautions.class);
        startActivity(intent);
    }

    public void openActivity7() {
        Intent intent = new Intent(this, MapsActivity.class);
        startActivity(intent);
    }

    public void openActivity8() {
        Intent intent = new Intent(this,counselling.class);
        startActivity(intent);
    }

    public void openActivity9() {
        Intent intent = new Intent(this,Handling.class);
        startActivity(intent);
    }
    public void openActivity10() {
        Intent intent = new Intent(this,pharmacy.class);
        startActivity(intent);
    }
    /*public void addNotification() {
        NotificationCompat.Builder builder =
                new NotificationCompat.Builder(this)
                        .setSmallIcon(R.drawable.safe)
                        .setContentTitle("Safe zone")
                        .setContentText("We hope you are safe.Follow social distancing");

        Intent notificationIntent = new Intent(this, MainActivity.class);
        PendingIntent contentIntent = PendingIntent.getActivity(this, 0, notificationIntent,
                PendingIntent.FLAG_UPDATE_CURRENT);
        builder.setContentIntent(contentIntent);

        // Add as notification
        NotificationManager manager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
        manager.notify(0, builder.build());
    }
     */
}


