// https://onlinestudy.york.ac.uk/courses/1490/pages/week-3-lab-1?module_item_id=110574

public class InterestAccount extends Account {

    public static void main(String args[]) {
        InterestAccount myacc = new InterestAccount(10000, 0.25);
        myacc.addMonthlyInterest();
        System.out.println(myacc.toString());
        myacc.setMonthlyInterestRate(0.1);
        myacc.addMonthlyInterest();
        System.out.println(myacc.toString());
    }

    private double monthlyInterestRate; //interest rate
    public double monthlyInterest;

    public InterestAccount(double balance, double monthlyInterestRateIn) {
        super(balance);
        monthlyInterestRate = monthlyInterestRateIn;
    }

    public void addMonthlyInterest() {
        monthlyInterest = getBalance() * monthlyInterestRate;
        credit(monthlyInterest);
    }

    // Getters & setters
    public double getMonthlyInterestRate() {
        return monthlyInterestRate;
    }

    public void setMonthlyInterestRate(double newMonthlyInterestRate) {
        monthlyInterestRate = newMonthlyInterestRate;
    }

    public String toString() {
        return super.toString() + " Monthly Interest Rate: " + monthlyInterestRate;
    }
}
