package arraylist;

import java.util.Scanner;

public class ArrayList {
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
                    quit = true;
                    break;
                default:
                    printInstructions();
            }
        }
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
        int itemNo = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter replacement item: ");
        String newItem = sc.nextLine();

        groceryList.modifyList(itemNo - 1, newItem);
    }

    public static void removeItem() {
        System.out.println("Enter item number");
        int itemNo = sc.nextInt();
        sc.nextLine();
        groceryList.removeGrocery(itemNo - 1);
    }

    public static void searchItem() {
        System.out.println("Enter item to search for: ");
        String searchItem = sc.nextLine();
        if (groceryList.findItem(searchItem) != null) {
            System.out.println("Found " + searchItem + " in our grocery list");
        } else {
            System.out.println(searchItem + " was not found");
        }
    }
}