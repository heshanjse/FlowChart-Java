package com.jonathanlowe.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JMenuBar;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Insets;

import javax.swing.SwingConstants;


import com.jonathanlowe.shapes.*;

public class ApplicationUI extends JFrame implements ActionListener{

	private JPanel contentPane;
	private FlowChartNode node;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ApplicationUI frame = new ApplicationUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public ApplicationUI() {
//		super(title);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 700);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setMargin(new Insets(25, 25, 25, 25));
		setJMenuBar(menuBar);
		
		
		//create node adding buttons,label
		JLabel flowNodesLabel = new JLabel("  Flow Nodes: ");
		flowNodesLabel.setLabelFor(menuBar);
		menuBar.add(flowNodesLabel);
		JButton addProcessNodeBt = new JButton("Process Node");
		addProcessNodeBt.addActionListener(this);
		menuBar.add(addProcessNodeBt);
		
		JButton addIONodeBt = new JButton("I/O Node");
		addIONodeBt.addActionListener(this);
		menuBar.add(addIONodeBt);
		
		JButton addIfElseNodeBt = new JButton("Decision Node");
		addIfElseNodeBt.addActionListener(this);
		menuBar.add(addIfElseNodeBt);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel menu = new JPanel();
		menu.setBackground(Color.getColor("0x0099CC"));
		
		contentPane.add(menu);
		

		contentPane.setLayout(null);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand() == "Process Node"){
			node = new ProcessNode();
			contentPane.add(node);
			contentPane.validate();
			contentPane.repaint();
		} else if(e.getActionCommand() == "I/O Node"){
			node = new IONode();
			contentPane.add(node);
			contentPane.validate();
			contentPane.repaint();
		} else if(e.getActionCommand() == "Decision Node"){
			contentPane.setBackground(Color.BLUE);
		}
		
	}
	
	

}
