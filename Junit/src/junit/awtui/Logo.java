package junit.awtui;

import java.awt.*;
import java.awt.image.*;
import java.net.URL;

import junit.runner.BaseTestRunner;

public class Logo extends Canvas {
	private Image fImage;
	private int fWidth;
	private int fHeight;

	public Image loadImage(String name) {
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		try {
			URL url = BaseTestRunner.class.getResource(name);
			return toolkit.createImage((ImageProducer) url.getContent());
		} catch (Exception ex) {
		}
		return null;
	}

	public void paint(Graphics g) {
		paintBackground(g);
		if (fImage != null)
			g.drawImage(fImage, 0, 0, fWidth, fHeight, this);
	}

	public void paintBackground(java.awt.Graphics g) {
		g.setColor(SystemColor.control);
		g.fillRect(0, 0, getBounds().width, getBounds().height);
	}
}