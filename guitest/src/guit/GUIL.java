package guit;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

import javax.swing.*;
 
public class GUIL extends JFrame {
	Container contentPane;
	public GUIL() {

		setTitle("����"); // ������ ����
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		contentPane = getContentPane();
        setBounds(100 , 100 , 800 , 400);
	    setVisible(true);

	    JButton btn1, btn2, btn3, btnc, btnh, btnb, btnd, btnch, btndi;
	    btn1 = new JButton("first card");
	    btn1.setLocation(60, 160);
	    btn1.setSize(60, 100);
	    btn2 = new JButton("second card");
	    btn2.setLocation(130, 160);
	    btn2.setSize(60, 100);
	    btn3 = new JButton("third card");
	    btn3.setLocation(200, 160);
	    btn3.setSize(60, 100);
	    btnc = new JButton("��");
	    btnc.setLocation(40, 290);
	    btnc.setSize(60, 40);
	    btnh = new JButton("����");
	    btnh.setLocation(120, 290);
	    btnh.setSize(60, 40);
	    btnb = new JButton("��");
	    btnb.setLocation(200, 290);
	    btnb.setSize(60, 40);
	    btnd = new JButton("����");
	    btnd.setLocation(280, 290);
	    btnd.setSize(60, 40);
	    btndi = new JButton("����");
	    btndi.setLocation(280, 170);
	    btndi.setSize(60, 40);
	    btnch = new JButton("üũ");
	    btnch.setLocation(280, 230);
	    btnch .setSize(60, 40);
	    
	    btn1.addActionListener(new EventHandler2());
	    btn2.addActionListener(new EventHandler2());
	    btn3.addActionListener(new EventHandler2());
	    btnc.addActionListener(new EventHandler3());
	    btnh.addActionListener(new EventHandler4());
	    btnd.addActionListener(new EventHandler5());
	    btnb.addActionListener(new EventHandler6());
	    btndi.addActionListener(new EventHandler7());
	    btnch.addActionListener(new EventHandler8());
	    
	    add(btn1);
	    add(btn2);
	    add(btn3);
	    add(btnc);
	    add(btnh);
	    add(btnd);
	    add(btnb);
	    add(btndi);
	    add(btnch);
	    
	    setLayout(null);
	    setSize(400, 400);
	    setLocation(100, 100);
	    setVisible(true);
	}
}
/*
JLabel lab;


public GUI() {
	
	setTitle("���� ���� â");
	
	setLocation(0, 100); //â�� �ߴ� ��ġ
    setSize(1000, 300); // â ũ��
    setResizable(false); // â ũ�� ����

	
	lab = new JLabel("Welcome to sutda World!");
	lab.setLocation(145, 100);
    lab.setSize(00, 200);
    lab.setBackground(Color.blue);
    lab.setForeground(Color.WHITE);

    JButton btn1, btn2;
    btn1 = new JButton("2 Cards game");
    btn1.setLocation(30, 240);
    btn1.setSize(150, 60);
    btn2 = new JButton("3 Cards game");
    btn2.setLocation(220, 240);
    btn2.setSize(150, 60);
    btn1.addActionListener(new EventHandler());
    btn2.addActionListener(new EventHandler());

    add(btn2);
    add(btn1);
    
    setLayout(null);
    setSize(400, 400);
    setLocation(100, 100);
    setVisible(true);

}*/