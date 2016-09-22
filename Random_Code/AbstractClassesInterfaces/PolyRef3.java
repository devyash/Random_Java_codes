class A1{
	String msg1="Hello";
	public void msg(){
		System.out.println(msg1);
	}
}

class B1 extends A1{
	String msg2="Kem Cho";
	public void msg(){
		System.out.println(msg2);
	}
}

class PolyRef2{
	public static void main(String[] args) {
		A1 a = new A1();
		System.out.println(a.msg1);
		a.msg();
		a = new	B1();
		a.msg();
		System.out.println(a.msg2);
		 
	}
}