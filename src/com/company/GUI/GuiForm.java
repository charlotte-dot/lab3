package com.company.GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiForm extends JFrame{
    private JPanel button1;
    private JButton clickButton;
    private JPanel myPanel;

    public GuiForm() {
        add(myPanel);
        setTitle("This is title");
        setBounds(20,30,400,500);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        clickButton.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(myPanel,"Hello world");

            }
        });
    }
}
