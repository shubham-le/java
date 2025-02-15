package com.app.java.awt;

import java.applet.Applet;
import java.awt.Graphics;

public class AWT extends Applet {
	
	public static void main(String[] args) {
	}
	
	public void paint(Graphics g) {
		g.drawString("Hello from Java Applet!", 20, 20);
	}

}
