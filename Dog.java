// Week3 Lab1 Exercise2
// https://onlinestudy.york.ac.uk/courses/1490/pages/week-3-lab-1?module_item_id=110574

public class Dog extends Animal {
    private int exerciseTime; // in minutes

    public Dog(String nameIn, int exerciseTimeIn) {
        super(nameIn);
        exerciseTime = exerciseTimeIn;
    }

    public int getExerciseTime() {
        return exerciseTime;
    }

    public void setExerciseTime(int newExerciseTime) {
        exerciseTime = newExerciseTime;
    }

    public String toString() {
        return super.toString() + "; Required daily exercise is " + exerciseTime + " minutes";
    }
}
