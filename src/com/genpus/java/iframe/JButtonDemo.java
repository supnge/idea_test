package com.genpus.java.iframe;

import javax.swing.*;
import java.awt.*;

/**
 * @author supeng/ supeng87@126.com
 * @date 2019-04-14 15:10
 * @Modified By:
 * @Description:
 */
public class JButtonDemo {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("Button Demo");
        JPanel panel = new JPanel();
        JButton jButton1 = new JButton("Button1");
        JButton jButton2 = new JButton("Button2");
        JButton jButton3 = new JButton("Button3");
        JButton jButton4 = new JButton("Button4");

        panel.add(jButton1);
        jButton1.setBackground(Color.lightGray);

        jButton2.setPreferredSize(new Dimension(160, 60));
        jButton2.setVerticalAlignment(SwingConstants.BOTTOM);
        panel.add(jButton2);

        jButton3.setEnabled(false);
        panel.add(jButton3);


        jFrame.add(panel);
        jFrame.setSize(800, 600);
        jFrame.setBounds(300, 200, 600, 300);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);
    }
}
