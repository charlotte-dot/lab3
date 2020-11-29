package com.company.GUI;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                GuiForm form= new GuiForm() ;
                form.setVisible(true);

            }
        });
        // new FlowLayout().show();
       // new BorderLayout().show();
    }
}
