package us.jackhoward;

import java.util.Scanner;

public class InputHelper {
    private Scanner keyboard = new Scanner(System.in);
    public InputHelper() {
    }

    public String acceptString(String message){
        System.out.println(message);
        String input = keyboard.nextLine();
        if (input != null){
            return input;
        }
        else {
            throw new IllegalArgumentException("Must input a name");
        }
    }

    public int acceptInt(String message){
        System.out.println(message);
        try{
            int input = Integer.parseInt(keyboard.nextLine());
            return input;
        }
        catch (Exception e) {
            throw new IllegalArgumentException("Must input a name");
        }
    }

    public boolean acceptBooleanY_N(String message) {
        System.out.println(message + " (y/n)");
        String answer = keyboard.nextLine();
        if (answer.equalsIgnoreCase("y")) {
            return true;
        } else if (answer.equalsIgnoreCase("n")) {
            return false;
        } else {
            throw new IllegalArgumentException("Must input a name");
        }
    }
}
