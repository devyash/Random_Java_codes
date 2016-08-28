abstract class MU{
	void fiyc(){
		System.out.println("MU will do it!");
	}
	abstract void syc();
	abstract void tyc();
	void foyc(){
		System.out.println("MU will do it!");
	}
}

class Tcet extends MU{
	void syc{
		System.out.println("2nd year Tcet will do it!");
	}
	void tyc{
		System.out.println("3rd year Tcet will do it!");
	}
}

class Rgit extends MU{
	void syc{
		System.out.println("2nd year Rgit will do it!");
	}
	void tyc{
		System.out.println("3rd year Rgit will do it!");
	}
}

class CollegeTest{
	public static void main(String[] args) {
		Tcet obj1 = new Tcet();
		obj1.fiyc();
		obj1.syc();
		obj1.tyc();
		obj1.foyc();
	}
}