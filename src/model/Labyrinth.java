package model;

import java.awt.*;
import java.io.*;
import java.util.*;

import javax.swing.ImageIcon;
import javax.swing.plaf.synth.SynthStyle;

public class Labyrinth {
	
	private Scanner m;
	private String Map[] = new String[14];
	private Image grass,finish, wall;

	public Labyrinth(){
		
		ImageIcon img = new ImageIcon(getClass().getResource("/image/texture.jpg"));
		grass = img.getImage();
		img = new ImageIcon(getClass().getResource("/image/walls.png"));
		wall = img.getImage();
		//***** Fin
		img = new ImageIcon(getClass().getResource("/image/finPatie1.png"));
		finish = img.getImage();
		
		
		openFile();
		readFile();
		CloseFile();
		}
	
	public Image getGrass(){return grass;}
	public Image getWall(){return wall;}
	//***** Fin
	public Image getFinish(){return finish;}
	
	
		public String getMap(int x, int y){
			String index = Map[y].substring(x, x+1);
			return index;	
	}
	
	public void openFile(){
		
		try{
			//System.out.println("****");
		m = new Scanner(new File(getClass().getResource("/image/map.txt").getFile()));
		
		}catch(Exception e){
			System.out.println("error loading map");
		}
	}
	
     public void readFile(){
    	 while(m.hasNext()){
    		 for(int i = 0; i< 14; i++){
    			 Map[i] = m.next();
    		 }
    	 }
		
	}
      public void CloseFile(){
    	  m.close();
	
}
}