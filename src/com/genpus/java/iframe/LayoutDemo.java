package com.genpus.java.iframe;

import javax.swing.*;
import java.awt.*;

/**
 * @author supeng/ supeng@bonc.com.cn
 * @date 2019-04-12 16:33
 * @Modified By:
 * @Description:
 */
public class LayoutDemo {

    //边框布局管理器

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("hello layout");

        jFrame.setSize(800, 600);

        jFrame.setLayout(new BorderLayout());

        JButton button1 = new JButton("上");
        JButton button2 = new JButton("下");
        JButton button3 = new JButton("中");
        JButton button4 = new JButton("左");
        JButton button5 = new JButton("右");

        jFrame.add(button1, BorderLayout.NORTH);
        jFrame.add(button2, BorderLayout.SOUTH);
        jFrame.add(button3, BorderLayout.CENTER);
        jFrame.add(button4, BorderLayout.WEST);
        jFrame.add(button5, BorderLayout.EAST);

        jFrame.setBounds(300, 200, 300, 400);
        jFrame.setVisible(true);
        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }


}
