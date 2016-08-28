class A1{
	public void msg(){
		System.out.println("Hello");
	}
}

class B1 extends A1{
	public void msg(){
		System.out.println("Kem Cho");
	}
}

class C1 extends A1{
	public void msg(){
		System.out.println("Hallo");
	}
}

class PolyRef{
	public static void main(String[] args) {
		A1 a = new A1();
		a.msg();
		a = new	B1();
		a.msg();
		a = new C1();
		a.msg();
	}
}