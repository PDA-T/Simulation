package VIP_Steam;

import Event_package.mysql;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Steam_jindutiao implements Runnable{
    public Steam_jindutiao() {
        VIP_Steam.Component.progressBar.setStringPainted(true);      // 描绘文字
    }
    public void run() {
        for(int i=0; i<100; i++) {
            try {
                VIP_Steam.Component.progressBar.setValue(VIP_Steam.Component.progressBar.getValue() + 1); // 随着线程进行，增加进度条值

                VIP_Steam.Component.progressBar.setString(VIP_Steam.Component.progressBar.getValue() + "%");
                Thread.sleep(Event_package.Jindutiao.yc);
                // 随机数强制退出
                Random s1 = new Random();
                if (s1.nextInt(500)==10) {
                    JOptionPane.showMessageDialog(null, "在计算过程中出现无法预知的错误 ! ! !", "错误", JOptionPane.ERROR_MESSAGE);
                    JOptionPane.showMessageDialog(null, "请尽快向客服反馈 ! ! !", "错误", JOptionPane.ERROR_MESSAGE);
                    System.exit(0);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        if(VIP_Steam.Component.progressBar.getValue()==100) {//最终判断
            Event_package.mysql sql=new Event_package.mysql();
            sql.mysql_genggai();// 修改账号密码
            JLabel bq=new JLabel("检测到您使用非法方式获得VIP,已注销账号");
            JButton an=new JButton("结束");
            JFrame ct=new JFrame("计算失败");
            ct.setDefaultCloseOperation(ct.EXIT_ON_CLOSE);
            ct.setLayout(new FlowLayout());
            ct.setSize(350, 80);
            ct.setLocationRelativeTo(null);
            ct.setVisible(true);
            ct.setResizable(false);
            ct.add(bq);
            ct.add(an);
            an.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    System.exit(0);// 强制退出软件
                }
            });
        }
    }
}