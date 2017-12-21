/**
 *
 */
package model;

import java.util.ArrayList;

import controller.Cmd;

/**
 * @author bentoune2u
 *
 */
public class Game {

	//Le personnage utilise par le joueur
	private Hero hero;
    public ArrayList<Monster> monster = new ArrayList<Monster>();
    public Hero getHero() {return hero;}
	public void setHero(Hero hero) {this.hero = hero;}
	public ArrayList<Monster> getMonster() {return monster;}
	//public void setMonster(Monster monster) {this.monster = monster;}
	private Labyrinth laby;


	/**
	 * constructeur de Game
	 */


	public Game(Labyrinth l) {
		this.setLaby(l);
		this.setHero(new Hero(this));
	    monster.add(new MonsterBishop(this));
	    monster.add(new MonsterKing(this));
		

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
		//test coordonnées négatives
		if (x < 0) {			
			this.getHero().setX(1);		
		}
		if (y < 0) {
			this.getHero().setY(1);
		}
		
		if (x > Labyrinth.getTaille()) {
			this.getHero().setX(Labyrinth.getTaille());
		}
		
		if (y > Labyrinth.getTaille()) {
			this.getHero().setY(Labyrinth.getTaille());
		}
		
		return false;
	}
	
	
	
	public boolean isBlocked(int x,int y){
		if(this.getLaby().getMap(x, y).equals("w")){return true;}
		else return false;
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
	/**
	 * @return the laby
	 */
	public Labyrinth getLaby() {
		return laby;
	}
	/**
	 * @param laby the laby to set
	 */
	public void setLaby(Labyrinth laby) {
		this.laby = laby;
	}
	public void nextLevel() {
		
		
		this.hero.setX(1);
		this.hero.setY(1);
		
		for (int i=0; i<this.monster.size();i++) {
			this.monster.get(i).init();
		}
		
		
		this.laby = new Labyrinth(this.laby.getLevel()+1);
		
	}
	
	
}
