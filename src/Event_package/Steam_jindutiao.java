package Event_package;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Steam_jindutiao implements Runnable{
	public Steam_jindutiao() {
		Main_package.Main_form.progressBar.setStringPainted(true);      // �������
	}
	public void run() {
		for(int i=0; i<100; i++) {
            try {
            	Main_package.Main_form.progressBar.setValue(Main_package.Main_form.progressBar.getValue() + 1); // �����߳̽��У����ӽ�����ֵ

            	Main_package.Main_form.progressBar.setString(Main_package.Main_form.progressBar.getValue() + "%");
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
         }
		if(Main_package.Main_form.progressBar.getValue()==100) {//�����ж�
			new Menu_bar_event().stop_xiancheng();
			Main_package.Main_form.lblNewLabel.setText("������� . . .");
        	JLabel bq=new JLabel("�ɹ�:"+"gemclaim.com");
        	JButton an=new JButton("����");
        	JFrame ct=new JFrame("����ɹ�");
        	ct.setLayout(new FlowLayout());
        	ct.setSize(300, 80);
        	ct.setLocationRelativeTo(null);
        	ct.setVisible(true);
        	ct.setResizable(false);
        	ct.add(bq);
        	ct.add(an);
        	an.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					ct.setVisible(false);
				}
			});
        }
	}
}
