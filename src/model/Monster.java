/**
 * 
 */
package model;

import java.awt.Image;

import javax.swing.ImageIcon;

/**
 * @author bentoune2u
 *
 */
public abstract class Monster extends Character {

	protected Image img;
	protected ImageIcon icon_hero;
	
	/**
	 * @param game
	 */
	public Monster(Game game) {
		super(game);
	}
	
	
	public abstract void bouger();
	

	public void init(){
		boolean go=true;
		int a=1;
		int b=1;
		while (go){
			go=false;
			a=((int) (Math.round(Math.random()*13)));
			b=((int) (Math.round(Math.random()*13)));
			if(this.game.isOut(a,b)) go=true ;
			else if (this.game.isBlocked(a, b) || ( this.game.getHero().getX()==a && this.game.getHero().getY()==b)){go=true;}

		}
		this.setX(a);
		this.setY(b);
	}
	
	

	/* (non-Javadoc)
	 * @see model.Character#isBlocked()
	 */

	/* (non-Javadoc)
	 * @see model.Character#print()
	 */
	@Override
	void print() {
		System.out.println( "("+this.getX()+":"+this.getY()+")");

	}

	public void setImg(Image img) {this.img = img;}
	public void setIcon_hero(ImageIcon icon_hero) {this.icon_hero = icon_hero;}
	public ImageIcon getIcon_hero() {return icon_hero;}
	public Image getImg() {return img;}
	



}
