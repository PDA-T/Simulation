package VIP_Steam;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Component {
    public static JProgressBar progressBar = new JProgressBar(0,100);// ������
    int huakuai_value;// �����ֵ
    public Component(){
        form f=new form();
        //��ӻ���
        JSlider huakuai=new JSlider(0,100);
        huakuai.setBounds(66,10,300,50);
        huakuai.setMajorTickSpacing(10);//  �˷����������̶ȱ�ǵļ��
        huakuai.setMinorTickSpacing(5);//  ���ôο̶ȱ�ǵļ��
        huakuai.setPaintLabels(true);// �ڻ����ϻ��Ʊ�ǩ
        huakuai.setPaintTicks(true);// �ڻ����ϻ��ƿ̶ȱ��
        f.Steam_frame.getContentPane().add(huakuai);
        // ��Ӱ�ť
        JButton an_huakuai=new JButton("ȷ��");
        an_huakuai.setBounds(178,178,80,25);
        f.Steam_frame.getContentPane().add(an_huakuai);
        an_huakuai.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                huakuai_value=huakuai.getValue();
                if (huakuai_value<5){
                    JOptionPane.showMessageDialog(null, "��ѡ�����5��ֵ", "��ʾ",JOptionPane.INFORMATION_MESSAGE);
                }else{
                    if (Event_package.mysql.State.equals("NO")){
                        JOptionPane.showMessageDialog(null, "�㷨������ȫ������ά���� !", "ά������",JOptionPane.INFORMATION_MESSAGE);
                    }else{
                        Event_package.Menu_bar_event menu=new Event_package.Menu_bar_event();
                        menu.anz_Steam_dengji();
                    }
                }
            }
        });
        // ��ӽ�����
        progressBar.setBounds(123, 115, 193, 13);
        f.Steam_frame.getContentPane().add(progressBar);
    }
}
