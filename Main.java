public class Main {

  
    static class Singleton {
        // static variable to hold single instance
        private static Singleton instance;

        // private constructor to prevent instantiation
        private Singleton() {
            System.out.println("Singleton instance created");
        }

        // public method to return the same instance
        public static Singleton getInstance() {
            if (instance == null) {
                instance = new Singleton();
            }
            return instance;
        }

        public void showMessage() {
            System.out.println("Hello from Singleton!");
        }
    }

    public static void main(String[] args) {
        // Testing Singleton
        Singleton obj1 = Singleton.getInstance();
        obj1.showMessage();

        Singleton obj2 = Singleton.getInstance();

        // Check if both references point to the same object
        System.out.println("Are obj1 and obj2 the same instance? " + (obj1 == obj2));
    }
}
