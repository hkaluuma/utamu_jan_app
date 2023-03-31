package com.example.utamu_jan;
public class Cat {
    /* declaring instance variables*/
    public String cat_name;
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

    public int add (){
        int number = 10;
        int sum = number+=1;
        sum = sum +1;
        return sum;
    }


}
