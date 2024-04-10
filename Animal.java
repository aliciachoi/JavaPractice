// https://onlinestudy.york.ac.uk/courses/1490/pages/week-3-lab-1?module_item_id=110574
public class Animal {

    public static void main(String[] args) {
        Dog mydog = new Dog("Labrador", 60);
        System.out.println(mydog.toString());
        mydog.setExerciseTime(90);
        System.out.println(mydog.toString());

        // test get method;
        System.out.println("the changed exercise time is: " + mydog.getExerciseTime());

        Cat mycat = new Cat("Ragdoll");
        mycat.getLivesLeft();
        System.out.println(mycat.toString());
        mycat.loseLife();
        System.out.println(mycat.toString());
        mycat.loseLife();
        mycat.loseLife();
        mycat.loseLife();
        mycat.loseLife();
        mycat.loseLife();
        // test get method;
        System.out.println("the remaining life at this point is " + mycat.getLivesLeft());
        mycat.loseLife();
        mycat.loseLife();
        mycat.loseLife();
        System.out.println(mycat.toString());
    }

    private String name;

    public Animal(String nameIn) {
        name = nameIn;
    }

    public String getName() {
        return name;
    }

    public String toString() {
        return "Animal name: " + name;
    }
}
