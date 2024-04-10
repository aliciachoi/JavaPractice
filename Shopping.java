// Week2 Lab3 Exercise2
// https://onlinestudy.york.ac.uk/courses/1490/pages/week-2-lab-3?module_item_id=110561

import java.util.ArrayList;

public class Shopping {

    public static void main(String[] args) {
        Shopping sl = new Shopping();

        sl.addItem("egg");
        sl.addItem("bread");
        sl.addItem("bacon");
        sl.addItem("tomato");
        sl.showItem(4);
        sl.listItems();
    }

    private ArrayList shoppingList;

    public Shopping() {
        shoppingList = new ArrayList();
    }

    public void addItem(String item) {
        shoppingList.add(item);
    }

    public int numberOfItems() {
        return shoppingList.size();
    }

    public void showItem(int itemNumber) {
        if ((itemNumber - 1) < numberOfItems()) {
            System.out.println(itemNumber + "-th item in shopping list is " + shoppingList.get(itemNumber - 1));
        }
    }

    public void listItems() {
        int index = 0;
        while (index < shoppingList.size()) {
            System.out.println(shoppingList.get(index));
            index++;
        }
    }
}

