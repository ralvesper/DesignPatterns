/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pattern;

/**
 *
 * @author dyego
 */
public class DrawingAPI2 implements DrawingAPI {
   public void drawCircle(double x, double y, double radius) {
        System.out.printf("API2.circle at %f:%f radius %f\n", x, y, radius);
   }
}