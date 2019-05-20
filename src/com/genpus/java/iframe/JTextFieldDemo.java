package com.genpus.java.iframe;

import javax.swing.*;
import java.awt.*;

/**
 * @author supeng/ supeng87@126.com
 * @date 2019-04-14 15:23
 * @Modified By:
 * @Description:
 */
public class JTextFieldDemo {

    public static void main(String[] args) {
        JFrame jFrame = new JFrame("JTextFieldDemo");

        JPanel jPanel = new JPanel();
        JTextField jTextField = new JTextField();

        jTextField.setText("普通文本");
        jPanel.add(jTextField);

        JTextField txtfield2=new JTextField(28);
        txtfield2.setFont(new Font("楷体",Font.BOLD,16));    //修改字体样式
        txtfield2.setText("指定长度和字体的文本框");
        jPanel.add(txtfield2);

        JTextField txtfield3=new JTextField(200);
        txtfield3.setText("居中对齐");
        txtfield3.setHorizontalAlignment(JTextField.CENTER);    //居中对齐
        jPanel.add(txtfield3);

        jFrame.add(jPanel);
        jFrame.setBounds(300, 200, 300, 200);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setVisible(true);


    }
}
