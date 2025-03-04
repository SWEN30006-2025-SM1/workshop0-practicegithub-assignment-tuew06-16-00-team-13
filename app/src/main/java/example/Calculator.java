package example;

public class Calculator {
    public int add(int a, int b) {
        // TODO: Implement this method
        return a + b;
    }

    public int minus(int a, int b) {
        // TODO: Implement this method
        if (a > b) {
            return a - b;
        } else if (b > a) {
            return b - a;
        }else {
            return 0;
        }
    }

    public int multiply(int a, int b) {
        // TODO: Implement this method
        return a*b;
    }

    public double divide(int a, int b) {
        // TODO: Implement this method
        return a/b;
    }
}
