package Main_package;

import Event_package.Menu_bar_event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class beijing {
	Menu_bar_event menu=new Menu_bar_event();
	public beijing(){
		/**
		 * ���ñ���
		 */
		JPanel imagePanel;// ��������
		// ����ͼƬ
		ImageIcon beijing=new ImageIcon(getClass().getResource("/image/beijing.jpg"));
		JLabel label = new JLabel(beijing);// �ѱ���ͼƬ��ʾ��һ����ǩ����
		// �ѱ�ǩ�Ĵ�Сλ������ΪͼƬ�պ�����������
		label.setBounds(0, 0, beijing.getIconWidth(), beijing.getIconHeight());
		// �����ݴ���ת��ΪJPanel,�������÷���setOpaque()��ʹ���ݴ���͸��
		imagePanel = (JPanel)Main_form.frame.getContentPane();
		imagePanel.setOpaque(false);
		// �ѱ���ͼƬ��ӵ��ֲ㴰�����ײ���Ϊ����
		Main_form.frame.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
		/**
		 * ��������
		 */
		PopupMenu tp=new PopupMenu();
		MenuItem ztp_dakai=new MenuItem("��");
		MenuItem ztp_yincang=new MenuItem("����");
		MenuItem ztp_tuichu=new MenuItem("�˳�");
		try {
			SystemTray tuopan=SystemTray.getSystemTray();// ���ϵͳ���̵�ʵ��
			// ���ͼƬ
			ImageIcon i=new ImageIcon(getClass().getResource("/image/tuopan.png"));
			TrayIcon t=new TrayIcon(i.getImage(),"Resilio sync",tp);// ����ϵͳ����
			tuopan.add(t);
		} catch (AWTException e) {
			e.printStackTrace();
		}
		// ���ð�ť�¼�
		tp.add(ztp_dakai);
		ztp_dakai.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu.ztp_dakai();
			}
		});
		tp.add(ztp_yincang);
		ztp_yincang.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu.ztp_yincang();
			}
		});
		tp.addSeparator();// ��ӷָ���
		tp.add(ztp_tuichu);
		ztp_tuichu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu.ztp_tuichu();
			}
		});
	}
}
