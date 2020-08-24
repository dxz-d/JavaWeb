package com.kuang.listerner;

import java.awt.*;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

/**
 * @description  监听器GUI中理解
 * @author diaoxiuze
 * @date 2020/8/22 15:56n
 */
public class PanelTest {
    public static void main(String[] args) {
        // 新建一个窗体
        Frame frame = new Frame("国庆前入职！");
        // 面板
        Panel panel = new Panel(null);
        // 设置窗体的布局
        frame.setLayout(null);

        frame.setBounds(300, 300, 500, 500);
        // 设置背景颜色
        frame.setBackground(new Color(0, 0, 255));

        frame.setBounds(50, 50, 300, 300);
        // 设置背景颜色
        frame.setBackground(new Color(0, 255, 0));

        frame.add(panel);

        frame.setVisible(true);

        frame.addWindowListener(new WindowListener() {
            public void windowOpened(WindowEvent e) {
                System.out.println("打开");
            }

            public void windowClosing(WindowEvent e) {
                System.out.println("关闭ing");
                System.exit(1);
                /**
                 * System.exit(int status)这个方法是用来结束当前运行中的java虚拟机
                 * status是非零参数，那么标识是非正常退出
                 *
                 * System.exit(0)是正常退出程序，
                 * 而System.exit(1)或者非0标识非正常退出程序
                 */
            }

            public void windowClosed(WindowEvent e) {
                System.out.println("关闭ed");

            }

            public void windowIconified(WindowEvent e) {

            }

            public void windowDeiconified(WindowEvent e) {

            }

            public void windowActivated(WindowEvent e) {
                System.out.println("激活");
            }

            public void windowDeactivated(WindowEvent e) {
                System.out.println("未激活");
            }
        });
    }
}
