import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

import javax.swing.JComponent;

public class MyComponent extends JComponent {
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -9032539863554018689L;
	int counter = 0;

	public void paintComponent(Graphics g){
		
		MutableCar theCar = new MutableCar(0,0, Color.CYAN, 10, 1);
			
		
		theCar.setColor(Color.GREEN);
		theCar.draw(g);
		theCar.setPosition(0, getHeight()-30);
		theCar.setColor(Color.BLUE);
		theCar.draw(g);
		theCar.setPosition(getWidth()-60, 0);
		theCar.setColor(Color.RED);
		theCar.draw(g);
		theCar.setPosition(getWidth()-60, getHeight()-30);
		theCar.setColor(Color.ORANGE);
		theCar.draw(g);
		
		Random r = new Random();
		theCar.setPosition(r.nextInt(getWidth())-60, r.nextInt(getHeight()-30));
		theCar.setColor(Color.MAGENTA);
		theCar.draw(g);
		System.out.println(counter++);
	}
}
