package com.example.utamu_jan;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
public class MainActivity extends AppCompatActivity {
    public String notes, gotmethod, student;
    protected String teacherNotes;
    private boolean okay;
    private int number;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //we can write our code below
        Cat catobj = new Cat();
        gotmethod = catobj.makeNoise();
        System.out.println("gotmethod");
        System.out.println("This is the count: " + countwalks());
        System.out.println("The walk is: " + catobj.addwalk(5, 6) + " steps");
        System.out.println("The made noise is: " + gotmethod);
       //sampe do while loop
        int i = 0;
        do {
            System.out.println(i);
            i++;
        }
        while (i < 10);

        //sample
        int mark = 22;
        if (mark < 50) {
            System.out.println("Student has failed.");
        } else if (mark < 60) {
            System.out.println("Student has passed with a Credit Four.");
        } else if (mark < 70) {
            System.out.println("Student has passed with a Credit Three.");
        } else if (mark < 80) {
            System.out.println("Student has passed with a Distinction Two.");
        } else {
            System.out.println("Student has passed with a Distinction One.");
        }
    }

    private int countwalks(){
        int num;
        num = 10;
        return num;
    }




}