package Event_package;

import Main_package.Caidanlan;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class cd_fuwuqi implements Runnable{
	static boolean bo=false;// �л�����������
	JProgressBar progress;// ����������
	JFrame jf = new JFrame();
	public cd_fuwuqi() {
		progress = new JProgressBar(0, 100);
		progress.setStringPainted(true);      // �������
		jf.add(progress);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(268, 44);// ����exe������44,����ʹ��55
		jf.setTitle("�����л�������");
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
		jf.setResizable(false);
		jf.addWindowListener(new WindowAdapter() {// ���ڹر��¼�
			public void windowClosing(WindowEvent e) {
				JOptionPane.showMessageDialog(null, "�л����ж� !", "����", JOptionPane.ERROR_MESSAGE);
			}
		});
	}
	public void run() {
		for(int i=0; i<100; i++) {// һ��ѭ��
            try {
                progress.setValue(progress.getValue() + 1); // �����߳̽��У����ӽ�����ֵ

                progress.setString(progress.getValue() + "%");
                Random s = new Random();
                int sj=s.nextInt(300);
                Thread.sleep(sj);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
         }
		JOptionPane.showMessageDialog(null, "�л����", "��ʾ",JOptionPane.INFORMATION_MESSAGE);
		jf.setVisible(false);// �����л�����
		bo=true;// �л������������
		Main_package.Main_form.frame.setVisible(true);// ��������
		Caidanlan.zcd_moren.setText("���л�Ĭ��ģʽ");
		Caidanlan.zcd_Steam.setText("�л�Steamģʽ");
	}
}
