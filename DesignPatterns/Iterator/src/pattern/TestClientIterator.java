/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pattern;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author dyego
 */
public class TestClientIterator {
public static void main(String[] args) {
		ArrayList<Object> al = new ArrayList<Object>();
		al.add(new Integer(42));
		al.add("test");
		al.add(new Double("-12.34"));
		for (Iterator<Object> iter=al.iterator(); iter.hasNext(); )
			System.out.println( iter.next() );
		// Java 5 syntax (for-each loop)
		for (Object o:al)
			System.out.println( o );
	}
}
