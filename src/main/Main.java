/**
 *
 */
package main;
import java.util.Scanner;

import game.*;
import personage.*;

/**
 * @author bentoune2u
 *
 */
public class Main {


	//methode interaction pour le sprint 1
	public static void interaction(Hero h, View view) {
		boolean fin = false;
		System.out.println("****les LabyFlous****\n");
		System.out.println("Deplacement : \n haut : z \n bas : s \n gauche : q \n droite : d\n");
		System.out.println("e pour quitter \n");
		System.out.println("Position de base : \n");
		h.print();
		System.out.println("\n");

		while(!fin) {
			System.out.println("Choisir le deplacement : \n");
			Scanner sc1= new Scanner(System.in);
			String str1 = sc1.nextLine();
			switch (str1) {
			//*-1 en fonction de l'origine de l'interface graphique future
			case "z" :
				//Haut
				h.deplacement(0, 1);
				break;
			case "s" :
				//Bas
				h.deplacement(0, -1);
				break;
			case "q" :
				//Gauche
				h.deplacement(-1, 0);
				break;
			case "d" :
				//Droite
				h.deplacement(1, 0);
				break;
			case "e" :
				//Droite
				fin=!fin;
				System.out.println("C'est fini ! \n");
				System.out.println("Position finale : \n");
				break;
			default :
				System.out.println("Mauvaise commande, deplacement par defaut : haut");
				h.deplacement(0, 1);
			}
			view.print();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Game game = new Game();
		View view = new View(game);
		Hero h = game.getHero();
		interaction(h, view);
		/*h.print();
		h.deplacement(1,0);
		h.print();
		h.deplacement(1,-5);
		h.print();*/

	}

}
