package com.jonathanlowe.shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Polygon;

public class ProcessNode extends FlowChartNode {
	protected Polygon poly;

	public ProcessNode(){
		super();
		setBounds(0,0, 200, 200);
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int xPoly[] = {0,0,200,200};
		int yPoly[] = {0,200,200,0};
		poly = new Polygon(xPoly, yPoly, xPoly.length);
		g.setColor(Color.RED);
		
		g.fillPolygon(poly);
		
		
	}
}
