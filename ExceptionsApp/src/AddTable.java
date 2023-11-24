/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mayssa
 */
public class AddTable {
	public static void main(String[] args) {

		int[] array = new int[3];

		try {
			for (int i = 0; i < 4; ++i) {
				array[i] = i;
			}
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("Exception:  hors limite pour la length du tableau.");
		}

		for (int i = 0; i < array.length; ++i) {
			System.out.println(array[i]);
		}
	}
}



