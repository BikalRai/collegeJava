package controlstatement.jumpstatement;

public class ContinueExample {
    public void contExample () {
        for (int i = 1; i <= 10; i++){
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
