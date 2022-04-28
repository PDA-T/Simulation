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
		login.setTitle("系统登录");
		login.setSize(296, 188);
		login.setLocationRelativeTo(null);
		login.setDefaultCloseOperation(login.EXIT_ON_CLOSE);
		login.setVisible(true);
		login.setLayout(null);// 设置登录面板的布局为绝对布局
		login.setResizable(false);// 设置不可改变大小
		//设置登录窗口图标
		ImageIcon tubiao=new ImageIcon(getClass().getResource("/image/login_butiao.png"));
		login.setIconImage(tubiao.getImage());
		//login.setBackground(new Color(0xD8DDC7));// 设置登录面板的背景色
		JLabel jLabel1 = new JLabel();// “密码”标签
		jLabel1.setBounds(new Rectangle(86, 71, 55, 18));// 设置“密码”标签的位置与宽高
		jLabel1.setText("密　码：");// 设置“密码”标签的文本内容
		JLabel jLabel = new JLabel();// “用户名”标签
		jLabel.setText("用户名：");// 设置“用户名”标签的文本内容
		jLabel.setBounds(new Rectangle(85, 41, 56, 18));// 设置“用户名”标签的位置与宽高
		JTextField userField = new JTextField();// 实例化“用户名”文本框
		userField.setBounds(new Rectangle(142, 39, 127, 22));// 设置“用户名”文本框的位置和宽高
		JPasswordField passwordField = new JPasswordField();// 实例化“密码”文本框
		passwordField.setBounds(new Rectangle(143, 69, 125, 22));// 设置“密码”文本框的位置和宽高
		JButton loginButton = new JButton();// 实例化“登录”按钮
		loginButton.setBounds(new Rectangle(109, 114, 48, 20));// 设置“登录”按钮的位置和宽高
		// 设置图片
		loginButton.setIcon(new ImageIcon(getClass().getResource("/image/loginButton.jpg")));
		loginButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String userStr = userField.getText();// 获得“用户名”文本框中的内容
				String passStr = new String(passwordField.getPassword());// 获得“密码”文本框中的内容
				if (userStr.equals(/*mysql.user*/"123")&&passStr.equals(/*mysql.password*/"123")) {
					login.setVisible(false);// 隐藏此面板
					new Main_form().initialize();// 进入主程序
				}else {
					JOptionPane.showMessageDialog(null, "用户名与密码无法登录", "登录失败", JOptionPane.ERROR_MESSAGE);
				}
			}
		});
		JButton exitButton = new JButton();// 实例化“退出”按钮
		exitButton.setBounds(new Rectangle(181, 114, 48, 20));// 设置“退出”按钮的位置和宽高
		// 设置图片
		exitButton.setIcon(new ImageIcon(getClass().getResource("/image/exitButton.jpg")));
		exitButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu.cd_tuichu();
			}
		});
		JPanel imagePanel;// 创建容器
		// 设置图片
		ImageIcon login_image=new ImageIcon(getClass().getResource("/image/login.jpg"));
		JLabel label = new JLabel(login_image);// 把背景图片显示在一个标签里面
		// 把标签的大小位置设置为图片刚好填充整个面板
		label.setBounds(0, 0, login_image.getIconWidth(), login_image.getIconHeight());
		// 把内容窗格转化为JPanel,否则不能用方法setOpaque()来使内容窗格透明
		imagePanel = (JPanel)login.getContentPane();
		imagePanel.setOpaque(false);
		// 把背景图片添加到分层窗格的最底层作为背景
		login.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
		a.add(jLabel, null);// 把“用户名”标签置于登录面板中
		a.add(userField, null);// 把“用户名”文本框置于登录面板中
		a.add(jLabel1, null);// 把“密码”标签置于登录面板中
		a.add(passwordField, null);// 把“密码”文本框置于登录面板中
		a.add(loginButton, null);// 把“登录”按钮置于登录面板中
		a.add(exitButton, null);// 把“退出”按钮置于登录面板中
	}
}
	