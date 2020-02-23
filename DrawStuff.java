package drawshape;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Shape;
import java.awt.geom.Ellipse2D;

import javax.swing.JComponent;

public class DrawStuff extends JComponent {

	private static float x1;
	private static float y1;
	
	void setPosition(float x, float y) {
		x1 = x;
		y1 = y;
	}

	public void paint(Graphics g) {
		
		Graphics2D graph2 = (Graphics2D)g;
		graph2.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		
		Shape drawEllipse = new Ellipse2D.Float(x1, y1, 50, 50);
		graph2.draw(drawEllipse);
		graph2.setPaint(Color.GRAY);
		graph2.fill(drawEllipse);

	}
}
