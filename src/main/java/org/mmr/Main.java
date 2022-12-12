package org.mmr;

/*
    ### Welcome to my solution of task "PlusOne" ###

    author: Maks Martynenko
 */

public class Main { // In this class I'm going to test my solution

    private final static int[] array = {1, 3, 5, 9}; //

    public static void main(String[] args) { // Main is just test method


        print("Array before increment: ");
        show(array);

        int[] result = Solution.plusOne(array); //creating an array for result of my solution

        print("\nArray after increment:  ");
        show(result);
    }

    private static void show(int[] array) { // The method which prints any integer array
        for (int j : array) {
            System.out.print(" [" + j + "]");
        }
    }

    private static void print(String text) { // The method which helps us to improve code-reading
        System.out.print(text);
    }
}