// Week1 Lab2 Exercise1
// https://onlinestudy.york.ac.uk/courses/1490/pages/week-1-lab-2?module_item_id=110517

public class Exciting {

    public static void main(String[] args) {
        Exciting ex = new Exciting();
        ex.displayDetails();
        Exciting ex1 = new Exciting();
        ex1.displayDetails();
    }

    //Put your declarations for a) beneath here
    double z;
    int count = 0;
    double cost = 3.45;
    char choice = 'X';
    boolean goodChoice = true;
    short lowest = 5;
    //Put your declarations and initialisations to b) beneath here

    //The naming convention of the declared variables uses lower Camel Case.
    double roomTemp = 25.0; // degree Celsius
    int jackpotBonus = 6;
    double popChina = 1.386; // billion. If counting exact number, i.e. without using billion, the variable should be declared as int
    boolean gameFinish = false;
    int plantDist = 100; // million km.   Assuming the resolution is at million km, otherwise, should be declared as double
    char alvlGrade = 'B'; // A*,B, C,D,E,U


    public void doit() {
        double x = 3.0;
        double y = 4.0;
        z = 2.0 * y + x / 4.0 - (x + y);
    }

    public void displayDetails() {
        System.out.print("z= ");
        System.out.println(z);

        //display the details for the variables you declared in a)
        System.out.println("count=" + count);
        System.out.println("cost=" + cost);
        System.out.println("choice=" + choice);
        System.out.println("goodChoice=" + goodChoice);
        System.out.println("lowest=" + lowest);

        //display the details for the variables you declared in b)
        System.out.println("The temperature in a room is " + roomTemp + " degree celsius");
        System.out.println("The number of the jackpot bonus ball is " + jackpotBonus);
        System.out.println("The population of China is " + popChina + " billion");
        System.out.println("Is the game finished? Answer: " + gameFinish);
        System.out.println("The interplanetary distances is " + plantDist + " million km");
        System.out.println("The A-level grade of the student is " + alvlGrade);
    }
}
