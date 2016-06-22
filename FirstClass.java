class FirstClass{

	public static void main(String... a){
		System.out.println("Hello World!");
		FirstClass obj1= new FirstClass();
		obj1.abc();
	}

	int abc(){
		System.out.println("ABC!!");
		return 0;
	}
}