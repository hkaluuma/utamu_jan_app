package com.example.utamu_jan;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
public class MainActivity extends AppCompatActivity {
    //visibility identifiers (public, protected, private, default)
    public String notes;
    protected String teacherNotes;
    private boolean okay;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //we can write our code below
        String Student;
        int number;

         /* Instantiation */
        Cat catobj = new Cat();
        //use object to access methods of another class
        String gotmethod = catobj.makeNoise();
        System.out.println("gotmethod");
        System.out.println("This is the count: "+count());
    }
    //our method count
    private int count(){
        int num;
        num = 10;
        return num;
    }
}