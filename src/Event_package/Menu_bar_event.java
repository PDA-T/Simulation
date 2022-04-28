package Event_package;

import Card_thread.*;
import Main_package.Caidanlan;
import Main_package.Main_form;
import VIP_Steam.Steam_Caidanlan;
import VIP_Steam.form;

import javax.swing.*;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;
import java.awt.*;
import java.io.File;
public class Menu_bar_event {
	int n=Main_form.i;// 服务器随机数
	// 进度条线程
	Jindutiao jindu=new Jindutiao();
	Thread th_jindu=new Thread(jindu);
	// steam进度条
	Steam_jindutiao steam=new Steam_jindutiao();
	Thread th_steam=new Thread(steam);
	// 滑块进度条
	public static VIP_Steam.Steam_jindutiao huakuai_jindu=new VIP_Steam.Steam_jindutiao();
	public static Thread th_huakuai_jindutiao=new Thread(huakuai_jindu);
	// 延迟线程
	Occupy_thread xi=new Occupy_thread();
	Thread th=new Thread(xi);
	Occupy_thread_2 xi2=new Occupy_thread_2();
	Thread th2=new Thread(xi2);
	Occupy_thread_3 xi3=new Occupy_thread_3();
	Thread th3=new Thread(xi3);
	Occupy_thread_4 xi4=new Occupy_thread_4();
	Thread th4=new Thread(xi4);
	Occupy_thread_5 xi5=new Occupy_thread_5();
	Thread th5=new Thread(xi5);
	Occupy_thread_6 xi6=new Occupy_thread_6();
	Thread th6=new Thread(xi6);
	// 退出按钮
	public void cd_tuichu() {
		System.exit(0);
	}
	// 菜单栏提示
	public void cd_tishi() {
		JOptionPane.showMessageDialog(null, "VIP等级不足,请在VIP选项中选择升级文件", "提示",JOptionPane.INFORMATION_MESSAGE);
	}
	// 菜单栏更新
	public void cd_gengxin() {
		JOptionPane.showMessageDialog(null, "正在更新中", "提示",JOptionPane.INFORMATION_MESSAGE);
	}
	// 进度条暂时无法使用
	public void an_wufashiyong() {
		JOptionPane.showMessageDialog(null, "暂时无法使用 !", "提示",JOptionPane.INFORMATION_MESSAGE);
	}
	// 进度条无对应服务器
	public void an_wuduiyingfuwuqi() {
		JOptionPane.showMessageDialog(null, "此选项无对应服务器 !", "提示",JOptionPane.INFORMATION_MESSAGE);
	}
	// 版本号
	public void banben(){
		JOptionPane.showMessageDialog(null, "此版本为V2.6", "关于",JOptionPane.INFORMATION_MESSAGE);
	}
	// 默认模式选中再次选择提示
	public void zcd_moren(){
		JOptionPane.showMessageDialog(null, "您已选中此模式 !", "提示",JOptionPane.INFORMATION_MESSAGE);
	}
	// 默认服务器选中再次选择提示
	public void zcd_fuwuqi(){
		JOptionPane.showMessageDialog(null, "您已选中此服务器 !", "提示",JOptionPane.INFORMATION_MESSAGE);
	}
	// Adobe维护提示
	public void zcd_Adobe(){
		JOptionPane.showMessageDialog(null, "此模式正在维护中 !", "维护",JOptionPane.INFORMATION_MESSAGE);
	}
	// 数据库事件
	public void mysql(){
		if (mysql.State.equals("NO")){
			JOptionPane.showMessageDialog(null, "算法服务器全面升级维护中 !", "维护升级",JOptionPane.INFORMATION_MESSAGE);
		}else{
			anz_dengji();
		}
	}
	// GPU事件
	public void GPU(){
		JOptionPane.showMessageDialog(null, "此设备不支持GPU模式 !", "无法开启",JOptionPane.INFORMATION_MESSAGE);
		Caidanlan.zcd_xingneng_xianka.setState(false);// 设置菜单栏GPU为未选中状态
		Steam_Caidanlan.zcd_xingneng_xianka.setState(false);// 设置菜单栏GPU为未选中状态
	}
	// 设置托盘打开
	public void ztp_dakai() {
		Main_form.frame.setVisible(true);
		Caidanlan.zcd_moren.setText("√切换默认模式");
		Caidanlan.zcd_Steam.setText("切换Steam模式");
	}
	// 设置托盘隐藏
	public void ztp_yincang() {
		Main_form.frame.setVisible(false);
		form.Steam_frame.setVisible(false);
	}
	// 设置托盘关闭
	public void ztp_tuichu() {
		System.exit(0);
	}
	// 设置一级性能
	public void anz_yiji() {
		Main_package.Caidanlan.anz_quanju=1;
	}
	// 设置二级性能
	public void anz_erji() {
		Main_package.Caidanlan.anz_quanju=2;
	}
	// 设置三级级性能
	public void anz_sanji() {
		Main_package.Caidanlan.anz_quanju=3;
	}
	// 设置四级性能
	public void anz_siji() {
		Main_package.Caidanlan.anz_quanju=4;
	}
	// 设置五级性能
	public void anz_wuji() {
		Main_package.Caidanlan.anz_quanju=5;
	}
	// 线程一级
	public void xiancheng() {
		Jindutiao.yc=1000*60*60;
	}
	// 线程二级
	public void xiancheng_2() {
		Jindutiao.yc=1000*60*40;
		th.start();
	}
	// 线程三级
	public void xiancheng_3() {
		Jindutiao.yc=1000*60*30;
    	th.start();
    	th2.start();
	}
	// 线程四级
	public void xiancheng_4() {
		Jindutiao.yc=1000*60*15;
    	th.start();
    	th2.start();
    	th3.start();
	}
	// 线程五级
	public void xiancheng_5() {
		Jindutiao.yc=1000*60*5;
    	th.start();
    	th2.start();
    	th3.start();
    	th4.start();
    	th5.start();
    	th6.start();
	}
	// 关闭进程
	public void stop_xiancheng() {
		th_huakuai_jindutiao.stop();
		th_jindu.stop();
		th_steam.stop();
		th.stop();
		th2.stop();
		th3.stop();
		th4.stop();
		th5.stop();
		th6.stop();
	}
	// 判断性能等级,确定按钮入口
	public void anz_dengji() {
		if (Main_package.Caidanlan.anz_quanju==1) {
			xiancheng();
			fwq_suiji();
			an_jindutiao();
		}else if (Main_package.Caidanlan.anz_quanju==2) {
			xiancheng_2();
			fwq_suiji();
			an_jindutiao();
		}else if (Main_package.Caidanlan.anz_quanju==3) {
			xiancheng_3();
			fwq_suiji();
			an_jindutiao();
		}else if (Main_package.Caidanlan.anz_quanju==4) {
			xiancheng_4();
			fwq_suiji();
			an_jindutiao();
		}else if (Main_package.Caidanlan.anz_quanju==5) {
			xiancheng_5();
			fwq_suiji();
			an_jindutiao();
		}else {
			JOptionPane.showMessageDialog(null, "请选择性能等级", "提示",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	// Steam性能等级判断
	public void anz_Steam_dengji() {
		if (Main_package.Caidanlan.anz_quanju==1) {
			xiancheng();
			fwq_suiji();
			Steam_jindutiao();
		}else if (Main_package.Caidanlan.anz_quanju==2) {
			xiancheng_2();
			fwq_suiji();
			Steam_jindutiao();
		}else if (Main_package.Caidanlan.anz_quanju==3) {
			xiancheng_3();
			fwq_suiji();
			Steam_jindutiao();
		}else if (Main_package.Caidanlan.anz_quanju==4) {
			xiancheng_4();
			fwq_suiji();
			Steam_jindutiao();
		}else if (Main_package.Caidanlan.anz_quanju==5) {
			xiancheng_5();
			fwq_suiji();
			Steam_jindutiao();
		}else {
			JOptionPane.showMessageDialog(null, "请选择性能等级", "提示",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	// Steam进度条
	public void Steam_jindutiao() {
		// 每次点击重置进度条值
		VIP_Steam.Component.progressBar.setValue(0);
		VIP_Steam.Component.progressBar.setString(0+"%");
		// 获取列表框中选中的值
		th_huakuai_jindutiao.start();// 启用进度条线程
	}
	// 随机判断服务器
	public void fwq_suiji() {
		if (n==1&&cd_fuwuqi.bo==false) {
			stop_xiancheng();// 关闭线程
			Main_package.Main_form.lblNewLabel.setText("计算错误 . . .");
			JOptionPane.showMessageDialog(null, "此服务器负载过高,请切换 !", "提示", JOptionPane.INFORMATION_MESSAGE);
			Main_package.Main_form.progressBar.setValue(0);
			Main_package.Main_form.progressBar.setString(0+"%");
		}
	}
	// 调用进度条
	public void an_jindutiao() {
		// 每次点击重置进度条值
		Main_package.Main_form.progressBar.setValue(0);
		Main_package.Main_form.progressBar.setString(0+"%");
		// 获取列表框中选中的值
		java.util.List<String> values=Main_package.Liebiaokuang.list.getSelectedValuesList();
		for(String tmp:values) {
			if (tmp.equals("后续还会更新")) {
				an_wuduiyingfuwuqi();
				Main_package.Main_form.progressBar.setValue(0);
				Main_package.Main_form.progressBar.setString(0+"%");
			}else if (tmp.equals("Steam Key [ad]")) {
				Main_package.Main_form.lblNewLabel.setText("正在计算 . . .");
				Main_package.Main_form.progressBar.setValue(0);
				Main_package.Main_form.progressBar.setString(0+"%");
				th_steam.start();
				th.stop();
				th2.stop();
				th3.stop();
				th4.stop();
				th5.stop();
				th6.stop();
			}else {
				Main_package.Main_form.lblNewLabel.setText("正在计算 . . .");
				th_jindu.start();// 启用进度条线程
			}
		}
	}
	// VIP文件选择器
	public void cd_vip() {
		JFrame jf=new JFrame();
		Container a=jf.getContentPane();
		JFileChooser wenjian_xuanzeqi=new JFileChooser();
		FileFilter wenjian_guolvqi=new FileNameExtensionFilter(".txt","txt");// 文件过滤器
		wenjian_xuanzeqi.setFileFilter(wenjian_guolvqi);
		int i=wenjian_xuanzeqi.showOpenDialog(a);
		if (i==wenjian_xuanzeqi.APPROVE_OPTION) {//如果点开的是打开按钮
			File f=wenjian_xuanzeqi.getSelectedFile();//获取选择文件
			f.getAbsolutePath();
			JOptionPane.showMessageDialog(null, "文件无法识别请重试", "提示",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
