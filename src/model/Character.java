/**
 *
 */
package model;

/**
 * @author bentoune2u
 *
 */
public abstract class Character{

	protected int x;
	protected int y;
	protected Game game;

	public Character(Game game){
		this.game=game;
	}


	public int getX() {			return x;}
	public void setX(int x) {	this.x = x;}
	public int getY() {			return y;}
	public void setY(int y) {	this.y = y;}
	public Game getGame() {		return game;}






	abstract void print();

}
