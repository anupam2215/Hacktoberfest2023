interface Calculator {
    int calculate(int a, int b);
}

public class LambdaExample {
    public static void main(String[] args) {
        Calculator add = (a, b) -> a + b;
        Calculator subtract = (a, b) -> a - b;

        System.out.println("Addition: " + add.calculate(5, 3));
        System.out.println("Subtraction: " + subtract.calculate(5, 3));
    }
}
