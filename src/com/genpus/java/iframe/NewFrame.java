package com.genpus.java.iframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.URL;

/**
 * @author supeng/ supeng@bonc.com.cn
 * @date 2019-04-12 10:01
 * @Modified By:
 * @Description:
 */
public class NewFrame extends JDialog{

    public NewFrame() {

        JFrame jFrame = new JFrame(" Start!");

        jFrame.setSize(800,600);

        JLabel jLabel = new JLabel("请正常导入文件");

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

        Font font = new Font("微软雅黑", Font.PLAIN, 30);

        jLabel.setFont(font);

        jLabel.setSize(30, 20);

        jLabel.setHorizontalAlignment(SwingConstants.CENTER);

        jFrame.add(jLabel);

        jFrame.setVisible(true);

        Container container = jFrame.getContentPane();

        container.setBackground(Color.lightGray);

        container.add(this.attentionButton());



    }

    // 按钮
    public JButton attentionButton(){
        JButton jButton = new JButton("点击弹出对话框");

        jButton.setBounds(50,50, 200, 80);

        jButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                new JDialogDemo().setVisible(true);
            }
        });

        return jButton;

    }


    public static void main(String[] args) {
        new NewFrame();
    }
}

class JDialogDemo extends JDialog {
    public JDialogDemo(){
        super(new JFrame(), "dialog demo!!!", true);
        Container container = this.getContentPane();
        JLabel label = new JLabel("hello button event !!!");
        URL url = JDialogDemo.class.getResource("../someFiles/pic.jpg");
        Icon icon = new ImageIcon(url);
        label.setIcon(icon);
        container.add(label);
        this.setSize(200, 120);

    }
}
