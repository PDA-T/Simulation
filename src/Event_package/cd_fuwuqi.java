package Event_package;

import Main_package.Caidanlan;

import javax.swing.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Random;

public class cd_fuwuqi implements Runnable{
	static boolean bo=false;// 切换服务器更新
	JProgressBar progress;// 创建进度条
	JFrame jf = new JFrame();
	public cd_fuwuqi() {
		progress = new JProgressBar(0, 100);
		progress.setStringPainted(true);      // 描绘文字
		jf.add(progress);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jf.setSize(268, 44);// 导出exe长度用44,测试使用55
		jf.setTitle("正在切换服务器");
		jf.setLocationRelativeTo(null);
		jf.setVisible(true);
		jf.setResizable(false);
		jf.addWindowListener(new WindowAdapter() {// 窗口关闭事件
			public void windowClosing(WindowEvent e) {
				JOptionPane.showMessageDialog(null, "切换被中断 !", "错误", JOptionPane.ERROR_MESSAGE);
			}
		});
	}
	public void run() {
		for(int i=0; i<100; i++) {// 一层循环
            try {
                progress.setValue(progress.getValue() + 1); // 随着线程进行，增加进度条值

                progress.setString(progress.getValue() + "%");
                Random s = new Random();
                int sj=s.nextInt(300);
                Thread.sleep(sj);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
         }
		JOptionPane.showMessageDialog(null, "切换完成", "提示",JOptionPane.INFORMATION_MESSAGE);
		jf.setVisible(false);// 隐藏切换窗口
		bo=true;// 切换服务器后更新
		Main_package.Main_form.frame.setVisible(true);// 打开主窗口
		Caidanlan.zcd_moren.setText("√切换默认模式");
		Caidanlan.zcd_Steam.setText("切换Steam模式");
	}
}
