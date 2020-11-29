package com.company.GUI;

import javax.swing.*;

public class BorderLayout {
    private JFrame theFrame = new JFrame("Border Layout");
    private JButton northButton = new JButton("North");
    private JButton southButton = new JButton("South");
    private JButton eastButton = new JButton("East");
    private JButton westButton = new JButton("West");
    private JButton centerButton = new JButton("Center");

    public void show(){
        theFrame.add(northButton, java.awt.BorderLayout.NORTH);
        theFrame.add(southButton, java.awt.BorderLayout.SOUTH);
        theFrame.add(eastButton, java.awt.BorderLayout.EAST);
        theFrame.add(westButton, java.awt.BorderLayout.WEST);
        theFrame.add(centerButton, java.awt.BorderLayout.CENTER);


    }

}
