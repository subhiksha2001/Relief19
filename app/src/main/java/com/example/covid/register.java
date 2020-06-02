package com.example.covid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
public class register extends AppCompatActivity {
    EditText tname, tmail, tphone, tage, tlocation, tjob;
    Button save;
    Member member;

    DatabaseReference reff;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        tname = findViewById(R.id.name);
        tmail = findViewById(R.id.email);
        tphone = findViewById(R.id.phon);
        tage = findViewById(R.id.age);
        tlocation = findViewById(R.id.loca);
        tjob = findViewById(R.id.jobdet);
        save = findViewById((R.id.send));
        member = new Member();
        reff = FirebaseDatabase.getInstance().getReference().child("Member");
        save.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Long ph = Long.parseLong(tphone.getText().toString().trim());
                int ages = Integer.parseInt(tage.getText().toString().trim());
                member.setName(tname.getText().toString().trim());
                member.setEmail(tmail.getText().toString().trim());
                member.setAge((float) ages);
                member.setLocate(tlocation.getText().toString().trim());
                member.setJobdet(tjob.getText().toString().trim());
                member.setPh(ph);
                reff.push().setValue(member);
                Toast.makeText(register.this, "Successfully registered", Toast.LENGTH_LONG).show();

            }


        });


    }
}
