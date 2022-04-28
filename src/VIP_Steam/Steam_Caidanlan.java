package VIP_Steam;

import Event_package.Menu_bar_event;
import Event_package.cd_fuwuqi;
import Main_package.Caidanlan;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Steam_Caidanlan {
    public static JCheckBoxMenuItem zcd_xingneng_xianka;// GPU模式
    Menu_bar_event menu=new Menu_bar_event();
    public static int anz_quanju=0;// 创建按钮组总计
    public Steam_Caidanlan() {
        JMenuBar menuBar = new JMenuBar();// 创建菜单栏
        form.Steam_frame.setJMenuBar(menuBar);
        JMenu cd_fuwuqi=new JMenu("服务器");
        JMenuItem zcd_yidong=new JMenuItem("华南移动");
        JMenuItem zcd_liantong=new JMenuItem("华中联通");
        JMenuItem zcd_neihuadazhou=new JMenuItem("√内华达州_N01");
        JMenuItem zcd_gengxin=new JMenuItem("正在持续更新");
        cd_fuwuqi.add(zcd_yidong);
        zcd_yidong.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                if (zcd_yidong.getText().equals("√华南移动")){
                    menu.zcd_fuwuqi();
                }else{
                    zcd_yidong.setText("√华南移动");
                    zcd_liantong.setText("华中联通");
                    zcd_neihuadazhou.setText("内华达州_N01");
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
                if (zcd_liantong.getText().equals("√华中联通")){
                    menu.zcd_fuwuqi();
                }else{
                    zcd_yidong.setText("华南移动");
                    zcd_liantong.setText("√华中联通");
                    zcd_neihuadazhou.setText("内华达州_N01");
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
                if (zcd_neihuadazhou.getText().equals("√内华达州_N01")){
                    menu.zcd_fuwuqi();
                }else{
                    zcd_yidong.setText("华南移动");
                    zcd_liantong.setText("华中联通");
                    zcd_neihuadazhou.setText("√内华达州_N01");
                    Main_package.Main_form.frame.setVisible(false);
                    cd_fuwuqi cd=new cd_fuwuqi();
                    Thread th=new Thread(cd);
                    th.start();
                }
            }
        });
        cd_fuwuqi.addSeparator();// 添加更新分割线
        cd_fuwuqi.add(zcd_gengxin);
        zcd_gengxin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menu.cd_gengxin();
            }
        });

        JMenu cd_caidan=new JMenu("设置");
        JMenu zcd_xingneng=new JMenu("性能");
        JRadioButton zcd_xingneng_yiji=new JRadioButton("CPU一级性能");
        JRadioButton zcd_xingneng_erji=new JRadioButton("CPU二级性能");
        JRadioButton zcd_xingneng_sanji=new JRadioButton("CPU三级性能");
        JRadioButton zcd_xingneng_siji=new JRadioButton("CPU四级性能");
        JRadioButton zcd_xingneng_wuji=new JRadioButton("CPU性能全开");
        zcd_xingneng_xianka=new JCheckBoxMenuItem("GPU加成");
        ButtonGroup anz=new ButtonGroup();// 添加单选按钮组
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
        JMenuItem zcd_tuichu=new JMenuItem("退出");
        cd_caidan.add(zcd_xingneng);
        zcd_xingneng.add(zcd_xingneng_yiji);
        zcd_xingneng.add(zcd_xingneng_erji);
        zcd_xingneng.add(zcd_xingneng_sanji);
        zcd_xingneng.add(zcd_xingneng_siji);
        zcd_xingneng.add(zcd_xingneng_wuji);
        zcd_xingneng.add(zcd_xingneng_xianka);
        zcd_xingneng_xianka.addActionListener(new ActionListener() {// GPU模式
            public void actionPerformed(ActionEvent e) {
                new Menu_bar_event().GPU();
            }
        });
        cd_caidan.addSeparator();// 添加退出分割线
        cd_caidan.add(zcd_tuichu);
        // 退出事件
        zcd_tuichu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menu.cd_tuichu();
            }
        });

        JMenu cd_shezhi=new JMenu("菜单");
        JMenuItem zcd_moren=new JMenuItem("切换默认模式");
        JMenuItem zcd_Adobe=new JMenuItem("切换Adobe模式");
        JMenuItem zcd_Steam=new JMenuItem("√切换Steam模式");
        cd_shezhi.add(zcd_moren);
        zcd_moren.addActionListener(new ActionListener() {// 默认模式按钮
            public void actionPerformed(ActionEvent e) {
                if (zcd_moren.getText().equals("√切换默认模式")){
                    menu.zcd_moren();
                }else{
                    form.Steam_frame.setVisible(false);// steam窗口隐藏
                    Caidanlan.zcd_moren.setText("√切换默认模式");
                    Caidanlan.zcd_Steam.setText("切换Steam模式");
                    Main_package.Main_form.frame.setVisible(true);// 主窗口打开
                }
            }
        });
        cd_shezhi.add(zcd_Steam);
        zcd_Steam.addActionListener(new ActionListener() {// Steam模式按钮
            public void actionPerformed(ActionEvent e) {
                if (zcd_Steam.getText().equals("√切换Steam模式")){
                    menu.zcd_moren();
                }else{
                    Main_package.Main_form.frame.setVisible(false);// 主窗口隐藏
                    Caidanlan.zcd_moren.setText("切换默认模式");
                    Caidanlan.zcd_Steam.setText("√切换Steam模式");
                    form.Steam_frame.setVisible(true);// Steam窗口打开
                }
            }
        });
        cd_shezhi.add(zcd_Adobe);
        zcd_Adobe.addActionListener(new ActionListener() {// Adobe模式按钮
            public void actionPerformed(ActionEvent e) {
                menu.zcd_Adobe();
            }
        });
        menuBar.add(cd_fuwuqi);
        menuBar.add(cd_shezhi);
        menuBar.add(cd_caidan);
        JMenu cd_vip=new JMenu("VIP");
        menuBar.add(cd_vip);
        JMenuItem zcd_vip=new JMenuItem("选择VIP文件");
        cd_vip.add(zcd_vip);
        zcd_vip.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                menu.cd_vip();
            }
        });
        JMenu cd_bangzhu=new JMenu("帮助");
        JMenuItem zcd_guanyu=new JMenuItem("关于");
        cd_bangzhu.add(zcd_guanyu);
        zcd_guanyu.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                new Menu_bar_event().banben();
            }
        });
        menuBar.add(cd_bangzhu);
    }
}