/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pattern;

/**
 *
 * @author dyego
 */
public interface Shape{
   public void draw();                                            // low-level
   public void resizeByPercentage(double pct);     // high-level
}
