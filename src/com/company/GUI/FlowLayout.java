package com.company.GUI;

import javax.swing.*;

public class FlowLayout {
    private JFrame theFrame = new JFrame("Grid Layout");
    private JButton[] buttons= {
            new JButton("Button1"),
            new JButton("Button1"),
            new JButton("Button2"),
            new JButton("Button3"),
            new JButton("Button4"),
            new JButton("Button5"),
            new JButton("Button6"),
            new JButton("Button7")

    };
    public void show() {
        theFrame.setLayout(new java.awt.FlowLayout());
        for(int i=0; i<buttons.length;i++){
            theFrame.add(buttons[i]);
        }
        theFrame.pack();
        theFrame.setVisible(true);
    }
}
