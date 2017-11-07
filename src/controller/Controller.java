package controller;

import model.Game;
import view.View;

import java.util.Scanner;

/**
 * Controleur du pattern MVC. Met a jour la vue et le modele en fonction des
 * entrees de l'utilisateur
 *
 * @author loicmarie
 * @version 1.0
 */
public class Controller {

	/**
	* Modele. Represente l'etat du jeu a un instant donne
	*
	* @see Game
	*
	* @see Controller#getGame()
	* @see Controller#setGame(Game)
	*/
	private Game game;

	/**
	* Vue. Permet d'afficher le modele
	*
	* @see View
	*
	* @see View#getView()
	* @see View#setView(View)
	*/
	private View view;

	/**
	* Commande actuelle. Entree par l'utilisateur, permet de faire evoluer
	* le modele
	*
	* @see Cmd
	*
	* @see Cmd#getCommand()
	* @see Cmd#setCommand(Cmd)
	*/
	private Cmd command;

	/**
	* Constructeur du controleur
	*
	* @param game
	* 						Le modele
	* @param view
	* 						La vue
	*
	* @see Controller#game
	* @see Controller#view
	*/
	public Controller(Game game, View view) {
		this.game = game;
		this.view = view;
	}

	/**
	* Recupere l'entree de l'utilisateur et agit sur l'environnement en consequence
	*/
	public void getUserCommand() {
		System.out.println("Choisir le deplacement : \n");
		Scanner sc1= new Scanner(System.in);
		String str1 = sc1.nextLine();
		this.command = this.inputToCommand(str1);
	}

	/**
	* Convertit l'entree texte de l'utilisateur en commande
	*
	* @param input
	* 						L'entree texte de l'utilisateur
	* @return La commande correspondante
	*
	* @see Cmd
	*/
	public Cmd inputToCommand(String input) {
		switch (input) {
		//*-1 en fonction de l'origine de l'interface graphique future
		case "z" : return Cmd.UP;
		case "s" : return Cmd.DOWN;
		case "q" : return Cmd.LEFT;
		case "d" : return Cmd.RIGHT;
		case "e" : return Cmd.END;
		default : return Cmd.IDLE;
		}
	}

	/**
	* Lance la partie
	*/
	public void run() {
		boolean fin = false;
		while (!fin) {
			this.getUserCommand();
			fin = this.game.evolve(this.command);
			this.view.print();
		}
	}

	/**
	* Retourne le modele
	*
	* @return Le modele
	*
	* @see Game
	*/
	public Game getGame() {
		return game;
	}

	/**
	* Met a jour le modele
	*
	* @param game
	* 						Le nouveau modele
	* @see Game
	*/
	public void setGame(Game game) {
		this.game = game;
	}

	/**
	* Retourne la vue
	*
	* @return La vue
	*
	* @see View
	*/
	public View getView() {
		return view;
	}

	/**
	* Met a jour la vue
	*
	* @param view
	* 						La nouvelle vue
	* @see View
	*/
	public void setView(View view) {
		this.view = view;
	}

	/**
	* Retourne la commande actuelle
	*
	* @return La commande actuelle
	*
	* @see Cmd
	*/
	public Cmd getCommand() {
		return command;
	}

	/**
	* Met a jour la commande actuelle
	*
	* @param command
	* 						La nouvelle commande actuelle
	* @see Cmd
	*/
	public void setCommand(Cmd command) {
		this.command = command;
	}
}
