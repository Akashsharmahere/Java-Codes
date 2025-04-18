public class EvenOdd {
    public static String checkEvenOdd(int n) {
        return (n % 2 == 0) ? "Even" : "Odd";
    }

    public static void main(String[] args) {
        System.out.println(checkEvenOdd(7));  
    }
}
