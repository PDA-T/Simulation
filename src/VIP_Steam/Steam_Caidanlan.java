package VIP_Steam;

import Event_package.Menu_bar_event;
import Event_package.cd_fuwuqi;
import Main_package.Caidanlan;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Steam_Caidanlan {
    public static JCheckBoxMenuItem zcd_xingneng_xianka;// GPUģʽ
    Menu_bar_event menu=new Menu_bar_event();
    public static int anz_quanju=0;// ������ť���ܼ�
    public Steam_Caidanlan() {
        JMenuBar menuBar = new JMenuBar();// �����˵���
        form.Steam_frame.setJMenuBar(menuBar);
        JMenu cd_fuwuqi=new JMenu("������");
        JMenuItem zcd_yidong=new JMenuItem("�����ƶ�");
        JMenuItem zcd_liantong=new JMenuItem("������ͨ");
        JMenuItem zcd_neihuadazhou=new JMenuItem("���ڻ�����_N01");
        JMenuItem zcd_gengxin=new JMenuItem("���ڳ�������");
        cd_fuwuqi.add(zcd_yidong);
        zcd_yidong.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (zcd_yidong.getText().equals("�̻����ƶ�")){
                    menu.zcd_fuwuqi();
                }else{
                    zcd_yidong.setText("�̻����ƶ�");
                    zcd_liantong.setText("������ͨ");
                    zcd_neihuadazhou.setText("�ڻ�����_N01");
                    Main_package.Main_form.frame.setVisible(false);
                    cd_fuwuqi cd=new cd_fuwuqi();
                    Thread th=new Thread(cd);
                    th.start();
                }
            }
        });
        cd_fuwuqi.add(zcd_liantong);
        zcd_liantong.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (zcd_liantong.getText().equals("�̻�����ͨ")){
                    menu.zcd_fuwuqi();
                }else{
                    zcd_yidong.setText("�����ƶ�");
                    zcd_liantong.setText("�̻�����ͨ");
                    zcd_neihuadazhou.setText("�ڻ�����_N01");
                    Main_package.Main_form.frame.setVisible(false);
                    cd_fuwuqi cd=new cd_fuwuqi();
                    Thread th=new Thread(cd);
                    th.start();
                }
            }
        });
        cd_fuwuqi.add(zcd_neihuadazhou);
        zcd_neihuadazhou.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (zcd_neihuadazhou.getText().equals("���ڻ�����_N01")){
                    menu.zcd_fuwuqi();
                }else{
                    zcd_yidong.setText("�����ƶ�");
                    zcd_liantong.setText("������ͨ");
                    zcd_neihuadazhou.setText("���ڻ�����_N01");
                    Main_package.Main_form.frame.setVisible(false);
                    cd_fuwuqi cd=new cd_fuwuqi();
                    Thread th=new Thread(cd);
                    th.start();
                }
            }
        });
        cd_fuwuqi.addSeparator();// ��Ӹ��·ָ���
        cd_fuwuqi.add(zcd_gengxin);
        zcd_gengxin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menu.cd_gengxin();
            }
        });

        JMenu cd_caidan=new JMenu("����");
        JMenu zcd_xingneng=new JMenu("����");
        JRadioButton zcd_xingneng_yiji=new JRadioButton("CPUһ������");
        JRadioButton zcd_xingneng_erji=new JRadioButton("CPU��������");
        JRadioButton zcd_xingneng_sanji=new JRadioButton("CPU��������");
        JRadioButton zcd_xingneng_siji=new JRadioButton("CPU�ļ�����");
        JRadioButton zcd_xingneng_wuji=new JRadioButton("CPU����ȫ��");
        zcd_xingneng_xianka=new JCheckBoxMenuItem("GPU�ӳ�");
        ButtonGroup anz=new ButtonGroup();// ��ӵ�ѡ��ť��
        anz.add(zcd_xingneng_yiji);
        zcd_xingneng_yiji.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menu.anz_yiji();
            }
        });
        anz.add(zcd_xingneng_erji);
        zcd_xingneng_erji.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menu.anz_erji();
            }
        });
        anz.add(zcd_xingneng_sanji);
        zcd_xingneng_sanji.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menu.anz_sanji();
            }
        });
        anz.add(zcd_xingneng_siji);
        zcd_xingneng_siji.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menu.anz_siji();
            }
        });
        anz.add(zcd_xingneng_wuji);
        zcd_xingneng_wuji.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menu.anz_wuji();
            }
        });
        JMenuItem zcd_tuichu=new JMenuItem("�˳�");
        cd_caidan.add(zcd_xingneng);
        zcd_xingneng.add(zcd_xingneng_yiji);
        zcd_xingneng.add(zcd_xingneng_erji);
        zcd_xingneng.add(zcd_xingneng_sanji);
        zcd_xingneng.add(zcd_xingneng_siji);
        zcd_xingneng.add(zcd_xingneng_wuji);
        zcd_xingneng.add(zcd_xingneng_xianka);
        zcd_xingneng_xianka.addActionListener(new ActionListener() {// GPUģʽ
            public void actionPerformed(ActionEvent e) {
                new Menu_bar_event().GPU();
            }
        });
        cd_caidan.addSeparator();// ����˳��ָ���
        cd_caidan.add(zcd_tuichu);
        // �˳��¼�
        zcd_tuichu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menu.cd_tuichu();
            }
        });

        JMenu cd_shezhi=new JMenu("�˵�");
        JMenuItem zcd_moren=new JMenuItem("�л�Ĭ��ģʽ");
        JMenuItem zcd_Adobe=new JMenuItem("�л�Adobeģʽ");
        JMenuItem zcd_Steam=new JMenuItem("���л�Steamģʽ");
        cd_shezhi.add(zcd_moren);
        zcd_moren.addActionListener(new ActionListener() {// Ĭ��ģʽ��ť
            public void actionPerformed(ActionEvent e) {
                if (zcd_moren.getText().equals("���л�Ĭ��ģʽ")){
                    menu.zcd_moren();
                }else{
                    form.Steam_frame.setVisible(false);// steam��������
                    Caidanlan.zcd_moren.setText("���л�Ĭ��ģʽ");
                    Caidanlan.zcd_Steam.setText("�л�Steamģʽ");
                    Main_package.Main_form.frame.setVisible(true);// �����ڴ�
                }
            }
        });
        cd_shezhi.add(zcd_Steam);
        zcd_Steam.addActionListener(new ActionListener() {// Steamģʽ��ť
            public void actionPerformed(ActionEvent e) {
                if (zcd_Steam.getText().equals("���л�Steamģʽ")){
                    menu.zcd_moren();
                }else{
                    Main_package.Main_form.frame.setVisible(false);// ����������
                    Caidanlan.zcd_moren.setText("�л�Ĭ��ģʽ");
                    Caidanlan.zcd_Steam.setText("���л�Steamģʽ");
                    form.Steam_frame.setVisible(true);// Steam���ڴ�
                }
            }
        });
        cd_shezhi.add(zcd_Adobe);
        zcd_Adobe.addActionListener(new ActionListener() {// Adobeģʽ��ť
            public void actionPerformed(ActionEvent e) {
                menu.zcd_Adobe();
            }
        });
        menuBar.add(cd_fuwuqi);
        menuBar.add(cd_shezhi);
        menuBar.add(cd_caidan);
        JMenu cd_vip=new JMenu("VIP");
        menuBar.add(cd_vip);
        JMenuItem zcd_vip=new JMenuItem("ѡ��VIP�ļ�");
        cd_vip.add(zcd_vip);
        zcd_vip.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menu.cd_vip();
            }
        });
        JMenu cd_bangzhu=new JMenu("����");
        JMenuItem zcd_guanyu=new JMenuItem("����");
        cd_bangzhu.add(zcd_guanyu);
        zcd_guanyu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Menu_bar_event().banben();
            }
        });
        menuBar.add(cd_bangzhu);
    }
}