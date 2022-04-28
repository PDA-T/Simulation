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
		 * 设置背景
		 */
		JPanel imagePanel;// 创建容器
		// 设置图片
		ImageIcon beijing=new ImageIcon(getClass().getResource("/image/beijing.jpg"));
		JLabel label = new JLabel(beijing);// 把背景图片显示在一个标签里面
		// 把标签的大小位置设置为图片刚好填充整个面板
		label.setBounds(0, 0, beijing.getIconWidth(), beijing.getIconHeight());
		// 把内容窗格转化为JPanel,否则不能用方法setOpaque()来使内容窗格透明
		imagePanel = (JPanel)Main_form.frame.getContentPane();
		imagePanel.setOpaque(false);
		// 把背景图片添加到分层窗格的最底层作为背景
		Main_form.frame.getLayeredPane().add(label, new Integer(Integer.MIN_VALUE));
		/**
		 * 设置托盘
		 */
		PopupMenu tp=new PopupMenu();
		MenuItem ztp_dakai=new MenuItem("打开");
		MenuItem ztp_yincang=new MenuItem("隐藏");
		MenuItem ztp_tuichu=new MenuItem("退出");
		try {
			SystemTray tuopan=SystemTray.getSystemTray();// 获得系统托盘的实例
			// 添加图片
			ImageIcon i=new ImageIcon(getClass().getResource("/image/tuopan.png"));
			TrayIcon t=new TrayIcon(i.getImage(),"Resilio sync",tp);// 设置系统托盘
			tuopan.add(t);
		} catch (AWTException e) {
			e.printStackTrace();
		}
		// 设置按钮事件
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
		tp.addSeparator();// 添加分割线
		tp.add(ztp_tuichu);
		ztp_tuichu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				menu.ztp_tuichu();
			}
		});
	}
}
