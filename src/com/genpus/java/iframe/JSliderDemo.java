package com.genpus.java.iframe;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

/**
 * @author supeng/ supeng87@126.com
 * @date 2019-04-14 17:21
 * @Modified By:
 * @Description:
 */
public class JSliderDemo {
    JSlider slider=new JSlider(0,100);
    JLabel jLabel = new JLabel("hello");
    public JSliderDemo() {
        JFrame frame=new JFrame("滑块组件示例");
        frame.setSize(800,600);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        Container contentPane=frame.getContentPane();
        slider.setMajorTickSpacing(10);
        slider.setMinorTickSpacing(5);
        slider.setPaintLabels(true);
        slider.setPaintTicks(true);
        contentPane.add(slider);

        contentPane.add(jLabel,BorderLayout.SOUTH);
        slider.addChangeListener(new MyListener());


        frame.setVisible(true);
    }

    public static void main(String[] agrs)
    {
        new JSliderDemo();
    }

    class MyListener implements ChangeListener{

        @Override
        public void stateChanged(ChangeEvent e) {
            jLabel.setText(String.valueOf(slider.getValue()));
        }
    }

}
