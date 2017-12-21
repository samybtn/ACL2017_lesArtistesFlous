package model;

import javax.swing.ImageIcon;

public class MonsterKing extends Monster{

	public MonsterKing(Game game) {
		super(game);
		this.icon_hero = new ImageIcon(getClass().getResource("/image/king.png"));
		this.img = this.icon_hero.getImage();
		init();
		// TODO Auto-generated constructor stub
	}

	
	public void bouger(){

		boolean did=true;
		while(did){
			did=false;

			int x=((int) (Math.round(Math.random()*2))-1);
			int y=((int) (Math.round(Math.random()*2))-1);
			System.out.println("Bishop : "+x+"    "+y);

			
			if ((Math.abs(y)+Math.abs(x)==0)) did=true;
			if (this.game.isBlocked(this.getX()+x,this.getY()+y)) did=true;
			if((this.game.isOut(this.getX()+x,this.getY()+y))) did=true ;
				
			if(did==false) {
				this.setX(this.getX()+x);
				this.setY(this.getY()+y);
			}
			}

	}
	


}
