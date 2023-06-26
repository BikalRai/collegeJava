package controlstatement.loopstatement;

import java.util.Scanner;

public class LoopExample {
    public void loopExample () {
        for (int i = 1; i < 5; i++) {
            System.out.println("i = " + i);
        }
    }

    public void loopName () {
        for (int i = 1; i < 5; i++) {
            System.out.println("Bikal Rai");
        }
    }

    public void multiTable () {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number");
        int num = input.nextInt();

        for(int i = 1; i <= 10; i++){
            System.out.println(i + " x " + num + " = " + (i * num));
        }
    }
}
