/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pattern;

import java.util.BitSet;

/**
 *
 * @author dyego
 */
public class TestClientBitSet {
	public static void main(String[] args) {
		// create BitSet and set some bits
		BitSet bitset = new BitSet();
		bitset.set(1);
		bitset.set(3400);
		bitset.set(20);
		bitset.set(47);
		for (BitSetIterator iter = new BitSetIterator(bitset); iter.hasNext(); ) {
			Boolean b = iter.next();
			String tf = (b.booleanValue() ? "T" : "F");
			System.out.print(tf);
		}
		System.out.println();
	}
}
