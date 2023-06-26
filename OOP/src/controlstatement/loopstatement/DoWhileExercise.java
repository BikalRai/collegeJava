package controlstatement.loopstatement;

import java.util.Scanner;

public class DoWhileExercise {
    public void DoWhile (){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num = input.nextInt();
        int remainder, sum = 0, original_num;
        original_num = num;

         do {
            remainder = num % 10;
            sum += remainder * remainder * remainder;
            num /= 10;
        } while (num != 0);

        if (sum == original_num) {
            System.out.println(original_num + " is armstrong number");
        } else {
            System.out.println(original_num + " is not armstrong number");
        }
    }
}
