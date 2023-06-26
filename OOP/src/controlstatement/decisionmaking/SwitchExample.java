package controlstatement.decisionmaking;

public class SwitchExample {

    public void displaySwitch () {
        int marks =  50; // local variable

        switch (marks) {
            case 20:
                System.out.println("You have scaored 20 marks");
                break;
            case 30:
                System.out.println("You have scaored 30 marks");
                break;
            case 40:
                System.out.println("You have scaored 40 marks");
                break;
            default:
                System.out.println("Invalid marks");

        }
    }
}
