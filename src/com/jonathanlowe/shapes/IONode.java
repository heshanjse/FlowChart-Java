package com.jonathanlowe.shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;
import java.awt.event.MouseEvent;

public class IONode extends FlowChartNode {
	protected Polygon poly;

	public IONode(){
		super();
		setBounds(0, 0, 200, 200);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int xPoly[] = {0,0,100,100};
		int yPoly[] = {0,100,100,0};
		poly = new Polygon(xPoly, yPoly, xPoly.length);
		g.setColor(Color.RED);		
		g.fillPolygon(poly);		
	}
	
	public void mousePressed(MouseEvent e) {
		pt = e.getPoint();
		isClickInShape = poly.contains(pt);
		System.out.println(pt.x);
		System.out.println("This works");
		// TODO Auto-generated method stub
		
	}
}
