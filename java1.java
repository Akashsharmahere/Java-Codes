public class java1{
    public void fullThrottle(){
        System.out.println("the car is going as fast as it can ");
    }

    public void speed(int maxspeed){
        System.out.println("maxspeed is"+ maxspeed);
    }
    public static void main(String[] args) {
        java1 obj = new java1();
        obj.fullThrottle();
        obj.speed(200);
    }
    
}