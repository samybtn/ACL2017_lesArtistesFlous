/**
 * 
 */
package game;

import personage.Hero;

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
		//labyrinth
		return false;
	}
}

