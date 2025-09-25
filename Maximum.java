import java.util.Scanner;

public class Maximum {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Introduction message
        System.out.println("This program finds the maximum of three integer numbers.");

        // Prompt user for input
        System.out.print("Enter the 1st integer: ");
        int number1 = input.nextInt();

        System.out.print("Enter the 2nd integer: ");
        int number2 = input.nextInt();

        System.out.print("Enter the 3rd integer: ");
        int number3 = input.nextInt();

        // Determine the maximum value
        int max;
        if (number1 >= number2 && number1 >= number3) {
            max = number1;
        } else if (number2 >= number1 && number2 >= number3) {
            max = number2;
        } else {
            max = number3;
        }

        // Display the result
        System.out.println("The maximum is " + max);
    }
}