package TypeCasting;

public class CastingDemo {

    public void wideningCasting () {
        float firstNumber = 50.393f;
        System.out.println("Before converting " + firstNumber);

        int secondNumber = (int)firstNumber;
        System.out.println("After converting " + secondNumber);
    }

    public void narrowCasting () {
        int firstNumber = 50;
        System.out.println("Before converting " + firstNumber);

        float secondNumber = firstNumber;
        System.out.printf("After converting " + secondNumber);
    }
}
