package com.company.Lab3;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CelsiusFHConverter {
    private JFrame converterFrame;
    private JPanel converterPanel;
    private JLabel number1L;
    private JTextField number1;
    private JButton fToC;
    private JButton cToF;
    private JTextField result;
    private JButton reset;

    public CelsiusFHConverter() {
        converterFrame = new JFrame("converter");
        converterFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //create and set up the panel
        converterPanel = new JPanel((new GridLayout(4, 2)));
        converterFrame.getContentPane().add(converterPanel, BorderLayout.CENTER);
        //display the window
        converterFrame.pack();
        converterFrame.setBounds(100, 100, 400, 300);
        converterFrame.setVisible(true);
        addWidget();
    }

    private void addWidget() {
        number1 = new JTextField("");
        number1L = new JLabel("Temperature");
        result = new JTextField("");
        cToF = new JButton("C to F");
        fToC = new JButton("F to C");
        reset = new JButton("Reset");

        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1.setText("");
                result.setText("");
            }
        });
        fToC.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double numberOne = Double.parseDouble(number1.getText());
                    double sumN = ((numberOne - 30) / 2);
                    result.setText(sumN + " Celsius degree");
                } catch (NumberFormatException ex) {
                    result.setText("Not valid nr");
                }

            }
        });
        cToF.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double numberOne = Double.parseDouble(number1.getText());
                    double substr = ((numberOne * 1.8) + 32);
                    result.setText(substr + " Fahrenheit degree");
                } catch (NumberFormatException exception) {
                    result.setText("Not valid nr");
                }
            }
        });
        converterPanel.add(number1L);
        converterPanel.add(number1);
        converterPanel.add(fToC);
        converterPanel.add(cToF);
        converterPanel.add(result);
        converterPanel.add(reset);
        fToC.setBackground(Color.yellow);
        cToF.setBackground(Color.red);

    }
}
