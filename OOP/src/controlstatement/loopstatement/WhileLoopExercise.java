package controlstatement.loopstatement;

import java.util.Scanner;

public class WhileLoopExercise {
    public void palindrome () {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num = input.nextInt();
        int reverse = 0;
        int original_num = num;
        int remainder;

        while (num != 0) {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }

        if (reverse == original_num) {
            System.out.println(original_num + " is Palindrome number");
        } else {
            System.out.println(original_num + " is not Palindrome number");
        }
    }
}
