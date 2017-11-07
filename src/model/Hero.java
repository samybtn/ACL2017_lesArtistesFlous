/**
 *
 */
package model;

/**
 * @author bentoune2u
 *
 */
public class Hero extends Personage{

	public Hero(Game game){
		super(game);
	}

	protected boolean isBlocked(){
		//make Walls tests
		return false;

	}



	public void print(){
		System.out.println( "("+this.getX()+":"+this.getY()+")");

	}

}
