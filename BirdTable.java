// Week2 Lab3 Exercise1
// https://onlinestudy.york.ac.uk/courses/1490/pages/week-2-lab-3?module_item_id=110561

import javax.swing.*;

public class BirdTable {
    // main method begins execution of Java application
    public static void main(String args[]) {
        BirdTable bt = new BirdTable();
        bt.interactiveArray();
    }

    public void interactiveArray() {
        //Declare and build an array interactively - see the Temperature Project
        int[] blueTitsCount = new int[7];// note the syntax to create an array of integers
        String strElement;
        int intElement;

        //Enter the temperatures using inputDialog and a loop
        for (int i = 0; i < blueTitsCount.length; i++) {
            strElement = JOptionPane.showInputDialog("Enter Blue Tits Count " + (i + 1)); // using JOptionPane to create a GUI

            intElement = Integer.parseInt(strElement);
            blueTitsCount[i] = intElement;// assigning the i-th element of the array to the input
        }

        //Display Output using a histogram of '*' - see Histogram Projec
        String output = "Day\tNo. Blue Tits\tHistogram";

        for (int counter = 0; counter < blueTitsCount.length; counter++) {
            output += "\n" + counter + "\t" + blueTitsCount[counter] + "\t";
        // print bar of asterisks
            for (int stars = 0; stars < blueTitsCount[counter]; stars++) {
                output += "*";
            }
        }

        //Create a new text area object to hold the text
        JTextArea outputArea = new JTextArea();
        outputArea.setText(output);
        JOptionPane.showMessageDialog(null, outputArea,
                "Histogram Printing Program", JOptionPane.INFORMATION_MESSAGE);
    }

}
