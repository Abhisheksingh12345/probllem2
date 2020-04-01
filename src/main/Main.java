package main;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner tell = new Scanner(System.in);
        System.out.println("Input the number of cards:");
        int noOfQuestion = (2 * tell.nextInt());
        int startingIndex = 0;
        String[] array = new String[noOfQuestion];
        for (int i = startingIndex, choiceNo = 1; i < array.length; i++) {
            System.out.println("The card #" + (choiceNo) + ":");
            array[i] = tell.nextLine();
            System.out.println("The definition of the card #" + (choiceNo) + ":");
            choiceNo++;
            i++;
            array[i] = tell.nextLine();
        }
        for (int i = startingIndex; i < array.length; i += 2) {
            System.out.println("Print the definition of " + array[i] + ":");
            String match = tell.nextLine();
            if (array[i + 1].equals(match)) {
                System.out.println("Correct answer.");
            } else {
                System.out.println("Wrong answer. The correct one is " + array[i + 1] + ".");
            }
        }

    }

}