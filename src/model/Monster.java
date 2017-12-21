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
public class Monster extends Character {

	private Image img;
	private ImageIcon icon_hero;
	
	/**
	 * @param game
	 */
	public Monster(Game game) {
		super(game);
		this.icon_hero = new ImageIcon(getClass().getResource("/image/ghost.png"));
		this.img = this.icon_hero.getImage();
		init();
		// TODO Auto-generated constructor stub
	}
	
	
	public void bouger(){

		boolean did=true;
		while(did){
			did=false;
			int x=((int) Math.round(Math.random()))*2-1;
			int y=((int) Math.round(Math.random()))*2-1;
			
			if ((Math.abs(y)+Math.abs(x)==0)) did=true;
			if (this.game.isBlocked(this.getX()+x,this.getY()+y)) did=true;
			//if(!(this.game.isOut(this.getX()+x,this.getY()+y))) did=true ;
				
			if(did==false) {
				this.setX(this.getX()+x);
				this.setY(this.getY()+y);
			}
			System.out.print("bwa");
			}

	}
	
	public void init(){
		this.setX(10);
		this.setY(10);
	}
	

	/* (non-Javadoc)
	 * @see model.Character#isBlocked()
	 */
	@Override
	protected boolean isBlocked() {
		// TODO Auto-generated method stub
		return false;
	}

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
