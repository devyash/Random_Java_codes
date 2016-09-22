class A1{
	String msg="Hello";
	public void msg(){
		System.out.println(msg);
	}
}

class B1 extends A1{
	String msg="Kem Cho";
	public void msg(){
		System.out.println(msg);
	}
}

class C1 extends A1{
	String msg="Hallo";
	public void msg(){
		System.out.println(msg);
	}
}

class PolyRef2{
	public static void main(String[] args) {
		A1 a = new A1();
		System.out.println(a.msg);
		a.msg();
		a = new	B1();
		a.msg();
		System.out.println(a.msg);
		a = new C1();
		a.msg();
		System.out.println(a.msg);
	}
}