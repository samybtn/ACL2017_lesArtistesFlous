/**
 * 
 */
package personage;

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
	
	public boolean deplacement(int x, int y){
		if (this.game.isOut(this.x+x,this.y+y)){ return false ;}
		else{
		this.x+=x;
		this.y+=y;
		return true;}
	}
	

}
