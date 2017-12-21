package test;

import static org.junit.Assert.*;

import model.Game;
import model.Hero;
import model.Labyrinth;

import org.junit.Test;

public class TestHero {

	
	/* **** DEPLACEMENTS **** */
	/**
	 * test de deplacement du hero d'un pixel vers la droite
	 */
	@Test
	public void testDeplacementDroite() {
		
		Game game = new Game(new Labyrinth());
		Hero hero = new Hero(game);
		//droite
		hero.deplacement(1, 0);
		assertEquals(hero.getX(),1);
		
	}

	/**
	 * test de deplacement du hero d'un pixel vers la gauche
	 */
	@Test
	public void testDeplacementGauche() {
		
		Game game = new Game(new Labyrinth());
		Hero hero = new Hero(game);
		//droite
		hero.deplacement(1, 0);
		//gauche
		hero.deplacement(-1, 0);
		// (0;0)
		assertEquals(hero.getX(),0);
		
	}
	
	/**
	 * test de deplacement du hero d'un pixel vers le haut
	 */
	@Test
	public void testDeplacementHaut() {
		
		Game game = new Game(new Labyrinth());
		Hero hero = new Hero(game);
		//haut
		hero.deplacement(0, 1);
		assertEquals(hero.getY(),1);
		
	}
	
	/**
	 * test de deplacement du hero d'un pixel vers le bas
	 */
	@Test
	public void testDeplacementBas() {
		
		Game game = new Game(new Labyrinth());
		Hero hero = new Hero(game);
		//bas
		hero.deplacement(0, 1);
		//haut
		hero.deplacement(0, -1);
		//(0;0)
		assertEquals(hero.getY(),0);
		
	}
	
	/* **** DEPLACEMENT HORS CADRE **** */
	/**
	 * Test de deplacement du hero lui donnant une abscisse negative
	 */
	@Test
	public void testDeplacementXHorsCadre() {
		
		Game game = new Game(new Labyrinth());
		Hero hero = new Hero(game);
		
		//2 deplacements vers la gauche
		hero.deplacement(-1, 0);
		hero.deplacement(-1, 0);
		//doit retourner 0 et 
		assertEquals(hero.getX(),0);		
	}
	
	/**
	 * Test de deplacement du hero lui donnant des ordonnee negative
	 */
	@Test
	public void testDeplacementYHorsCadre() {
		
		Game game = new Game(new Labyrinth());
		Hero hero = new Hero(game);
		
		//2 deplacements vers haut
		hero.deplacement(0, -1);
		hero.deplacement(0, -1);
		//doit retourner 0 et non -2
		assertEquals(hero.getY(),0);		
	}
	
	/* **** DEPLACEMENT DIAGONAL **** */
	/**
	 * Test de deplacement en diagonal du hero
	 */
	@Test
	public void testDeplacementDiagonal() {
		
		Game game = new Game(new Labyrinth());
		Hero hero = new Hero(game);
		
		//2 deplacements en diagonal de la (droite-bas)
		hero.deplacement(1, 1);
		hero.deplacement(1, 1);
		//getX() doit valloir getY()
		assertEquals(hero.getX(),hero.getY());
		
	}
	
	/* ****TEST DE ISOUT() ***** */
	/**
	 * Test du resultat de isOut() avec un des deux parametres < 0
	 */
	@Test
	public void testIsOutTrue() {
		
		Game game = new Game(new Labyrinth());
		int x = -4;
		int y = 25;
		assertTrue(game.isOut(x, y));
		
	}
	
	/**
	 * Test du resultat de isOut() avec les deux parametres > 0
	 */
	@Test
	public void testIsOutFalse() {
		
		Game game = new Game(new Labyrinth());
		int x = 5;
		int y = 25;
		assertFalse(game.isOut(x, y));
		
	}
	
	/**
	 * Test du resultat de isOut() a l'origine
	 */
	@Test
	public void testIsOutOrigine() {		
		Game game = new Game(new Labyrinth());
		int x = 0;
		int y = 0;
		assertFalse(game.isOut(x, y));		
	}
	
}
