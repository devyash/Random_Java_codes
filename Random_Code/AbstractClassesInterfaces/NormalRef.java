class A1{
	public void msg(){
		System.out.println("Hello");
	}
}

class B1{
	public void msg(){
		System.out.println("Kem Cho");
	}
}

class C1 extends A1{
	public void msg(){
		System.out.println("Hallo");
	}
}

class NormalRef{
	public static void main(String[] args) {
		A1 a = new A1();
		a.msg();
		B1 b = new	B1();
		b.msg();
		C1 c = new C1();
		c.msg();
	}
}