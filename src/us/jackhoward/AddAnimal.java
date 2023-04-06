package us.jackhoward;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddAnimal {

    private InputHelper in = new InputHelper();

    public Talkable addAnimal(){
        int petChoice = in.acceptInt("What type of animal do you want to add? " +
                            "\n 1. Cat" +
                            "\n 2. Dog" +
                            "\n 3. Teacher");

        if (petChoice == 1){
            return new Cat(in.acceptInt("How many mice has the cat killed?"),in.acceptString("What is the cat's name?"));
        } else if (petChoice == 2) {
            return new Dog(in.acceptBooleanY_N("Is the dog friendly?"), in.acceptString("What is the dog's name?"));
        } else if (petChoice == 3) {
            return new Teacher(in.acceptInt("What is the teacher's age?"), in.acceptString("What is the teacher's name?"));
        } else{
            throw new IllegalArgumentException("Must enter a valid number as input");
        }

    }


}
