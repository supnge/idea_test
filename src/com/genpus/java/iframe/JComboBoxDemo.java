package com.genpus.java.iframe;

import javax.swing.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

/**
 * @author supeng/ supeng87@126.com
 * @date 2019-04-14 15:43
 * @Modified By:
 * @Description:
 */
public class JComboBoxDemo {
    public static void main(String[] args) {
        JFrame frame=new JFrame("Java下拉列表组件示例");
        JPanel jp=new JPanel();    //创建面板
        JLabel label1=new JLabel("证件类型：");    //创建标签
        JComboBox cmb=new JComboBox();    //创建JComboBox
        cmb.addItem("--请选择--");    //向下拉列表中添加一项
        cmb.addItem("身份证");
        cmb.addItem("驾驶证");
        cmb.addItem("军官证");
        cmb.addItemListener(new ItemListener() {
            @Override
            public void itemStateChanged(ItemEvent e) {
                System.out.println(cmb.getSelectedItem());
            }
        });
        jp.add(label1);
        jp.add(cmb);
        frame.add(jp);
        frame.setBounds(300,200,400,100);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
