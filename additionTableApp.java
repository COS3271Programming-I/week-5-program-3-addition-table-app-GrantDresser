// Program Name: additionTableApp.java
// Grant Dresser
// 2/20/2026

import java.util.Scanner;

public class additionTableApp {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // ask the user for number between 3 and 20
        System.out.print("Enter a number from 3 to 20: ");
        int num = input.nextInt();

        System.out.println();

        // for loops to print the table
        for (int row = 1; row <= num; row++) {

            for (int col = 1; col <= num; col++) {

                // print addition result
                System.out.printf("%-4d", row + col - 1);
            }

            System.out.println();
        }

        input.close();
    }
}