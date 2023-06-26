package thiskeyword;

public class ThisExample {
    int x;

    public void display(int x) {
        this.x = x;
        System.out.println(x);
//        System.out.println(this.x);
    }

    public void print() {
        System.out.println(x);

    }
}
