package VIP_Steam;

import javax.swing.*;

public class form {
    public static JFrame Steam_frame = new JFrame();
    public void form(){
        Steam_frame.setSize(450, 300);
        Steam_frame.setTitle("Resilio sync");
        Steam_frame.setLocationRelativeTo(null);
        Steam_frame.setResizable(false);
        Steam_frame.getContentPane().setLayout(null);
        //主窗口图标
        ImageIcon tubiao=new ImageIcon(getClass().getResource("/image/chuangkou_tubiao.png"));
        Steam_frame.setIconImage(tubiao.getImage());
        new Steam_Caidanlan();// 添加菜单栏
        new Component();// 添加组件
    }
}
