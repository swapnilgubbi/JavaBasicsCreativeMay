package polymorphysam;

public class Child extends Parent {

	public void Farm() {
		System.out.println("farm method from child class");
	}

	public void car() {
		System.out.println("car method from child class");
	}

	public static void furniture() {
		System.out.println("furniture method from child class");
	}

	public void bike() {
		System.out.println("bike method from child class");
	}

	public String property() {
		System.out.println("property method from child class");
		return "Creative";
	
	}

//	public void home() {
//		System.out.println("home method from child class");
//	}

	public static void main(String[] args) {
		Child c = new Child();
		c.car(); // child class car method
		c.home(); // parent class home method
		furniture();// child class furniture method
		c.property();

		
		Parent p = new Parent();
		p.bike();// Parent class bike method
		p.car(); // parent class car method
		p.furniture();

		// parent reference can be used to hold child class object
		
		p.property();
		

		Parent p1 = new Child();

		p1.car(); // child class car method
		p1.bike();// child class bike method
		p1.property();// child class property method
		
		
		

	}

}
