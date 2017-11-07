package view;

import model.Game;
import controller.Controller;

/**
 * @author Horatiu Cirstea, Vincent Thomas
 *
 * moteur de game generique.
 * On lui passe un game et un afficheur et il permet d'executer un game.
 */
public class GameEngineGraphical {

	/**
	 * le game a executer
	 */
	private Game game;

	/**
	 * l'afficheur a utiliser pour le rendu
	 */
	private View gamePainter;

	/**
	 * le controlleur a utiliser pour recuperer les commandes
	 */
	private Controller gameController;

	/**
	 * l'interface graphique
	 */
	private GraphicalInterface gui;

	/**
	 * construit un moteur
	 *
	 * @param game
	 *            game a lancer
	 * @param gamePainter
	 *            afficheur a utiliser
	 * @param gameController
	 *            controlleur a utiliser
	 *
	 */
	public GameEngineGraphical(Game game, View gamePainter, Controller gameController) {
		// creation du game
		this.game = game;
		this.gamePainter = gamePainter;
		this.gameController = gameController;
	}

	/**
	 * permet de lancer le game
	 */
	public void run() throws InterruptedException {

		// creation de l'interface graphique
		this.gui = new GraphicalInterface(this.gamePainter,this.gameController);

    boolean fin = false;
		// boucle de game
		while (!fin) {
			// demande controle utilisateur
			this.gameController.getUserCommand();
			// fait evoluer le game
			fin = this.game.evolve(this.gameController.getCommand());
			// affiche le game
			this.gui.paint();
			// met en attente
			Thread.sleep(100);
		}
	}

}
