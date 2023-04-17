package com.example.utamu_jan;
public class Cat {
    /* declaring instance variables*/
    public String cat_name = "Lion";
    protected int weight;
    private String habitant;
    String diet, physicalAppearance;
    //methods (behaviours)
    private String hunt(){
        int chase_prey = 10;
        String catch_prey = "chase_prey: "+chase_prey;
        return catch_prey;
    }
    //another method make noise
    public String makeNoise(){
       String catNoise = this.cat_name;
        return cat_name;
    }

    public int addwalk (int a, int b){
        int sum;
        sum = a + b;
        return sum;
    }


}
