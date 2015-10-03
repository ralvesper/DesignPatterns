/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pattern;

import java.util.BitSet;
import java.util.Iterator;
import java.util.NoSuchElementException;

/**
 *
 * @author dyego
 */
public class BitSetIterator implements Iterator<Boolean> {
	private final BitSet bitset;
	private int index;

	public BitSetIterator(BitSet bitset) {
		this.bitset = bitset;
	}

	public boolean hasNext() {
		return index < bitset.length();
	}

	public Boolean next() {
		if (index >= bitset.length()) {
			throw new NoSuchElementException();
		}
		boolean b = bitset.get(index++);
		return new Boolean(b);
	}

	public void remove() {
		throw new UnsupportedOperationException();
	}
}
