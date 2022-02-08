package arraylist;

import java.util.ArrayList;

public class GroceryList {

    private ArrayList<String> groceries = new ArrayList<String>();

    public ArrayList<String> getGroceries() {
        return groceries;
    }

    public void addGroceryItem(String item) {
        groceries.add(item);
    }

    public void printGroceries() {
        System.out.println("You have " + groceries.size() + " items in your grocery list");
        for (int i = 0; i < groceries.size(); i++) {
            System.out.println((i + 1) + ". " + groceries.get(i));
        }
    }

    public void modifyGroceryItem(String currentItem, String newItem) {
        int position = findItem(newItem);
        if (position >= 0) {
            modifyGroceryItem(position, newItem);
        }
    }

    private void modifyGroceryItem(int position, String newItem) {
        groceries.set(position, newItem);
        System.out.println("Grocery Item " + (position + 1) + " has been modified");
    }

    public void removeGrocery(String item) {
        int position = findItem(item);
        if (position >= 0) {
            removeGrocery(position);
        }
    }

    private void removeGrocery(int position) {
        groceries.remove(position);
    }


    private int findItem(String searchItem) {
        return groceries.indexOf(searchItem);
    }

    public boolean onFIle(String searchItem) {
        int position = findItem(searchItem);
        if (position > 0) {
            return true;
        } else {
            return false;
        }

    }

}
