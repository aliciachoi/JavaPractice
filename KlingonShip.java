// Week2 Lab1 Exercise1
// https://onlinestudy.york.ac.uk/courses/1490/pages/week-2-lab-1?module_item_id=110539

import java.util.Scanner;

public class KlingonShip {

    public static void main(String[] args) {
        KlingonShip ks = new KlingonShip();
        ks.promptSettings();
        ks.displayKlingonDetails();
    }

    double photonPower;
    int threatFactor;
    double cosmicProximity;

    //Put the displayKlingonDetails()and getDangerLeve() methods below.
    public void displayKlingonDetails()
    {
        System.out.println("photonPower: "+ photonPower);
        System.out.println("threatFactor: "+ threatFactor);
        System.out.println("cosmicProximity: "+ cosmicProximity);
        System.out.println("DangerLevel: " + getDangerLevel() );// calling the get method within the print method
    }

    public double getDangerLevel()
    {
        double dangerLevel;
        dangerLevel = (photonPower * threatFactor)/cosmicProximity;
        return dangerLevel;// note the difference between return and display using  System.out.println
    }

    public void promptSettings()
    {
        Scanner sc=new Scanner(System.in); // creating a scanner object to take inputs

        // the following takes inputs for each variable. Note that one scanner object is sufficient for all three prompts. Also not the different usage of sc.nextInt vs sc.nextDouble
        System.out.println("Enter the Photon Power ");
        photonPower = sc.nextInt();

        System.out.println("Enter the Threat Factor ");
        threatFactor = sc.nextInt();

        System.out.println("Enter the Cosmic Proximity ");
        cosmicProximity = sc.nextDouble();
    }

}


