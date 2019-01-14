/*
 * Purpose : shows how runtime polymorphism works. Displays the behavior of methods and attributes
 * Date: 31-December-2018
 */

package myRunTimePolymorphismTests;

class BaseClass {

	int attribute = 1000;

	void method() {
		System.out.println("Base Class Method");
	} // Regular method

	String returnAtribute() {
		return "Base Class Attribute : " + this.attribute;
	} // Getter Method
}

class DerivedClass extends BaseClass {
	int attribute = 1000 + 1000; // Note compiler does not complain of having the same attribute

	void method() {
		System.out.println("Derived Class Method");
	} // Regular method

	String returnAtribute() {
		return "Derived Class Attribute : " + this.attribute;
	} // Getter Method
}

public class MyRunTimePolyTest {

	public static void main(String[] args) {
		BaseClass bc = new BaseClass();
		bc.method();
		System.out.println("Attribute of BC : " + bc.attribute);

		DerivedClass dc = new DerivedClass();
		dc.method();
		System.out.println("Attribute of DC : " + dc.attribute);

		// Runtime Polymorphism in display here
		System.out.println("\n-----'bc = dc;'-----");
		bc = dc;
		bc.method(); // Even though bc has a method of its own, since it is pointing to dc, it calls the derived method
		System.out.println("\nEven though methods are called correctly b'cos of RunTime Polymorphism. Attributes are not overridden : " + bc.attribute);
		System.out.println("To call the attributes of DC use the proper object: " + dc.attribute);
		System.out.println("OR create a getter method and override that. " + bc.returnAtribute());

	}

}
