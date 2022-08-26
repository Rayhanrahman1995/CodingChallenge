package aprilBatch;

public class Keita {
	// Global variable or class variable
	public String name; // variable declared
	public int age = 12; // variable initialized

	// create a default contructor
	public Keita() {
		System.out.println("Default");
	}

	// Parameterize constructor
	public Keita(String name) { // local varible
		this.name = name;
		System.out.println("Results: " + name);
	}

	// parameterize method
	public void method(int age) {
		this.age = age;
		System.out.println("My Age is: " + age);
	}

	public static void main(String[] args) {
		Keita obj = new Keita();
		System.out.println("Age: " + obj.age);
		Keita object = new Keita("Tenzin");
		object.method(25);
	}

}
