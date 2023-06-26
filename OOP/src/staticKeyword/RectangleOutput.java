package staticKeyword;

import java.util.Scanner;

public class RectangleOutput {
    public static void main (String[] args) {
        Scanner input = new Scanner(System.in);
        for (int i = 1; i <= 4; i++) {

            System.out.println("Enter length of rectangle:");
            float length = input.nextFloat();
            System.out.println("Enter breadth of rectangle:");
            float breadth = input.nextFloat();

            System.out.println("The area of the rectangle is = " + AreaOfRectangle.Area(length, breadth));
        }



    }
}
