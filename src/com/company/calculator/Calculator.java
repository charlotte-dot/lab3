package com.company.calculator;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator {
    private JFrame calculatorFrame;
    private JPanel calculatorPanel;
    private JLabel number1L;
    private JLabel number2L;
    private JTextField number1;
    private JTextField number2;
    private JButton addButton;
    private JButton substractionButton;
    private JTextField result;
    private JButton reset;
    public Calculator(){
        calculatorFrame=new JFrame("calculator");
        calculatorFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //create and set up the panel
        calculatorPanel=new JPanel((new GridLayout(4,2)));
        calculatorFrame.getContentPane().add(calculatorPanel,BorderLayout.CENTER);
        //display the window
        calculatorFrame.pack();
        calculatorFrame.setBounds(100,100,400,300);
        calculatorFrame.setVisible(true);
        addWidget();
    }
    private void addWidget(){
        number1=new JTextField("");
        number2=new JTextField("");
        number1L=new JLabel("Number 1");
        number2L=new JLabel("Number 2");
        result = new JTextField("");
        substractionButton = new JButton("-");
        addButton = new JButton("+");
        reset = new JButton("Reset");

        reset.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                number1.setText("");
                number2.setText("");
                result.setText("");
            }
        });
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double numberOne = Double.parseDouble(number1.getText());
                    double numberTwo = Double.parseDouble(number2.getText());

                    double sumN = numberOne + numberTwo;
                    result.setText("Sum is " + sumN);
                }
                catch (NumberFormatException ex){
                    result.setText("Not valid nr");
                }

            }
        });
        substractionButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double numberOne = Double.parseDouble(number1.getText());
                    double numberTwo = Double.parseDouble(number2.getText());

                    double substr = numberOne - numberTwo;
                    result.setText("Substraction is " + substr);
                } catch (NumberFormatException exception) {
                    result.setText("Not valid nr");
                }
            }
        });
        calculatorPanel.add(number1L);
        calculatorPanel.add(number2L);
        calculatorPanel.add(number1);
        calculatorPanel.add(number2);
        calculatorPanel.add(addButton);
        calculatorPanel.add(substractionButton);
        calculatorPanel.add(result);
        calculatorPanel.add(reset);
        addButton.setBackground(Color.yellow);

    }


}
