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
public class Hero extends Charater{

	private Image img;
	private ImageIcon icon_hero;
	
	public Hero(Game game){
		super(game);
		this.icon_hero = new ImageIcon(getClass().getResource("/image/hero.png"));
		this.img = this.icon_hero.getImage();
	}

	protected boolean isBlocked(){
		//make Walls tests
		return false;

	}


    
	//** SETTER AND GETTER
	
	public void setImg(Image img) {this.img = img;}
	public void setIcon_hero(ImageIcon icon_hero) {this.icon_hero = icon_hero;}
	public ImageIcon getIcon_hero() {return icon_hero;}
	public Image getImg() {return img;}

	


	public void print(){
		System.out.println( "("+this.getX()+":"+this.getY()+")");

	}

}
