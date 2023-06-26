package controlstatement.decisionmaking;

public class IfElseExample {
    public void displayIfElse() {
        int mathMarks = 50;
        int scienceMarks = 40;

        if (mathMarks >= 50 && scienceMarks >= 50){
            System.out.println("A");
        } else if (mathMarks >= 40 && scienceMarks >= 40) {
            System.out.println("Pass");
        } else {
        System.out.println("Fail...");
        }
    }
}
