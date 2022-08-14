package com.example.cw6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.Scanner;

public class MainActivity extends AppCompatActivity {


    ArrayList<Students> students = new ArrayList<>();
    //s1, s2, s3
    //0, 1, 2
    int counter = 0;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        TextView studentname = findViewById(R.id.sn);
        TextView studentage = findViewById(R.id.sa);
        TextView studentgrade = findViewById(R.id.sg);
        ImageView studentphoto = findViewById(R.id.sp);
        Button studentbutton = findViewById(R.id.next);
        Button resetbutton = findViewById(R.id.reset);


        Students s1 = new Students("بوسف", 14, 12, R.drawable.blue);
        Students s2 = new Students("سلمان", 13, 10, R.drawable.gray);
        Students s3 = new Students("ماجد", 15, 11, R.drawable.black);

        students.add(s1);
        students.add(s2);
        students.add(s3);

        studentname.setText(students.get(counter).getName());
        studentage.setText(String.valueOf(students.get(counter).getAge()));
        studentgrade.setText(String.valueOf(students.get(counter).getGrade()));
        studentphoto.setImageResource(students.get(counter).getPhoto());


        studentbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter++;

                studentname.setText(students.get(counter).getName());
                studentage.setText(String.valueOf(students.get(counter).getAge()));
                studentgrade.setText(String.valueOf(students.get(counter).getGrade()));
                studentphoto.setImageResource(students.get(counter).getPhoto());

                if (counter == 2){
                    System.out.println("Return to pervious page.");
                }


            }

        });

        resetbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                counter--;

                studentname.setText(students.get(counter).getName());
                studentage.setText(String.valueOf(students.get(counter).getAge()));
                studentgrade.setText(String.valueOf(students.get(counter).getGrade()));
                studentphoto.setImageResource(students.get(counter).getPhoto());

            }
        });





    }}

















