package Event_package;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Jindutiao implements Runnable{
	public static int yc;// �ӳ�ֵ
	public Jindutiao() {
		Main_package.Main_form.progressBar.setStringPainted(true);      // �������
	}
	public void run() {
		for(int i=0; i<100; i++) {
            try {
            	Main_package.Main_form.progressBar.setValue(Main_package.Main_form.progressBar.getValue() + 1); // �����߳̽��У����ӽ�����ֵ

            	Main_package.Main_form.progressBar.setString(Main_package.Main_form.progressBar.getValue() + "%");
                Thread.sleep(yc);
                // �����ǿ���˳�
                Random s1 = new Random();
                if (s1.nextInt(500)==10) {
                	JOptionPane.showMessageDialog(null, "�ڼ�������г����޷�Ԥ֪�Ĵ��� ! ! !", "����", JOptionPane.ERROR_MESSAGE);
                	JOptionPane.showMessageDialog(null, "�뾡����ͷ����� ! ! !", "����", JOptionPane.ERROR_MESSAGE);
                	System.exit(0);
				}
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
         }
		if(Main_package.Main_form.progressBar.getValue()==100) {//�����ж�
			Main_package.Main_form.lblNewLabel.setText("������� . . .");
        	String[] km= {"A","B","C","D","E","F","G","H","I","J","K","L","M",
        				  "N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        	Random sj=new Random();
        	int suiji=sj.nextInt(26);
        	int suiji2=sj.nextInt(26);
        	int suiji3=sj.nextInt(26);
        	int suiji4=sj.nextInt(26);
        	int suiji5=sj.nextInt(26);
        	int suiji6=sj.nextInt(26);
        	int suiji7=sj.nextInt(26);
        	int suiji8=sj.nextInt(26);
        	int suiji9=sj.nextInt(26);
        	int suiji10=sj.nextInt(26);
        	int suiji11=sj.nextInt(26);
        	int suiji12=sj.nextInt(26);
        	int suiji13=sj.nextInt(26);
        	int suiji14=sj.nextInt(26);
        	int suiji15=sj.nextInt(26);
        	int suiji16=sj.nextInt(26);
        	int suiji17=sj.nextInt(26);
        	int suiji18=sj.nextInt(26);
        	int suiji19=sj.nextInt(26);
        	int suiji20=sj.nextInt(26);
        	String st=km[suiji]+km[suiji2]+km[suiji3]+km[suiji4];
        	String st2=km[suiji5]+km[suiji6]+km[suiji7]+km[suiji8];
        	String st3=km[suiji9]+km[suiji10]+km[suiji11]+km[suiji12];
        	String st4=km[suiji13]+km[suiji14]+km[suiji15]+km[suiji16];
        	String st5=km[suiji17]+km[suiji18]+km[suiji19]+km[suiji20];
        	JLabel bq=new JLabel("����:"+st+"-"+st2+"-"+st3+"-"+st4+"-"+st5);
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