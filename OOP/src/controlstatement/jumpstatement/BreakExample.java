package controlstatement.jumpstatement;

public class BreakExample {

    public void breakExample () {
        for (int i = 1; i <=10; i++){
            if (i == 5) {
                break;
            }

            System.out.println(i);
        }
    }
}
