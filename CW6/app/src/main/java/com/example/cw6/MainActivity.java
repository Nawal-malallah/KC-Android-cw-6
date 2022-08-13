package com.example.cw6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Student> students = new ArrayList<>();

    int nn = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView sn , sa , sg;
        ImageView sp;
        Button next;

        sn = findViewById(R.id.sn);
        sa = findViewById(R.id.sa);
        sg = findViewById(R.id.sg);
        sp = findViewById(R.id.sp);
        next = findViewById(R.id.button);


        Student s1 = new Student("yousef" , 14 , 12 , R.drawable.oddboy);
        Student s2 = new Student("salmam"  , 13 , 10 , R.drawable.images);
        Student s3 = new Student("majed" , 15 , 11 , R.drawable.oddboy);


        students.add(s1);
        students.add(s2);
        students.add(s3);

        sn.setText(students.get(nn).getSn());
        sa.setText(String.valueOf(students.get(nn).getSa()));
        sg.setText(String.valueOf(students.get(nn).getSg()));
        sp.setImageResource(students.get(nn).getSp());

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nn++;

                sn.setText(students.get(nn).getSn());
                sa.setText(String.valueOf(students.get(nn).getSa()));
                sg.setText(String.valueOf(students.get(nn).getSg()));
                sp.setImageResource(students.get(nn).getSp());


            }
        });

    }
}