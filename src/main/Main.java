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


	//methode interaction pour le sprint 1
	public static void interaction(Hero h, Controller controller) {
		boolean fin = false;
		System.out.println("****les LabyFlous****\n");
		System.out.println("Deplacement : \n haut : z \n bas : s \n gauche : q \n droite : d\n");
		System.out.println("e pour quitter \n");
		System.out.println("Position de base : \n");
		h.print();
		System.out.println("\n");

		controller.run();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Game game = new Game();
		View view = new View(game);
		Controller controller = new Controller(game, view);
		Hero h = game.getHero();
		interaction(h, controller);
	}

}
