package arraylist;

import java.util.Scanner;
import java.util.ArrayList;

public class ArrayLists<S> {
    static Scanner sc = new Scanner(System.in);
    static GroceryList groceryList = new GroceryList();

    public static void main(String[] args) {
        boolean quit = false;
        int choice;
        printInstructions();
        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = sc.nextByte();
            sc.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceries();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    removeItem();
                case 4:
                    modifyItem();
                    break;
                case 5:
                    searchItem();
                    break;
                case 6:
                    processArrayList();
                case 7:
                    quit = true;
                    break;
                default:
                    printInstructions();
            }
        }
    }

    private static void processArrayList() {
        ArrayList<String> newArray = new ArrayList<String>();
        newArray.addAll(groceryList.getGroceries());

        ArrayList<String> newerArray = new ArrayList<String>(groceryList.getGroceries());

        String[] myArr = new String[groceryList.getGroceries().size()];
        myArr=groceryList.getGroceries().toArray(myArr);
    }

    private static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options");
        System.out.println("\t 1 - To print the list of grocery items");
        System.out.println("\t 2 - To add an item to the list");
        System.out.println("\t 3 - To modify an item in the list");
        System.out.println("\t 4 - To remove an item from the list");
        System.out.println("\t 5 - To search for an item in the list");
        System.out.println("\t 6 - To quite the application");
    }

    private static void addItem() {
        System.out.println("Enter grocery item");
        groceryList.addGroceryItem(sc.nextLine());
    }

    public static void modifyItem() {
        System.out.println("Enter item number: ");
        String itemNo = sc.nextLine();
        sc.nextLine();

        System.out.println("Enter replacement item: ");
        String newItem = sc.nextLine();

        groceryList.modifyGroceryItem(itemNo, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter item number");
        String itemNo = sc.nextLine();
        groceryList.removeGrocery(itemNo);
    }

    public static void searchItem() {
        System.out.println("Enter item to search for: ");
        String searchItem = sc.nextLine();
        if (groceryList.onFIle(searchItem)) {
            System.out.println("Found " + searchItem + " in our grocery list");
        } else {
            System.out.println(searchItem + " was not found");
        }
    }
}