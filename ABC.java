class Operators{
	int arithmetic(double x, double y,char a){
		System.out.println("x="+x+"  y="+y);
		System.out.println();
		System.out.println("_________________________________________");
		System.out.println("x+y="+(x+y));
		System.out.println("x%y="+(x%y));
		System.out.println("x/="+(x/=2));
		System.out.println("--------------------");
		System.out.println("a+5= "+(a+5));
		System.out.println("a+\'5\'=  "+(a+'5'));
		return 0;

	}
	int compound(){
		return 0;

	}
	private static int incrementAndDecrement(){
		int y=1;
		do{
			System.out.print(y+++"");
		}
		while(y<=10);
		System.out.println("");
		return 0;

	}
	int relational(){
		return 0;

	}
	int booleanOp(boolean a){
		a^=false;	
		System.out.println("a= "+a);

		return 0;

	}
	int bitwise(){
		return 0;

	}
	int conversion(){
		return 0;

	}
	int commandline(){
		return 0;

	}
	public static void main (String... args){
	//	System.out.println("Main Method!");
	//	System.out.println("_________________________________________");
	//	Operators obj1= new Operators();
		//obj1.arithmetic(Float.parseFloat(args[0]), Float.parseFloat(args[1]),args[2].charAt(0));
		//obj1.booleanOp(Boolean.parseBoolean(args[3]));
		incrementAndDecrement();
	}
}

/*class ABC extends Operators{

	public static void	main(String...a){
		incrementAndDecrement();
	}



}*/