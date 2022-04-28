package VIP_Steam;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Component {
    public static JProgressBar progressBar = new JProgressBar(0,100);// 进度条
    int huakuai_value;// 滑块的值
    public Component(){
        form f=new form();
        //添加滑块
        JSlider huakuai=new JSlider(0,100);
        huakuai.setBounds(66,10,300,50);
        huakuai.setMajorTickSpacing(10);//  此方法设置主刻度标记的间隔
        huakuai.setMinorTickSpacing(5);//  设置次刻度标记的间隔
        huakuai.setPaintLabels(true);// 在滑块上绘制标签
        huakuai.setPaintTicks(true);// 在滑块上绘制刻度标记
        f.Steam_frame.getContentPane().add(huakuai);
        // 添加按钮
        JButton an_huakuai=new JButton("确定");
        an_huakuai.setBounds(178,178,80,25);
        f.Steam_frame.getContentPane().add(an_huakuai);
        an_huakuai.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                huakuai_value=huakuai.getValue();
                if (huakuai_value<5){
                    JOptionPane.showMessageDialog(null, "请选择大于5的值", "提示",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    if (Event_package.mysql.State.equals("NO")){
                        JOptionPane.showMessageDialog(null, "算法服务器全面升级维护中 !", "维护升级",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        Event_package.Menu_bar_event menu=new Event_package.Menu_bar_event();
                        menu.anz_Steam_dengji();
                    }
                }
            }
        });
        // 添加进度条
        progressBar.setBounds(123, 115, 193, 13);
        f.Steam_frame.getContentPane().add(progressBar);
    }
}
