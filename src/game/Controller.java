package game;

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

	public boolean getUserCommand() {
		System.out.println("Choisir le deplacement : \n");
		Scanner sc1= new Scanner(System.in);
		String str1 = sc1.nextLine();
		switch (str1) {
		//*-1 en fonction de l'origine de l'interface graphique future
		case "z" :
			//Haut
			game.getHero().deplacement(0, 1);
			break;
		case "s" :
			//Bas
			game.getHero().deplacement(0, -1);
			break;
		case "q" :
			//Gauche
			game.getHero().deplacement(-1, 0);
			break;
		case "d" :
			//Droite
			game.getHero().deplacement(1, 0);
			break;
		case "e" :
			System.out.println("C'est fini ! \n");
			System.out.println("Position finale : \n");
			return true;
		default :
			System.out.println("Mauvaise commande, deplacement par defaut : haut");
			game.getHero().deplacement(0, 1);
		}
		return false;
	}

	public void run() {
		boolean fin = false;
		while (!fin) {
			fin = getUserCommand();
			view.print();
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
}
