/**
 *
 */
package main;

import model.Game;
import model.Hero;
import model.Labyrinth;
import model.Monster;
import view.View;
import view.GameEngineGraphical;
import controller.Controller;

/**
 * @author bentoune2u
 *
 */
public class Main {


	//methode interaction pour le sprint 1
	public static void interaction(Hero h, GameEngineGraphical engine) throws InterruptedException {
		boolean fin = false;
		System.out.println("****les LabyFlous****\n");
		System.out.println("Deplacement : \n haut : z \n bas : s \n gauche : q \n droite : d\n");
		System.out.println("e pour quitter \n");
		System.out.println("Position de base : \n");
		h.print();
		System.out.println("\n");

		engine.run();
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws InterruptedException {

		// creation du jeu particulier et de son afficheur
		Game game = new Game(new Labyrinth(1));
		View painter = new View(game);
		Controller controller = new Controller(game, painter);

		// classe qui lance le moteur de jeu generique
		GameEngineGraphical engine = new GameEngineGraphical(game, painter, controller);

		Hero h = game.getHero();
		interaction(h, engine);
	//	Monster m = game.getMonster();
	//	interaction(m, engine);
	}

}
