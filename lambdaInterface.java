
@FunctionalInterface
interface MathOperation {
    int operate(int a, int b);
}

public class lambdaInterface {
    public static void main(String[] args) {
        MathOperation add = (a, b) -> a + b;
        MathOperation multiply = (a, b) -> a * b;

        System.out.println("Sum: " + add.operate(5, 3));        // Output: 8
        System.out.println("Product: " + multiply.operate(5, 3)); // Output: 15
    }
}
