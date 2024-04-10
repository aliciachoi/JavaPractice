// Week3 Lab1 Exercise2
// https://onlinestudy.york.ac.uk/courses/1490/pages/week-3-lab-1?module_item_id=110574

public class Cat extends Animal {
    private int livesLeft = 9;
    private String catLifeDisplay;

    public Cat(String nameIn) {
        super(nameIn);
    }

    public int getLivesLeft() {
        return livesLeft;
    }

    public void loseLife() {
        --livesLeft;
    }

    public String toString() {
        if (getLivesLeft() > 0) {
            catLifeDisplay = "; The cat has " + getLivesLeft() + " left";
        } else if (getLivesLeft() == 0) {
            catLifeDisplay = "; The cat is dead";
        }
        return super.toString() + catLifeDisplay;
    }
}
