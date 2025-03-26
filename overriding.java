class animal{
	static void display() {
		 System.out.println("animal makes sounds");
	 }
 }
 class dog extends animal{
	 static void display() {
		 System.out.println("dog is also a animal and it barks");
	 }
 }
 public class overriding{ 
	 public static void main(String[] args) {
		 animal a= new animal();
		 a.display();
		 
		 dog b= new dog();
		 b.display();
		 
		 animal c= new dog();
		 c.display();
		 
	 }
 }