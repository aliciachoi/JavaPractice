// Week2 Lab1 Exercise3
// https://onlinestudy.york.ac.uk/courses/1490/pages/week-2-lab-1?module_item_id=110539

import java.util.Scanner;

public class MathDemo {

    public static void main(String[] args) {
        MathDemo mathDemo = new MathDemo();
        mathDemo.bestOfThree();
    }

    int Number1;
    int Number2;
    int Number3;

    public int generateLottoNumber() {
        int lottoNumber;// initialise the variable. Note that this is not an attribute of the class
        return lottoNumber = (int) (Math.random() * 59 + 1);
    }

    public void bestOfThree() {
        Scanner sc = new Scanner(System.in);

        System.out.println("Give three integers separated by Enter");
        Number1 = sc.nextInt();
        Number2 = sc.nextInt();
        Number3 = sc.nextInt();

        System.out.println("the largest number is " + getMax());
    }

    public int getMax() {
        int maxNum; //initialise a variable the store the larger number of a pair of numbers
        maxNum = Math.max(Number1, Number2); //compare the first two numbers and assign the larger one to maxNum
        maxNum = Math.max(maxNum, Number3); //compare the larger number of the first two with the third number and assign the larger one to maxNum. 
        return maxNum;
        // you can also write a if...else loop to compare the numbers
    }

}
