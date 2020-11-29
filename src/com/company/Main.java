package com.company;
import javax.swing.*;
import java.awt.*;
import java.sql.ClientInfoStatus;

public class Main {
    public static void main(String[] args) {


        JFrame frame = new JFrame("Gui Components");
        frame.setLayout(new GridLayout(2,2));

        JButton button = new JButton("Click me");

        JTextField tf = new JTextField("edit this");

        JPanel panel=new JPanel();
        JRadioButton rb1 = new JRadioButton("First",true);
        JRadioButton rb2 = new JRadioButton("Second");
        JRadioButton rb3 = new JRadioButton("Third");

       ButtonGroup group=new ButtonGroup();
       group.add(rb1);
       group.add(rb2);
       group.add(rb3);

       panel.setLayout(new GridLayout(3,1));
       panel.add(rb1);
       panel.add(rb2);
       panel.add(rb3);

       String [] labels={"Fred", "Jim", "John"};
       JList list = new JList<>(labels);
       frame.add(button);
       frame.add(tf);
       frame.add(panel);
       frame.add(list);


        frame.setVisible(true);
        frame.setBounds(30,30,300,300);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);

    }
}
