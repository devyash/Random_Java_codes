public class FirstClass{

	public static void main(String... a){
		System.out.println("Hello World!");
		FirstClass obj1= new FirstClass();
		obj1.abc();
	}

	public int abc(){
		System.out.println("ABC!");
		return 0; 
	}
}