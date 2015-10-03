/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package pattern;

/**
 *
 * @author dyego
 */
public class PizzaLover {
/*
     * Create all available pizzas and print their prices
     */
    public static void main (String args[]) {
        for (PizzaFactory.PizzaType pizzaType : PizzaFactory.PizzaType.values()) {
            System.out.println("Price of " + pizzaType + " is " + PizzaFactory.createPizza(pizzaType).getPrice());
        }
    }
}
