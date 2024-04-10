// Week3 Lab3 Exercise2

package student;

public class PhDStudent extends Student {

    public static void main(String[] args) {
        PhDStudent s = new PhDStudent();
        s.setID("SJ001");
        s.setCredits(100);
        s.displayDetails();
    }

    String researchArea;

    public void setResearchArea(String area) {
        researchArea = area;
    }

    public String getResearchArea() {
        return researchArea;
    }

    public void displayDetails() {
        System.out.println("Credits =" + super.getCredits());
        System.out.println("ID =" + super.getStudentID());
    }
}
