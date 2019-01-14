/*
 * Purpose : Demonstrates how derived class variables behave/react when pointing to parent class variables
 * Point : BaseClass or ParentClass can reference child objects and not vice-versa
 *
 * Date: 30-December-2018
 */

package myRunTimePolymorphismTests;

class Parent {
	// Some Member variables
	// Some Methods

} // EO Parent

class ChildOne extends Parent {
	// Some Member variables
	// Some Methods

} // EO ChildOne

class ChildTwo extends Parent {
	// Some Member variables
	// Some Methods

} // EO ChildTwo

public class InheritanceWhichStmtsAreCorrect {

	@SuppressWarnings("unused") // Hiding warning to help focus on concept
	public static void main(String[] args) {

		Parent p;
		p = new Parent(); // Correct
		p = new ChildOne(); // Correct
		p = new ChildTwo(); // Correct

		ChildOne o;
		// o = new Parent(); // ** InCorrect ** CE: Type mismatch: cannot convert from
		// Parent to ChildOne
		o = new ChildOne();
		// o = new ChildTwo(); // ** InCorrect ** CE: Type mismatch:

		ChildTwo t;
		// t = new Parent(); // ** InCorrect ** CE: Type mismatch: cannot convert from
		// Parent to ChildTwo
		// t = new ChildOne(); // ** InCorrect ** CE: Type mismatch:
		t = new ChildTwo();

		System.out.println("Program Execution Complete!!");

	}

}
