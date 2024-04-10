// Week1 Lab2 Exercise2, Week1 Lab3 Exercise 2, Week2 Lab1 Exercise2,
// https://onlinestudy.york.ac.uk/courses/1490/pages/week-1-lab-3?module_item_id=110521
// https://onlinestudy.york.ac.uk/courses/1490/pages/week-1-lab-2?module_item_id=110517
// https://onlinestudy.york.ac.uk/courses/1490/pages/week-2-lab-1?module_item_id=110539

import java.util.Scanner;

public class Person {

    public static void main(String[] args) {
        Person sj = new Person();
        sj.displayDetails();
        sj.checkPulse();
        sj.checkAbuser();
        sj.promptProfile();
        sj.displayProfile();
    }

    double cmHeight;
    double kgWeight;
    boolean smoker = true;
    int weeklyAlcoholUnits; // 1 pint = 2 units, 1 short = 1 unit)
    final int RWAL = 21; //RWAL - Recommended Weekly Alcohol Limit
    int restPulse;
    char gender = 'm'; // m, f

    public void displayDetails() {
        System.out.println("Gender: " + gender);
        System.out.println("Height: " + cmHeight + "cm");
        System.out.println("Weight: " + kgWeight + "kg");
        System.out.println("Smoker? " + smoker);
        System.out.println("Alchol units consumbed weekly: " + weeklyAlcoholUnits);
        System.out.println("Pulse at rest: " + restPulse);
    }

    public void promptProfile() {
        Scanner sc = new Scanner(System.in); // similar usage of scanner as in previous exercise
        System.out.println("What is your weight in kg? ");
        kgWeight = sc.nextInt();

        System.out.println("What is your height in cm? ");
        cmHeight = sc.nextInt();

        System.out.println("How many units do you drink weekly? ");
        weeklyAlcoholUnits = sc.nextInt();
        System.out.println("What is your pulse at rest? ");
        restPulse = sc.nextInt();
    }

    public double getBMI() // calculate and return BMI value
    {
        double BMI;
        BMI = kgWeight / (cmHeight * cmHeight) * 10000;
        return BMI;
    }

    public boolean checkPulse() {
        boolean healthyPulse;
        healthyPulse = ((restPulse > 30) && (restPulse < 180));
        return healthyPulse;
    }

    public boolean checkAbuser() {
        boolean abuser;
        abuser = ((weeklyAlcoholUnits > RWAL) || (smoker));
        return abuser;
    }

    public void displayProfile() {
        System.out.println("Health Profile");
        //System.out.println("Healthy pulse check = " + checkPulse());
        //System.out.println("Abusing Body = " + checkAbuser());
        System.out.println("BMI = " + getBMI());
    }

    //Put curseAndSwear method here
    public void curseAndSwear() {
        int randNum = (int) (Math.random() * 5) + 1; // randomly generate a number between 1-5.
        String message; // declare the message variable to store the cursed phrases
        switch (randNum) // switch condition for different cases
        {
            case 1:
                message = "Oh damn!! What a nuisance";
                break;
            case 2:
                message = "Bastard";
                break;
            case 3:
                message = "What an idiot";
                break;
            case 4:
                message = "Bloody hell";
                break;
            case 5:
                message = "Bugger off";
                break;
            default:
                message = "error"; // a default case for invalid case being detected.
                // Not necessary here since a valid case will always be detected by the loop
                // However, this is considered good programming structure for better code readability and robustness
        }
        System.out.println(randNum);
        System.out.println(message);
    }
}
