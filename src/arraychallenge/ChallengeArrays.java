package arraychallenge;

import java.util.Scanner;

public class ChallengeArrays {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        int[] integers = getIntegers(5);
        for (int i = 0; i < integers.length; i++) {
            System.out.println("Input at " + i + " is " + integers[i]);
        }
//        printArray(sortIntegers(integers));
    }

    private static int[] getIntegers(int num) {
        int[] arr = new int[num];
        System.out.println("Enter " + num + " numbers");

        for (int i = 0; i < arr.length; i++) {
            int input = scanner.nextInt();
            arr[i] += input;
        }
        printArray(sortIntegers(arr));
        return arr;
    }

    private static int[] sortIntegers(int[] integers) {
        int[] sorted = new int[integers.length];
        for (int i = 0; i < integers.length; i++) {

            sorted[i] = integers[i];

        }

        boolean flag = true;
        int temp;
        while (flag) {
            flag = false;
            for (int i = 0; i < sorted.length - 1; i++) {
                if (sorted[i] < sorted[i + 1]) {
                    temp = sorted[i];
                    sorted[i] = sorted[i + 1];
                    sorted[i + 1] = temp;
                    flag = true;
                }

            }
        }
        return sorted;
    }

    private static void printArray(int[] sorted) {
        System.out.println("Sorted numbers are");
        for (int i = 0; i < sorted.length; i++) {

            System.out.println(sorted[i]);
        }
    }
}
