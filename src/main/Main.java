/**
 * 
 */
package main;
import game.*;
import personage.*;

/**
 * @author bentoune2u
 *
 */
public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Game test = new Game();
		Hero h = test.getHero();
		
		h.print();
		h.deplacement(1,0);
		h.print();
		h.deplacement(1,-5);
		h.print();

	}

}
