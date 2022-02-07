package arraylist;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceries = new ArrayList<String>();

    public void addGroceryItem(String item) {
        groceries.add(item);
    }

    public void printGroceries() {
        System.out.println("You have " + groceries.size() + " items in your grocery list");
        for (int i = 0; i < groceries.size(); i++) {
            System.out.println((i + 1) + ". " + groceries.get(i));
        }
    }

    public void modifyList(int position, String newItem) {
        groceries.set(position, newItem);
        System.out.println("Grocery Item " + (position + 1) + " has been modified");
    }

    public void removeGrocery(int position) {
        String theItem = groceries.get(position);
        groceries.remove(position);
        System.out.println("Groceries are not: ");
        printGroceries();
    }

    public String findItem(String searchItem) {
        boolean exists = groceries.contains(searchItem);
        int position = groceries.indexOf(searchItem);
        if (position >= 0) {
            return groceries.get(position);
        }
        return null;
    }
}
