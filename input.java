/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kp.programs;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class input{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);

        // 1. Prompt for two integers
        System.out.print("Enter the first integer: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter the second integer: ");
        int num2 = scanner.nextInt();

        // 2. Prompt for a floating-point number
        System.out.print("Enter a floating-point number: ");
        double floatNum = scanner.nextDouble();

        // 3. Prompt for a single character
        System.out.print("Enter a single character: ");
        char character = scanner.next().charAt(0);

        // 4. Prompt for a boolean value
        System.out.print("Enter a boolean value (true/false): ");
        boolean boolVal = scanner.nextBoolean();

        // Consume newline left by nextBoolean()
        scanner.nextLine();

        // 5. Prompt for user's name
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        // Perform calculations and display results
        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double floatResult = floatNum * 2;
        char nextChar = (char)(character + 1);
        boolean oppositeBool = !boolVal;

        System.out.println("\nSum of " + num1 + " and " + num2 + " is: " + sum);
        System.out.println("Difference between " + num1 + " and " + num2 + " is: " + difference);
        System.out.println("Product of " + num1 + " and " + num2 + " is: " + product);
        System.out.println(floatNum + " multiplied by 2 is: " + floatResult);
        System.out.println("The next character after '" + character + "' is: " + nextChar);
        System.out.println("The opposite of " + boolVal + " is: " + oppositeBool);
        System.out.println("Hello, " + name + "!");

        scanner.close();
    }
    
}
