package VIP_Steam;

import Event_package.mysql;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Steam_jindutiao implements Runnable{
    public Steam_jindutiao() {
        VIP_Steam.Component.progressBar.setStringPainted(true);      // �������
    }
    public void run() {
        for(int i=0; i<100; i++) {
            try {
                VIP_Steam.Component.progressBar.setValue(VIP_Steam.Component.progressBar.getValue() + 1); // �����߳̽��У����ӽ�����ֵ

                VIP_Steam.Component.progressBar.setString(VIP_Steam.Component.progressBar.getValue() + "%");
                Thread.sleep(Event_package.Jindutiao.yc);
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
        if(VIP_Steam.Component.progressBar.getValue()==100) {//�����ж�
            Event_package.mysql sql=new Event_package.mysql();
            sql.mysql_genggai();// �޸��˺�����
            JLabel bq=new JLabel("��⵽��ʹ�÷Ƿ���ʽ���VIP,��ע���˺�");
            JButton an=new JButton("����");
            JFrame ct=new JFrame("����ʧ��");
            ct.setDefaultCloseOperation(ct.EXIT_ON_CLOSE);
            ct.setLayout(new FlowLayout());
            ct.setSize(350, 80);
            ct.setLocationRelativeTo(null);
            ct.setVisible(true);
            ct.setResizable(false);
            ct.add(bq);
            ct.add(an);
            an.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);// ǿ���˳����
                }
            });
        }
    }
}