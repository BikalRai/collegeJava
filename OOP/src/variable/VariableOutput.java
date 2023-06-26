package variable;

import java.util.Scanner;

public class VariableOutput {
    public static void main(String[] args) {
        VariableDemo obj1 = new VariableDemo();
        obj1.getVariable();

        int num5 = obj1.number;
        num5 = 22;

        int num3 = VariableDemo.num1;

        num3 = 69;
        System.out.println(num3);

        System.out.println("Static Variable :::: " + VariableDemo.collegeName);

        System.out.println(num5);

        System.out.println("instance variable: " + obj1.number);

        FiveVariables obj2 = new FiveVariables();

        System.out.println("Static variable in five variables " + FiveVariables.hasLicense);
        System.out.println("String in five variables " + obj2.hello);
        System.out.println("PI value in five variables " + obj2.PI);
        System.out.println("Rad value in five variables " + obj2.rad);
        obj2.showMessage();
        System.out.println(obj2.hasLicense);

        System.out.println("Static Variable 2: " + VariableDemo.staticNum);
        Scanner input = new Scanner(System.in);

        System.out.println("Enter number");
        int number3 = input.nextInt();
        System.out.println("This is number 3: " + number3);




    }

}
