// Week1 Lab2 Exercise3
// https://onlinestudy.york.ac.uk/courses/1490/pages/week-1-lab-2?module_item_id=110517

public class Amazing {
    public static void main(String args[]) {
        Amazing cal = new Amazing();
        cal.doCalculations();
    }

    //Put your data type declarations below. Here is an example
    float x = (float) 2.5;
    float y = (float) -1.5;
    int m = 18;
    int n = 4;
    float exp1, exp2, exp3;

    //Put the code for your calculations in this method.
    void doCalculations() {
        exp1 = x + n * y - (x + n) * y;
        System.out.println("Expression 1 yields a value of " + exp1);
        exp2 = m / n + m % n;
        System.out.println("Expression 2 yields a value of " + exp2);
        exp3 = 5 * x - n / 5;
        System.out.println("Expression 3 yields a value of " + exp3);
    }//End of doCalculations
}
