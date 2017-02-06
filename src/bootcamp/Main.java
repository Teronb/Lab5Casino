package bootcamp;

        import java.util.Scanner;

/* Created by Teron Briggs
 * 2/5/2017
 * Casino Teron
 * Prompt the user to choose sides, then tap the key. Continue will be a option to keep playing.
 */

public class Main {

    public static void main(String[] args) {
        // Welcome to my Casino
        System.out.println("Hello Welcome to Casino Teron, where everyone's a Winner! :)");
        String userInput = ("Y");
        Scanner scan = new Scanner(System.in);

        while (userInput.equalsIgnoreCase("Y")) {

            System.out.println();
            // Ask user for number on sides of dice
            System.out.print("Enter a number of sides for both dice to roll:");
            System.out.println();

            // asked for number of sides
            int sides = scan.nextInt();
            // Pick up both dice & roll
            System.out.println("So here's your roll, choose any number on the keyboard to roll. ");

            // Asked user to roll the dice.
            scan.nextInt();

            // Looking for the number on the dice.
            int number = roll(sides);
            int number2 = roll(sides);

            //Print results of numbers and Total
            System.out.println("Number = " + number);
            System.out.println("Number2 = " + number2);
            System.out.println("Your dice = " + (number + number2));
            System.out.println();

            // Ask the user if they like to continue or not
            System.out.println("Continue Y/N ? ");

            userInput = scan.next();
        }
    }

    // New method used to generate random number.
    public static int roll(int sides) {
        int n = (int) ((Math.random() * sides + 1));
        return n;
    }
}
