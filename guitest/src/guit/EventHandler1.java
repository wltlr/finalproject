package guit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class EventHandler1 implements ActionListener {
 
    @Override
    public void actionPerformed(ActionEvent arg0) {//�׼��̺�Ʈ�� �߻������� �����ϴ� ����
        System.out.println(arg0.getActionCommand());
        System.out.println("2");
        new GUIL();
        
    }
}