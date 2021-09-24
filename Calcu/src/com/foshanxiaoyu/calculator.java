package com.foshanxiaoyu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import javax.swing.JEditorPane;
import java.awt.GridLayout;
import java.awt.GridBagLayout;
import javax.swing.JTextField;
import java.awt.GridBagConstraints;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

import jdk.jfr.internal.PrivateAccess;

import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;

import com.sun.java.swing.plaf.windows.resources.windows;
import java.awt.Color;

public class calculator {

	private JFrame frame;
	private JTextField value2;
	private JTextField value1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculator window = new calculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public calculator() {
		initialize();
	}

	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(1100, 200, 309, 415); //初始化定位
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JEditorPane editorPane = new JEditorPane();
		editorPane.setBounds(10, 9, 271, 47);
		frame.getContentPane().add(editorPane);
		
		JButton btnNewButton = new JButton("9");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value1.getText()+9);
			}
		});
		btnNewButton.setBounds(10, 70, 60, 60);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("8");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value1.getText()+8);
			}
		});
		btnNewButton_1.setBounds(80, 70, 60, 60);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("7");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value1.getText()+7);
			}
		});
		btnNewButton_2.setBounds(150, 70, 60, 60);
		frame.getContentPane().add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("6");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value1.getText()+6);
			}
		});
		btnNewButton_3.setBounds(10, 140, 60, 60);
		frame.getContentPane().add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("2");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value1.getText()+2);
			}
		});
		btnNewButton_4.setBounds(80, 210, 60, 60);
		frame.getContentPane().add(btnNewButton_4);
		
		JButton btnNewButton_2_1 = new JButton("+");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value1.getText());
				if(value1.getText()=="") {
				JOptionPane.showConfirmDialog(null, "输入为空","请输入数据",JOptionPane.ERROR_MESSAGE);
				}
				operRecived ="add";
				actionRecived.setText("add");
				value1.setText(null);
			}
		});
		btnNewButton_2_1.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton_2_1.setBounds(220, 70, 60, 60);
		frame.getContentPane().add(btnNewButton_2_1);
		
		JButton btnNewButton_3_1 = new JButton("5");
		btnNewButton_3_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value1.getText()+5);
			}
		});
		btnNewButton_3_1.setBounds(80, 140, 60, 60);
		frame.getContentPane().add(btnNewButton_3_1);
		
		JButton btnNewButton_3_2 = new JButton("4");
		btnNewButton_3_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value1.getText()+4);
			}
		});
		btnNewButton_3_2.setBounds(150, 140, 60, 60);
		frame.getContentPane().add(btnNewButton_3_2);
		
		JButton btnNewButton_3_3 = new JButton("-");
		btnNewButton_3_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value1.getText());
				operRecived = "sub";
				actionRecived.setText("sub");
				value1.setText(null);
			}
		});
		btnNewButton_3_3.setFont(new Font("Arial Black", Font.BOLD, 22));
		btnNewButton_3_3.setBounds(220, 140, 60, 60);
		frame.getContentPane().add(btnNewButton_3_3);
		
		JButton btnNewButton_3_4 = new JButton("3");
		btnNewButton_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value1.getText()+3);
			}
		});
		btnNewButton_3_4.setBounds(10, 210, 60, 60);
		frame.getContentPane().add(btnNewButton_3_4);
		
		JButton btnNewButton_3_5 = new JButton("1");
		btnNewButton_3_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value1.getText()+1);
			}
		});
		btnNewButton_3_5.setBounds(150, 210, 60, 60);
		frame.getContentPane().add(btnNewButton_3_5);
		
		JButton btnNewButton_3_6 = new JButton("*");
		btnNewButton_3_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value1.getText());
				operRecived ="muli";
				actionRecived.setText("muli");
				value1.setText(null);
			}
		});
		btnNewButton_3_6.setFont(new Font("Arial Black", Font.BOLD, 22));
		btnNewButton_3_6.setBounds(220, 210, 60, 60);
		frame.getContentPane().add(btnNewButton_3_6);
		
		JButton btnNewButton_3_7 = new JButton("C");
		btnNewButton_3_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(null);
				value2.setText(null);
				operRecived = "";
				
			}
		});
		btnNewButton_3_7.setBounds(10, 280, 60, 60);
		frame.getContentPane().add(btnNewButton_3_7);
		
		JButton btnNewButton_3_8 = new JButton("0");
		btnNewButton_3_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value1.setText(value1.getText()+0);
			}
		});
		btnNewButton_3_8.setBounds(80, 280, 60, 60);
		frame.getContentPane().add(btnNewButton_3_8);
		
		JButton btnNewButton_3_9 = new JButton("=");
		btnNewButton_3_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				float oneValue =Float.parseFloat(value1.getText());
				float twoValue = Float.parseFloat(value2.getText());
				
				
				value1.setText(null);
//				if(actionRecived.getText().equals("sub")) {
				if(operRecived == "sub") {
					float sub = twoValue - oneValue;
					resValue.setText(String.valueOf(sub));
					value1.setText(String.valueOf(sub));
				};
				if(operRecived=="add") {
					float sum =twoValue + oneValue;
					resValue.setText(String.valueOf(sum));
					value1.setText(String.valueOf(sum));
				};
				
				if(operRecived=="muli") {
					float sub = twoValue * oneValue;
					resValue.setText(String.valueOf(sub));
					value1.setText(String.valueOf(sub));
				};
				if(operRecived=="div") {
					float sub =twoValue / oneValue;
					resValue.setText(String.valueOf(sub));
					value1.setText(String.valueOf(sub));
				};
			}
		});
		btnNewButton_3_9.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnNewButton_3_9.setBounds(150, 280, 60, 60);
		frame.getContentPane().add(btnNewButton_3_9);
		
		JButton btnNewButton_3_10 = new JButton("/");
		btnNewButton_3_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				value2.setText(value1.getText());
				operRecived ="div"; //第二种方法，用字符串类形来存操作符
				actionRecived.setText("div");
				value1.setText(null);
			}
		});
		btnNewButton_3_10.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnNewButton_3_10.setBounds(220, 280, 60, 60);
		frame.getContentPane().add(btnNewButton_3_10);
		
		value2 = new JTextField();
		value2.setBorder(null);
		value2.setForeground(Color.BLACK);
		value2.setHorizontalAlignment(SwingConstants.RIGHT);
		value2.setBounds(120, 10, 163, 21);
		frame.getContentPane().add(value2);
		value2.setColumns(10);
		
		value1 = new JTextField();
		value1.setBorder(null);
		value1.setForeground(Color.BLACK);
		value1.setHorizontalAlignment(SwingConstants.RIGHT);
		value1.setFont(new Font("Arial", Font.PLAIN, 16));
		value1.setBounds(23, 29, 254, 27);
		frame.getContentPane().add(value1);
		value1.setColumns(10);
		
		actionRecived = new JLabel("New label");  //global variable	 JLable 类型
		actionRecived.setBounds(16, 350, 54, 15);
		frame.getContentPane().add(actionRecived);
		
		resValue = new JLabel("New label"); //global variable	 JLable 类型
		resValue.setBounds(133, 350, 150, 29);
		frame.getContentPane().add(resValue);
	}
	private JLabel resValue;
	private JLabel actionRecived;	//global variable	
	private String operRecived;	//global variable
}
