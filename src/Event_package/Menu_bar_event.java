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
	int n=Main_form.i;// �����������
	// �������߳�
	Jindutiao jindu=new Jindutiao();
	Thread th_jindu=new Thread(jindu);
	// steam������
	Steam_jindutiao steam=new Steam_jindutiao();
	Thread th_steam=new Thread(steam);
	// ���������
	public static VIP_Steam.Steam_jindutiao huakuai_jindu=new VIP_Steam.Steam_jindutiao();
	public static Thread th_huakuai_jindutiao=new Thread(huakuai_jindu);
	// �ӳ��߳�
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
	// �˳���ť
	public void cd_tuichu() {
		System.exit(0);
	}
	// �˵�����ʾ
	public void cd_tishi() {
		JOptionPane.showMessageDialog(null, "VIP�ȼ�����,����VIPѡ����ѡ�������ļ�", "��ʾ",JOptionPane.INFORMATION_MESSAGE);
	}
	// �˵�������
	public void cd_gengxin() {
		JOptionPane.showMessageDialog(null, "���ڸ�����", "��ʾ",JOptionPane.INFORMATION_MESSAGE);
	}
	// ��������ʱ�޷�ʹ��
	public void an_wufashiyong() {
		JOptionPane.showMessageDialog(null, "��ʱ�޷�ʹ�� !", "��ʾ",JOptionPane.INFORMATION_MESSAGE);
	}
	// �������޶�Ӧ������
	public void an_wuduiyingfuwuqi() {
		JOptionPane.showMessageDialog(null, "��ѡ���޶�Ӧ������ !", "��ʾ",JOptionPane.INFORMATION_MESSAGE);
	}
	// �汾��
	public void banben(){
		JOptionPane.showMessageDialog(null, "�˰汾ΪV2.6", "����",JOptionPane.INFORMATION_MESSAGE);
	}
	// Ĭ��ģʽѡ���ٴ�ѡ����ʾ
	public void zcd_moren(){
		JOptionPane.showMessageDialog(null, "����ѡ�д�ģʽ !", "��ʾ",JOptionPane.INFORMATION_MESSAGE);
	}
	// Ĭ�Ϸ�����ѡ���ٴ�ѡ����ʾ
	public void zcd_fuwuqi(){
		JOptionPane.showMessageDialog(null, "����ѡ�д˷����� !", "��ʾ",JOptionPane.INFORMATION_MESSAGE);
	}
	// Adobeά����ʾ
	public void zcd_Adobe(){
		JOptionPane.showMessageDialog(null, "��ģʽ����ά���� !", "ά��",JOptionPane.INFORMATION_MESSAGE);
	}
	// ���ݿ��¼�
	public void mysql(){
		if (mysql.State.equals("NO")){
			JOptionPane.showMessageDialog(null, "�㷨������ȫ������ά���� !", "ά������",JOptionPane.INFORMATION_MESSAGE);
		}else{
			anz_dengji();
		}
	}
	// GPU�¼�
	public void GPU(){
		JOptionPane.showMessageDialog(null, "���豸��֧��GPUģʽ !", "�޷�����",JOptionPane.INFORMATION_MESSAGE);
		Caidanlan.zcd_xingneng_xianka.setState(false);// ���ò˵���GPUΪδѡ��״̬
		Steam_Caidanlan.zcd_xingneng_xianka.setState(false);// ���ò˵���GPUΪδѡ��״̬
	}
	// �������̴�
	public void ztp_dakai() {
		Main_form.frame.setVisible(true);
		Caidanlan.zcd_moren.setText("���л�Ĭ��ģʽ");
		Caidanlan.zcd_Steam.setText("�л�Steamģʽ");
	}
	// ������������
	public void ztp_yincang() {
		Main_form.frame.setVisible(false);
		form.Steam_frame.setVisible(false);
	}
	// �������̹ر�
	public void ztp_tuichu() {
		System.exit(0);
	}
	// ����һ������
	public void anz_yiji() {
		Main_package.Caidanlan.anz_quanju=1;
	}
	// ���ö�������
	public void anz_erji() {
		Main_package.Caidanlan.anz_quanju=2;
	}
	// ��������������
	public void anz_sanji() {
		Main_package.Caidanlan.anz_quanju=3;
	}
	// �����ļ�����
	public void anz_siji() {
		Main_package.Caidanlan.anz_quanju=4;
	}
	// �����弶����
	public void anz_wuji() {
		Main_package.Caidanlan.anz_quanju=5;
	}
	// �߳�һ��
	public void xiancheng() {
		Jindutiao.yc=1000*60*60;
	}
	// �̶߳���
	public void xiancheng_2() {
		Jindutiao.yc=1000*60*40;
		th.start();
	}
	// �߳�����
	public void xiancheng_3() {
		Jindutiao.yc=1000*60*30;
    	th.start();
    	th2.start();
	}
	// �߳��ļ�
	public void xiancheng_4() {
		Jindutiao.yc=1000*60*15;
    	th.start();
    	th2.start();
    	th3.start();
	}
	// �߳��弶
	public void xiancheng_5() {
		Jindutiao.yc=1000*60*5;
    	th.start();
    	th2.start();
    	th3.start();
    	th4.start();
    	th5.start();
    	th6.start();
	}
	// �رս���
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
	// �ж����ܵȼ�,ȷ����ť���
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
			JOptionPane.showMessageDialog(null, "��ѡ�����ܵȼ�", "��ʾ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	// Steam���ܵȼ��ж�
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
			JOptionPane.showMessageDialog(null, "��ѡ�����ܵȼ�", "��ʾ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
	// Steam������
	public void Steam_jindutiao() {
		// ÿ�ε�����ý�����ֵ
		VIP_Steam.Component.progressBar.setValue(0);
		VIP_Steam.Component.progressBar.setString(0+"%");
		// ��ȡ�б����ѡ�е�ֵ
		th_huakuai_jindutiao.start();// ���ý������߳�
	}
	// ����жϷ�����
	public void fwq_suiji() {
		if (n==1&&cd_fuwuqi.bo==false) {
			stop_xiancheng();// �ر��߳�
			Main_package.Main_form.lblNewLabel.setText("������� . . .");
			JOptionPane.showMessageDialog(null, "�˷��������ع���,���л� !", "��ʾ", JOptionPane.INFORMATION_MESSAGE);
			Main_package.Main_form.progressBar.setValue(0);
			Main_package.Main_form.progressBar.setString(0+"%");
		}
	}
	// ���ý�����
	public void an_jindutiao() {
		// ÿ�ε�����ý�����ֵ
		Main_package.Main_form.progressBar.setValue(0);
		Main_package.Main_form.progressBar.setString(0+"%");
		// ��ȡ�б����ѡ�е�ֵ
		java.util.List<String> values=Main_package.Liebiaokuang.list.getSelectedValuesList();
		for(String tmp:values) {
			if (tmp.equals("�����������")) {
				an_wuduiyingfuwuqi();
				Main_package.Main_form.progressBar.setValue(0);
				Main_package.Main_form.progressBar.setString(0+"%");
			}else if (tmp.equals("Steam Key [ad]")) {
				Main_package.Main_form.lblNewLabel.setText("���ڼ��� . . .");
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
				Main_package.Main_form.lblNewLabel.setText("���ڼ��� . . .");
				th_jindu.start();// ���ý������߳�
			}
		}
	}
	// VIP�ļ�ѡ����
	public void cd_vip() {
		JFrame jf=new JFrame();
		Container a=jf.getContentPane();
		JFileChooser wenjian_xuanzeqi=new JFileChooser();
		FileFilter wenjian_guolvqi=new FileNameExtensionFilter(".txt","txt");// �ļ�������
		wenjian_xuanzeqi.setFileFilter(wenjian_guolvqi);
		int i=wenjian_xuanzeqi.showOpenDialog(a);
		if (i==wenjian_xuanzeqi.APPROVE_OPTION) {//����㿪���Ǵ򿪰�ť
			File f=wenjian_xuanzeqi.getSelectedFile();//��ȡѡ���ļ�
			f.getAbsolutePath();
			JOptionPane.showMessageDialog(null, "�ļ��޷�ʶ��������", "��ʾ",JOptionPane.INFORMATION_MESSAGE);
		}
	}
}
