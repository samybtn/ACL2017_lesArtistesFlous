/**
 *
 */
package game;

/**
 * @author bentoune2u
 *
 */
public class View {

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

  public void print() {
    this.game.getHero().print();
  }
}
