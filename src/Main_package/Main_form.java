package Main_package;

import Event_package.Menu_bar_event;
import VIP_Steam.form;

import javax.swing.*;
import java.awt.*;
import java.util.Random;

public class Main_form {
	Menu_bar_event menu=new Menu_bar_event();// 创建事件类
	public static Random sj = new Random();// 创建服务器随机数对象
	public static JProgressBar progressBar = new JProgressBar(0,100);// 进度条
	public static JLabel lblNewLabel = new JLabel();// 标签
	public static JFrame frame;// 窗体
	public static int i=sj.nextInt(2);// 创建服务器随机数
	/**
	 * Launch the application.
	 * 主方法
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main_form window = new Main_form();
					window.Main_form();
					//window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	/**
	 * Create the application.
	 */
	public void Main_form() {
		//Event_package.mysql my=new Event_package.mysql();// 使用数据库判断版本和账号密码
		//new Main_form().initialize();// 测试使用
		login l=new login();// 登录
	}

	/**
	 * Initialize the contents of the frame
	 * 窗口制作区
	 */
	public void login() {
		new login();
	}
	public void initialize() {
		frame = new JFrame();
		frame.setSize(450, 300);
		frame.setVisible(true);
		frame.setTitle("Resilio sync");
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.getContentPane().setLayout(null);
		//主窗口图标
		ImageIcon tubiao=new ImageIcon(getClass().getResource("/image/chuangkou_tubiao.png"));
		frame.setIconImage(tubiao.getImage());
		new beijing();// 添加背景,托盘
		new Caidanlan();// 添加菜单栏
		new Liebiaokuang();// 添加列表框,进度条,标签
		new form().form();// 打开Steam窗口
	}
}