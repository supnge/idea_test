package com.genpus.java.iframe;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

/**
 * @author supeng/ supeng87@126.com
 * @date 2019-04-14 15:30
 * @Modified By:
 * @Description:
 */
public class JTextAreaDemo {

    public static void main(String[] args) {
        JFrame frame=new JFrame("Java文本域组件示例");    //创建Frame窗口
        JPanel jp=new JPanel();    //创建一个JPanel对象
        JTextArea jta=new JTextArea("请输入内容",10,30);
        jta.addMouseListener(new MouseListener() {
            @Override
            public void mouseClicked(MouseEvent e) {
                jta.setText("");
            }

            @Override
            public void mousePressed(MouseEvent e) {

            }

            @Override
            public void mouseReleased(MouseEvent e) {

            }

            @Override
            public void mouseEntered(MouseEvent e) {

            }

            @Override
            public void mouseExited(MouseEvent e) {

            }
        });
        jta.setLineWrap(true);    //设置文本域中的文本为自动换行
        jta.setForeground(Color.BLACK);    //设置组件的背景色
        jta.setFont(new Font("楷体",Font.BOLD,16));    //修改字体样式
        jta.setBackground(Color.YELLOW);    //设置按钮背景色
        JScrollPane jsp=new JScrollPane(jta);    //将文本域放入滚动窗口
        Dimension size=jta.getPreferredSize();    //获得文本域的首选大小
        jsp.setBounds(110,90,size.width,size.height);
        jp.add(jsp);    //将JScrollPane添加到JPanel容器中
        frame.add(jp);    //将JPanel容器添加到JFrame容器中
        frame.setBackground(Color.LIGHT_GRAY);
        frame.setSize(400,300);    //设置JFrame容器的大小
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
