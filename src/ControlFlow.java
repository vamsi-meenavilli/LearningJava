import java.util.Locale;
import  java.util.Scanner;

public class ControlFlow {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Which of the following is not an IDE?");

        String choice1 = "Intellij IDEA";
        String choice2 = "VS Code";
        String choice3 = "Eclipse";
        String choice4 = "Sublime";

        System.out.println("Choose one of the following: " + choice1 + ", " + choice2 + ", " + choice3 + ", " + choice4);

        int attempts = 0;
        boolean repeat = true;
        String correct_answer = choice4.toLowerCase();

        while (repeat) {
            String user_answer = input.nextLine().toLowerCase();
            attempts ++;

            if (user_answer.equals(correct_answer)) {
                System.out.println("Congrats! That's correct answer.");
                repeat = false;
            }
            else {
                if (attempts == 3) {
                    System.out.println("You exhausted all the options!");
                    System.out.println("Correct answer is: " + correct_answer);
                    repeat = false;
                }
                else {
                    System.out.println("OOPS! That's incorrect answer.");
                    System.out.println("Do you want to try again?[yes/no]");
                    String retry = input.nextLine().toLowerCase();
                    if (!retry.equals("yes")) {
                        repeat = false;
                    }
                    else {
                        System.out.println("Enter the answer:");
                    }
                }
            }
        }
    }
}
