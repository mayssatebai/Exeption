/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mayssa
 */


public class AppelMethod {

	public void method1() {
		try {
			this.method2();
		} catch (StackOverflowError e) {
			System.out.println("Exception: Dépassement de la pile (stack overflow) dans method1.");
		}
	}

	public void method2() {
		try {
			this.method1();
		} catch (StackOverflowError e) {
			System.out.println("Exception: Dépassement de la pile (stack overflow) dans method2.");
		}
	}

	public static void main(String[] args) {
		AppelMethod appel = new AppelMethod();
		appel.method1();
	}
}

