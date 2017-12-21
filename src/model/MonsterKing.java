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
	
	
	
	
	public void traquer(){
		int departx=this.getX();
		int departy=this.getY();
		Labyrinth m = this.getGame().getLaby();

		Case cases[][] = new Case[14][14] ; 
		//on va creer une case par zone visitable 
		for(int j = 0; j < 14; j++){
			for(int i = 0; i < 14; i ++){
				if(!m.getMap(i, j).equals("w")){cases[i][j]=new Case(i,j,-1,null);}
				else cases[i][j]=null;
			}}
		// on ajoute aux cases visitables le lien vers leur voisines si elles sont visitables
		for(int j = 0; j < 13; j++){for(int i = 0; i < 14; i ++){if(cases[i][j]!=null && cases[i][j+1]!=null) cases[i][j].add(cases[i][j+1]);}}
		for(int j = 1; j < 14; j++){for(int i = 0; i < 14; i ++){if(cases[i][j]!=null && cases[i][j-1]!=null) cases[i][j].add(cases[i][j-1]);}}
		for(int j = 0; j < 14; j++){for(int i = 0; i < 13; i ++){if(cases[i][j]!=null && cases[i+1][j]!=null) cases[i][j].add(cases[i+1][j]);}}
		for(int j = 0; j < 14; j++){for(int i = 1; i < 14; i ++){if(cases[i][j]!=null && cases[i-1][j]!=null) cases[i][j].add(cases[i-1][j]);}}
		
		cases[departx][departy].run(0,cases[departx][departy]);		
		int coordonnees[] = cases[this.game.getHero().getX()][this.game.getHero().getY()].retrace(null, cases[departx][departy]);
		this.setX(coordonnees[0]);
		this.setY(coordonnees[1]);
		
	}
	
	
	
	
	public void bouger(){

		/*boolean did=true;
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

		*/
		
		traquer();
	}
	


}
