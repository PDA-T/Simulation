package Main_package;

import Event_package.Menu_bar_event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Liebiaokuang {
	public static JList<String> list = new JList<>();// �����б��
	public Liebiaokuang() {
		String ruanjian[]= {"Hulu","ESET","NordVPN","Crunchyroll","DisneyPlus","PrimePhonic",
				 "EncryptMe","TrueFire","Netflix","Lightroom","Instagram",
				 "Discord","Minecraft","Steam Key [ad]","�����������"};
		DefaultListModel<String> mode=new DefaultListModel<>();
		for(String tmp:ruanjian) {
			mode.addElement(tmp);
		}
		list.setModel(mode);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setSelectedIndex(0);
		//��ӹ�����
		JScrollPane js=new JScrollPane(list);
		js.setBounds(0, 0, 128, 248);// ģ������237,����exe248
		Main_package.Main_form.frame.getContentPane().add(js);
		//Ϊ�б����ӽ�����
		Main_package.Main_form.progressBar.setBounds(189, 99, 193, 14);
		Main_package.Main_form.frame.getContentPane().add(Main_package.Main_form.progressBar);
		//��ӱ�ǩ
		Main_package.Main_form.lblNewLabel.setBounds(249, 48, 71, 15);
		Main_package.Main_form.frame.getContentPane().add(Main_package.Main_form.lblNewLabel);
		//��Ӱ�ť
		JButton btnNewButton = new JButton("ȷ��");
		btnNewButton.setBounds(236, 170, 93, 23);
		Main_package.Main_form.frame.getContentPane().add(btnNewButton);// ��Ӱ�ť
		btnNewButton.setBackground(Color.lightGray);// ���ð�ť��ɫ
		btnNewButton.setBorder(BorderFactory.createRaisedBevelBorder());// ���ð�ť͹��
		btnNewButton.setFont(new  java.awt.Font("�����п�",  1,  13));// ���ð�ť����
		// �ж����ݿ��¼��Ƿ���ά��
		btnNewButton.addActionListener(new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Menu_bar_event().anz_dengji();// ������ť�¼�
				//new Menu_bar_event().mysql();// ���ݿ��¼�
			}
		});
	}
}
