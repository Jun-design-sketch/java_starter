package com.in28minutes.tips.nonaccess.package1;

// it cannot be extended
final class FinalClass {

}

//class SomeClass extends FinalClass {
//
//}

class SomeClass {
	final public void doSomething() {
	}

	public void doSomethingElse(final int arg) {
//		arg = 6;
	}
}

class ExtendingClass extends SomeClass {
//	@Override
//	public void doSomething() {
//	}
}

public class FinalNonAcessModifierRunner {
	public static void main(String[] args) {
		// variable can changed
		int i = 5;
		i = 7;

		// final variable keep initial value
		final int j = 6;
//		j = 3;

	}
}
