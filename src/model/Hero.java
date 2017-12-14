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
public class Hero extends Personage{

	private Image img;
	private ImageIcon icon_hero;
	
	public Hero(Game game){
		super(game);
		this.icon_hero = new ImageIcon(getClass().getResource("/image/pacman.png"));
		this.img = this.icon_hero.getImage();
	}

	protected boolean isBlocked(){
		//make Walls tests
		return false;

	}


    
	
	/**
	 * @return the img
	 */
	public Image getImg() {
		return img;
	}

	/**
	 * @param img the img to set
	 */
	public void setImg(Image img) {
		this.img = img;
	}

	/**
	 * @return the icon_hero
	 */
	public ImageIcon getIcon_hero() {
		return icon_hero;
	}

	/**
	 * @param icon_hero the icon_hero to set
	 */
	public void setIcon_hero(ImageIcon icon_hero) {
		this.icon_hero = icon_hero;
	}

	public void print(){
		System.out.println( "("+this.getX()+":"+this.getY()+")");

	}

}
