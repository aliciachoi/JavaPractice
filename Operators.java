// Week3 Lab3 Exercise1
// https://onlinestudy.york.ac.uk/courses/1490/pages/week-3-lab-3?module_item_id=110580

public class Operators {

    public static void main(String[] args) {
        Operators op = new Operators(args[0], args[1], args[2]);
    }

    int result;
    String operatorType;
    int firstNum;
    int secondNum;

    public Operators(String operatorTypeIn, String firstNumIn, String secondNumIn) {

        operatorType = operatorTypeIn;
        try {
            firstNum = Integer.parseInt(firstNumIn);
            secondNum = Integer.parseInt(secondNumIn);

            if (operatorTypeIn.equalsIgnoreCase("add")) {
                result = firstNum + secondNum;
                System.out.println(firstNum + " + " + secondNum + " = " + result);
            } else if (operatorTypeIn.equalsIgnoreCase("subtract")) {
                result = firstNum - secondNum;
                System.out.println(firstNum + " - " + secondNum + " = " + result);
            } else {
                System.out.println("error: operator not recognised");
            }

        } catch (NumberFormatException e) {
            System.out.println("error cannot convert " + firstNumIn + " and " + secondNumIn + " to integers");
        }
    }

}
