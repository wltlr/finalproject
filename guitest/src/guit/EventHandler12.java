package guit;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
 
public class EventHandler12 implements ActionListener {
 
    @Override
    public void actionPerformed(ActionEvent arg0) {//�׼��̺�Ʈ�� �߻������� �����ϴ� ����
        System.out.println(arg0.getActionCommand());
        new GUIF();
    }
}