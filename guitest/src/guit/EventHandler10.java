package guit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class EventHandler10 implements ActionListener {
 
    @Override
    public void actionPerformed(ActionEvent arg0) {//�׼��̺�Ʈ�� �߻������� �����ϴ� ����
        System.out.println(arg0.getActionCommand());
        System.exit(0);
    }
}