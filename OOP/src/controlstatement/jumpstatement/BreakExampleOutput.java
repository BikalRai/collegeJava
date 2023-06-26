package controlstatement.jumpstatement;

public class BreakExampleOutput {
    public static void main (String[] args) {
        BreakExample breakOutput = new BreakExample();
        breakOutput.breakExample();

        System.out.println("---------------");

        ContinueExample continueExample = new ContinueExample();
        continueExample.contExample();
    }
}
