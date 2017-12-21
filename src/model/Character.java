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


	protected abstract boolean isBlocked();

	public boolean deplacement(int x, int y){
		x = (x/(Math.max(Math.abs(x),1)));
		y = (y/(Math.max(Math.abs(y),1)));
		if (Math.abs(y)+Math.abs(x)==0)return false;
		if (this.game.isOut(this.getX()+x,this.getY()+y)){
			return false ;}
		if (this.game.isBlocked(this.getX()+x,this.getY()+y)){ return false ;}
		this.setX(this.getX()+x);
		this.setY(this.getY()+y);
		
		return true;
	}


	abstract void print();

}
