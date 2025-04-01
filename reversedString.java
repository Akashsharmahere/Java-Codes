public class reversedString {
    public static void main(String[] args) {
        String originalStr = "Hello";
        String reversedStr = new StringBuilder(originalStr).reverse().toString();
        
        System.out.println("Original string: " + originalStr);
        System.out.println("Reversed string: " + reversedStr);
    }
}
