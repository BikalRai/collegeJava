package controlstatement.decisionmaking;

import java.util.Scanner;

public class IfElseExercise {
        int result;
    public void calc() {



        Scanner input = new Scanner(System.in);
        System.out.println("Enter first digit:");
        int num1 = input.nextInt();
        System.out.println("Enter second digit:");
        int num2 = input.nextInt();

        input.nextLine();
        System.out.println("Enter operator");
        String operator = input.nextLine();

        if (operator.equals( "+")) {
            result = num1 + num2;
        } else if (operator.equals("-")) {
            result = num1 - num2;
        } else if (operator.equals("*")) {
            result = num1 * num2;
        } else if (operator.equals("/")){
            result = num1 / num2;
        } else {
            System.out.println("Invalid operator");
        }

        System.out.println(num1 + " " + operator + " " + num2 + " = " + result);
    }
}
