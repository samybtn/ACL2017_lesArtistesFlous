/**
 *
 */
package view;

import java.awt.Color;
import java.awt.Graphics2D;
import java.awt.image.BufferedImage;

import model.Game;

/**
 * @author bentoune2u
 *
 */
public class View {

	/**
	 * la taille des cases
	 */
	protected static final int WIDTH = 100;
	protected static final int HEIGHT = 100;
  private Game game;

  /**
   * construit la vue
   *
   * @param game
   * modèle du jeu
   */
  public View(Game game) {
    this.game = game;
  }

	/**
	 * methode  redefinie de Afficheur retourne une image du jeu
	 */
	public void draw(BufferedImage im) {
		Graphics2D crayon = (Graphics2D) im.getGraphics();
		System.out.println("***");
		crayon.setColor(Color.blue);
		crayon.fillOval(this.game.getHero().getX(), this.game.getHero().getY(), 10,10);
	}

	public int getWidth() {
		return WIDTH;
	}

	public int getHeight() {
		return HEIGHT;
	}
}
