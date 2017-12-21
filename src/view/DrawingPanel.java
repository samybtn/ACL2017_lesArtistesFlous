package view;

/**
 * @author Horatiu Cirstea, Vincent Thomas
 *
 */
import java.awt.Dimension;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.PaintContext;
import java.awt.image.BufferedImage;

import javax.swing.JPanel;

import model.Hero;
import model.Labyrinth;
import model.Monster;

public class DrawingPanel extends JPanel {

	/**
	 *
	 */
	private static final long serialVersionUID = 1L;

	/**
	 * la clase chargee de Dessiner
	 */
	private View painter;

	/**
	 * image suivante est l'image cachee sur laquelle dessiner
	 */
	private BufferedImage nextImage;

	
	/**
	 * image en cours est l'image entrain d'etre affichee
	 */
	private BufferedImage currentImage;

	/**
	 * la taille des images
	 */
	private int width, height;

	/**
	 * constructeur Il construit les images pour doublebuffering ainsi que le
	 * Panel associe. Les images stockent le painter et on demande au panel la
	 * mise a jour quand le painter est fini
	 *
	 * @param width
	 *            largeur de l'image
	 * @param height
	 *            hauteur de l'image
	 */
	public DrawingPanel(View painter) {
		super();
		this.width = painter.getWidth();
		this.height = painter.getHeight();
		this.setPreferredSize(new Dimension(this.width, this.height));
		this.painter=painter;

		// cree l'image buffer et son graphics
		this.nextImage = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);
		this.currentImage = new BufferedImage(width, height,
				BufferedImage.TYPE_INT_RGB);
	}

	/**
	 * demande de mettre a jour le rendu de l'image sur le Panel. Creer une
	 * nouvelle image vide sur laquelle dessiner
	 */
	public void drawGame() {
		// generer la nouvelle image
		/*this.painter.draw(this.nextImage);

		// inverses les images doublebuffereing
		BufferedImage temp = this.currentImage;
		// l'image a dessiner est celle qu'on a construite
		this.currentImage = this.nextImage;
		// l'ancienne image est videe
		this.nextImage = temp;
		this.nextImage.getGraphics()
				.fillRect(0, 0, this.width, this.height);
		// met a jour l'image a afficher sur le panel*/
	//	this.repaint();
	}

	/**
	 * redefinit la methode paint consiste a dessiner l'image en cours
	 *
	 * @param g
	 *            graphics pour dessiner
	 */
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics g2 =  (Graphics2D)g;
	
		//int x = this.painter.getGame().getHero().getX();
		//int y = this.painter.getGame().getHero().getY();
		//g.drawImage(this.painter.getGame().getHero().getImg()/*this.currentImage*/, x, y, 75/*getWidth()*/, 75/*getHeight()*/, 0, 0,
				//getWidth(), getHeight(), null);
		Labyrinth m = this.painter.getGame().getLaby();
		Hero p = this.painter.getGame().getHero();
		Monster monstr = this.painter.getGame().getMonster();

		//System.out.println(painter.getHeight()+"  "+painter.getWidth());
		
		
		
		int factorx=painter.getWidth()/14;
		int factory=painter.getHeight()/14;
		
		for(int y = 0; y < 14; y++){
			for(int x = 0; x < 14; x ++){
				//*** Condition fin partie
				if(m.getMap(x, y).equals("f")){
					g.drawImage(m.getFinish(), x * factorx, y * factory, null);
				}
					//********fin
			
				if(m.getMap(x, y).equals("g")){
					g.drawImage(m.getGrass(), x*factorx, y*factory,factorx, factory, null);
				}
				if(m.getMap(x, y).equals("w")){
					g.drawImage(m.getWall(), x*factorx, y*factory, factorx, factory, null);
				}
			}
		}
		//****MessageFin
		//g.drawString(Message, 50, 50);
		
		g.drawImage(p.getImg(), p.getX()*factorx, p.getY()*factory,factorx,factory, null);
		g.drawImage(monstr.getImg(), monstr.getX()*factorx, monstr.getY()*factory,factorx,factory, null);

		this.repaint();
	}
	
	
	

}
