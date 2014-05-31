package com.jonathanlowe.shapes;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Polygon;
import java.awt.TextArea;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JPanel;

public class FlowChartNode extends JPanel implements MouseListener, MouseMotionListener{
	private Point pt = new Point();
	private Boolean isClickInShape;
	private Polygon poly;

	public FlowChartNode(){
		setBounds(0, 0, 250, 100);
		addMouseListener(this);
		addMouseMotionListener(this);
		setOpaque(false);
		TextArea ta = new TextArea();
		ta.setColumns(15);
		ta.setRows(3);
		ta.setVisible(true);
		add(ta);
		repaint();
	}
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		int xPoly[] = {0,50,250,200};
		int yPoly[] = {100,0,0,100};
		poly = new Polygon(xPoly, yPoly, xPoly.length);
		g.setColor(Color.RED);
		
		g.fillPolygon(poly);
		
		
	}
	
	@Override
	public void mouseDragged(MouseEvent e) {
		if(isClickInShape){
			setLocation((e.getComponent().getX() - pt.x) + e.getPoint().x, (e.getComponent().getY() - pt.y)+ e.getPoint().y);
			System.out.println(pt.x);
		}
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		
	}

	@Override
	public void mousePressed(MouseEvent e) {
		pt = e.getPoint();
		isClickInShape = poly.contains(pt);
		System.out.println(pt.x);
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
}
