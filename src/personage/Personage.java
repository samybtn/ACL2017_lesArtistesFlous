/**
 * 
 */
package personage;
import game.*;
/**
 * @author bentoune2u
 *
 */
public abstract class Personage{
	
	private int x=0;
	private int y=0;
	private Game game;
	
	public Personage(Game game){
		this.game=game;
	}
	

	public int getX() {			return x;}
	public void setX(int x) {	this.x = x;}
	public int getY() {			return y;}
	public void setY(int y) {	this.y = y;}
	public Game getGame() {		return game;}

	
	protected abstract boolean isBlocked();

	public boolean deplacement(int x, int y){
		x = x/(Math.abs(x));
		y = y/(Math.abs(y));
		if (Math.abs(y)+Math.abs(x)==0)return false;
		if (this.game.isOut(this.getX()+x,this.getY()+y)){ return false ;}
		
		else{
		this.setX(this.getX()+x);
		this.setY(this.getY()+y);

		return true;}
	}
	
	
	abstract void print();

}
