/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pattern;

/**
 *
 * @author dyego
 */
public class TestClientState  {
	public static void main(String[] args) {
		StateContext sc = new StateContext();
		sc.writeName("Monday");
		sc.writeName("Tuesday");
		sc.writeName("Wednesday");
		sc.writeName("Thursday");
		sc.writeName("Saturday");
		sc.writeName("Sunday");
	}
}
