package sutda;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;

public class GameFrame extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GameFrame frame = new GameFrame();
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
	public GameFrame() {
		setTitle("로그인");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 800);
		
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);

	
	}
	
	
	
}
/*
public JTabbedPane createTabbedPane()
{
	JTabbedPane pane new JTabbedPane();
	
	pane.addTab(new JLabel(new ImageIcon(image1_1.jpg)));
}
*/
/*
Label lid;
Label lpw;
TextField tid;
TextField tpw;
Button login;

Event_log_c(String title){
	super(title);
	lid = new Label("ID :", Label.RIGHT);
	lpw = new Label("PW :", Label.RIGHT);
	tid = new TextField(12);
	tpw = new TextField(12);
	tpw = setEchoChar('*');
	login = new Button("로그인");
	
	tid.addActionListener(new EH());
	tpw.addActionListener(new EH());
	login.addActionListener(new EH());
}

setLayout(new FlowLayout());
add(lid);
add(tid);
add(lpw);
add(tpw);
add(login);
setVisible(true);
*/