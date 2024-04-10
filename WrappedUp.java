// Week2 Lab2 Exercise1
// https://onlinestudy.york.ac.uk/courses/1490/pages/week-2-lab-2?module_item_id=110549

import java.util.Scanner;

public class WrappedUp {

    public static void main(String[] args) {
        WrappedUp wrappedUp = new WrappedUp();
        wrappedUp.guessMyFavouriteThing();
    }
    public void guessMyFavouriteThing() {
        //Create a string object with your favourite animal, car ..whatever
        //e.g String favMotorBikeManufacturer = "bmw"
        String favAnimal = "cat";
        int strLength = favAnimal.length();
        char strFirstLetter = favAnimal.charAt(0);

        Scanner sc = new Scanner(System.in);
        System.out.println("Guess my favourite animal. It has " + strLength + " characters and begins with " + strFirstLetter);
        String guessAnimal = sc.next();

        // Now test if the guess was correct - ignore case
        if (favAnimal.equalsIgnoreCase(guessAnimal)) {
            System.out.println("correct");
        } else {
            System.out.println("wrong");
            //end guessing
        }
    }

}
