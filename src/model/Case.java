package model;

import java.util.ArrayList;

public class Case {

	private int x;
	private int y;
	private Case from;
	private int dist;
	private ArrayList<Case> voisines = new ArrayList<Case>();

	public Case getFrom() {return from;}
	public void setFrom(Case from) {this.from = from;}
	public int getDist() {return dist;}
	public void setDist(int dist) {this.dist = dist;}
	public void add(Case c){this.voisines.add(c);}

	
	public int getX() {
		return x;
	}
	public int getY() {
		return y;
	}
	public Case(int x, int y,int dist, Case from) {
		this.x=x;
		this.y=y;
		this.dist=-1;
		this.from=null;
	}


	public String toString(){
		return "("+x+";"+y+")";
	}
	
	
	public void run(int parametre,Case c){
		boolean modifier=false;
		if(this.getDist()==-1){
			this.setDist(parametre);
			this.setFrom(c);
			modifier=true;
		}
		if(this.getDist()>parametre+1){
			this.setDist(parametre+1);
			this.setFrom(c);
			modifier=true;
		}
		if(modifier){
			for (Case element : voisines) {
				element.run(this.getDist()+1,this);
			}
		}
	}
	
	public int[] retrace(int[] tab, Case origine){
		int coordonnees[] = new int[3];
		coordonnees[0]=this.x;
		coordonnees[1]=this.y;
		coordonnees[2]=this.getDist();
		if(this.getX()==origine.getX() && this.getY()==origine.getY()) return tab;
		else return from.retrace(coordonnees, origine);
	}
	
	

	
	
	
	
}
