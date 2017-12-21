/**
 *
 */
package model;

import java.awt.Image;
import java.util.List;

import javax.swing.ImageIcon;

/**
 * @author bentoune2u
 *
 */
public class Hero extends Character {

	private Image img;
	private ImageIcon icon_hero;
	
	public Hero(Game game){
		super(game);
		this.icon_hero = new ImageIcon(getClass().getResource("/image/pacman.png"));
		this.img = this.icon_hero.getImage();
		this.x = 1;
		this.y = 1; 
	}



	public boolean deplacement(int x, int y){
		x = (x/(Math.max(Math.abs(x),1)));
		y = (y/(Math.max(Math.abs(y),1)));
		if (Math.abs(y)+Math.abs(x)==0)return false;
		if (this.game.isOut(this.getX()+x,this.getY()+y)){return false ;}
		if (this.game.isBlocked(this.getX()+x,this.getY()+y)){ return false ;}
		this.setX(this.getX()+x);
		this.setY(this.getY()+y);
		
		List monstr = this.game.getMonster();
		for(int i = 0; i < monstr.size(); i++){
			Monster monstreI=(Monster) monstr.get(i);
			monstreI.bouger();
		}

		return true;
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
