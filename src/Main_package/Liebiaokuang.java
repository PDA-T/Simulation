package Main_package;

import Event_package.Menu_bar_event;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Liebiaokuang {
	public static JList<String> list = new JList<>();// 创建列表框
	public Liebiaokuang() {
		String ruanjian[]= {"Hulu","ESET","NordVPN","Crunchyroll","DisneyPlus","PrimePhonic",
				 "EncryptMe","TrueFire","Netflix","Lightroom","Instagram",
				 "Discord","Minecraft","Steam Key [ad]","后续还会更新"};
		DefaultListModel<String> mode=new DefaultListModel<>();
		for(String tmp:ruanjian) {
			mode.addElement(tmp);
		}
		list.setModel(mode);
		list.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		list.setSelectedIndex(0);
		//添加滚动条
		JScrollPane js=new JScrollPane(list);
		js.setBounds(0, 0, 128, 248);// 模拟运行237,导出exe248
		Main_package.Main_form.frame.getContentPane().add(js);
		//为列表框添加进度条
		Main_package.Main_form.progressBar.setBounds(189, 99, 193, 14);
		Main_package.Main_form.frame.getContentPane().add(Main_package.Main_form.progressBar);
		//添加标签
		Main_package.Main_form.lblNewLabel.setBounds(249, 48, 71, 15);
		Main_package.Main_form.frame.getContentPane().add(Main_package.Main_form.lblNewLabel);
		//添加按钮
		JButton btnNewButton = new JButton("确认");
		btnNewButton.setBounds(236, 170, 93, 23);
		Main_package.Main_form.frame.getContentPane().add(btnNewButton);// 添加按钮
		btnNewButton.setBackground(Color.lightGray);// 设置按钮颜色
		btnNewButton.setBorder(BorderFactory.createRaisedBevelBorder());// 设置按钮凸起
		btnNewButton.setFont(new  java.awt.Font("华文行楷",  1,  13));// 设置按钮字体
		// 判断数据库事件是否在维护
		btnNewButton.addActionListener(new AbstractAction() {
			@Override
			public void actionPerformed(ActionEvent e) {
				new Menu_bar_event().anz_dengji();// 启动按钮事件
				//new Menu_bar_event().mysql();// 数据库事件
			}
		});
	}
}
