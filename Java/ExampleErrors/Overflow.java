package ExampleErrors;

public class Overflow {
    public static void main(String[] args) {
        int value = Integer.MAX_VALUE;

        System.out.println(value);
        //System.out.println(value + 1);
        System.exit(0);
    }
}
