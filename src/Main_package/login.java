package Main_package;

import Event_package.Menu_bar_event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class login {
	Menu_bar_event menu=new Menu_bar_event();
	JFrame login=new JFrame();
	public login() {
		Container a=login.getContentPane();
		login.setTitle("ϵͳ��¼");
		login.setSize(296, 188);
		login.setLocationRelativeTo(null);
		login.setDefaultCloseOperation(login.EXIT_ON_CLOSE);
		login.setVisible(true);
		login.setLayout(null);// ���õ�¼���Ĳ���Ϊ���Բ���
		login.setResizable(false);// ���ò��ɸı��С
		//���õ�¼����ͼ��
		ImageIcon tubiao=new ImageIcon(getClass().getResource("/image/login_butiao.png"));
		login.setIconImage(tubiao.getImage());
		//login.setBackground(new Color(0xD8DDC7));// ���õ�¼���ı���ɫ
		JLabel jLabel1 = new JLabel();// �����롱��ǩ
		jLabel1.setBounds(new Rectangle(86, 71, 55, 18));// ���á����롱��ǩ��λ������
		jLabel1.setText("�ܡ��룺");// ���á����롱��ǩ���ı�����
		JLabel jLabel = new JLabel();// ���û�������ǩ
		jLabel.setText("�û�����");// ���á��û�������ǩ���ı�����
		jLabel.setBounds(new Rectangle(85, 41, 56, 18));// ���á��û�������ǩ��λ������
		JTextField userField = new JTextField();// ʵ�������û������ı���
		userField.setBounds(new Rectangle(142, 39, 127, 22));// ���á��û������ı����λ�úͿ��
		JPasswordField passwordField = new JPasswordField();// ʵ���������롱�ı���
		passwordField.setBounds(new Rectangle(143, 69, 125, 22));// ���á����롱�ı����λ�úͿ��
		JButton loginButton = new JButton();// ʵ��������¼����ť
		loginButton.setBounds(new Rectangle(109, 114, 48, 20));// ���á���¼����ť��λ�úͿ��
		// ����ͼƬ
		loginButton.setIcon(new ImageIcon(getClass().getResource("/image/loginButton.jpg")));
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userStr = userField.getText();// ��á��û������ı����е�����
				String passStr = new String(passwordField.getPassword());// ��á����롱�ı����е�����
				if (userStr.equals(/*mysql.user*/"123")&&passStr.equals(/*mysql.password*/"123")) {
					login.setVisible(false);// ���ش����
					new Main_form().initialize();// ����������
				}else {
					JOptionPane.showMessageDialog(null, "�û����������޷���¼", "��¼ʧ��", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		JButton exitButton = new JButton();// ʵ�������˳�����ť
		exitButton.setBounds(new Rectangle(181, 114, 48, 20));// ���á��˳�����ť��λ�úͿ��
		// ����ͼƬ
		exitButton.setIcon(new ImageIcon(getClass().getResource("/image/exitButton.jpg")));
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu.cd_tuichu();
			}
		});
		JPanel imagePanel;// ��������
		// ����ͼƬ
		ImageIcon login_image=new ImageIcon(getClass().getResource("/image/login.jpg"));
		JLabel label = new JLabel(login_image);// �ѱ���ͼƬ��ʾ��һ����ǩ����
		// �ѱ�ǩ�Ĵ�Сλ������ΪͼƬ�պ�����������
		label.setBounds(0, 0, login_image.getIconWidth(), login_image.getIconHeight());
		// �����ݴ���ת��ΪJPanel,�������÷���setOpaque()��ʹ���ݴ���͸��
		imagePanel = (JPanel)login.getContentPane();
		imagePanel.setOpaque(false);
		// �ѱ���ͼƬ��ӵ��ֲ㴰�����ײ���Ϊ����
		login.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
		a.add(jLabel, null);// �ѡ��û�������ǩ���ڵ�¼�����
		a.add(userField, null);// �ѡ��û������ı������ڵ�¼�����
		a.add(jLabel1, null);// �ѡ����롱��ǩ���ڵ�¼�����
		a.add(passwordField, null);// �ѡ����롱�ı������ڵ�¼�����
		a.add(loginButton, null);// �ѡ���¼����ť���ڵ�¼�����
		a.add(exitButton, null);// �ѡ��˳�����ť���ڵ�¼�����
	}
}
	