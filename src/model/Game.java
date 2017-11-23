/**
 *
 */
package model;

import controller.Cmd;

/**
 * @author bentoune2u
 *
 */
public class Game {

	//Le personnage utilise par le joueur
	private Hero hero;
	public Hero getHero() {return hero;}
	public void setHero(Hero hero) {this.hero = hero;}


	/**
	 * constructeur de Game
	 */


	public Game() {
		this.setHero(new Hero(this));
	}

	/**
	 * Methode de test isOut
	 * @param x l'abscisse du personnage
	 * @param y l'ordonnee du personnage
	 * @return true si les coordonnees sont hors du jeux
	 */
	public boolean isOut(int x,int y)
	{
		if ((x<0)||(y<0)) {
			return true;
		}
		//need to be changed with labyrinth dimensions
		
		return false;
	}

	/**
	* Fait evoluer l'etat du jeu en fonction de la commande actuelle de l'utilisateur
	*
	* @param command
	* 						La commande actuelle de l'utilisateur
	* @return Vrai si la partie est finie, faux sinon
	*
	* @see Cmd
	*/
	public boolean evolve(Cmd command) {
		switch(command) {
    case UP :    this.hero.deplacement(0, 1);  break;
    case DOWN :  this.hero.deplacement(0, -1); break;
    case LEFT :  this.hero.deplacement(-1, 0); break;
    case RIGHT : this.hero.deplacement(1, 0);  break;
		case END :
			System.out.println("C'est fini ! \n");
			System.out.println("Position finale : \n");
			return true;
		}
		return false;
	}
}
