// Week1 Lab3 Exercise1
// https://onlinestudy.york.ac.uk/courses/1490/pages/week-1-lab-3?module_item_id=110521

import java.util.Scanner;

public class HiLo {
    int random;

    public void generateNumber() {
        //The following lines generate and output a random number between 1 and 10
        random = (int) (Math.random() * 10) + 1;
    }

    //Write the guess() method below
    public void guess() {
        //Use scanner to accept a user input
        //Create a new scanner object to receive user input
        Scanner sc = new Scanner(System.in);// note how this is similar to creating an object in a test class
        System.out.println("Enter you guess ");
        int guess = sc.nextInt();

        //write your code below
        if (guess > random) // input is higher than the generated number
        {
            System.out.println("High");
        } else if (guess < random) // input is smaller than the generated number
        {
            System.out.println("Low");
        } else if (guess == random) // input is the same as the generated number
        {
            System.out.println("Hit");
        }
    }
}
