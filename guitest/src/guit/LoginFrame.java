
import java.awt.BorderLayout;
import java.awt.Button;
import java.awt.Checkbox;
import java.awt.Frame;
import java.awt.GridLayout;
import java.awt.Label;
import java.awt.Panel;
import java.awt.TextField;

@SuppressWarnings("serial")
class LoginFrame extends Frame{
	Label lMessage;
	TextField tfid,tfpw;
	Checkbox cbidsave;
	Label lSave;
	Button blogin;

	public LoginFrame(){
		//ȭ�� ����
		super("Login ȭ��");

		makeScreen();
	}

	public void makeScreen(){

		//North - ���� ������ ��
		setLayout(new BorderLayout());
		lMessage = new Label("�α��� �ϼ���");
		this.add(BorderLayout.NORTH, lMessage);

		Panel panel1 = new Panel();
		panel1.setLayout(new BorderLayout());
		this.add(panel1);

		//���� ���� TextField 2��
		Panel panel11 = new Panel();
		panel11.setLayout(new GridLayout(2,1));
		panel1.add(BorderLayout.WEST,panel11);

		Panel panel11up = new Panel();
		tfid = new TextField("ID",20);
		panel11up.add(tfid);
		panel11.add(panel11up);

		Panel panel11down = new Panel();
		tfpw = new TextField("PW",20);
		panel11down.add(tfpw);
		panel11.add(panel11down);


		//���� ������ check + button
		Panel panel12 = new Panel();
		panel12.setLayout(new GridLayout(2,1));
		panel1.add(BorderLayout.CENTER,panel12);
		Panel panel12up = new Panel();
		Checkbox cb1 = new Checkbox("ID����");
		panel12up.add(cb1);
		panel12.add(panel12up);

		Panel panel12down = new Panel();
		Button blogin = new Button("�α���");
		panel12down.add(blogin);
		panel12.add(panel12down);



	}
}