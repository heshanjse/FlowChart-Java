package com.jonathanlowe.ui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.ScrollPane;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class ApplicationUI extends JFrame {

	private JPanel contentPane;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		
		//create node adding buttons,label
		JLabel flowNodesLabel = new JLabel("Flow Nodes: ");
		JButton addProcessNodeBt = new JButton("Process Node");
		JButton addIONodeBt = new JButton("I/O Node ");
		JButton addIfElseNodeBt = new JButton("Decision Node ");
		
		JPanel menu = new JPanel();
		menu.setBackground(Color.getColor("0x0099CC"));
		menu.add(flowNodesLabel);
		menu.add(addProcessNodeBt);
		menu.add(addIONodeBt);
		menu.add(addIfElseNodeBt);
		
		add(menu);
		
		
	}

}
