import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings({ "unused", "serial" })
class MyPanel extends JPanel {
	public static int x1;
	public static int x2;
	public static int y1;
	public static int y2;

	public static void setCoord(int c1, int c2, int c3, int c4) {
		x1 = c1;
		x2 = c2;
		y1 = c3;
		y2 = c4;
	}

	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawOval(x1, x2, y1, y2);
	}
}

@SuppressWarnings("serial")
public class TestWindow extends JFrame {

	private MyPanel panel = new MyPanel();

	@SuppressWarnings("static-access")
	public TestWindow() {
		JFrame mf = new JFrame("Paint Test");
		mf.setSize(200, 200);
		mf.add(panel, BorderLayout.CENTER);
		panel.setCoord(5, 5, 100, 100);
		panel.repaint();
		mf.setVisible(true);
	}

	public static void main(String[] args) {
		new TestWindow();
	}
}