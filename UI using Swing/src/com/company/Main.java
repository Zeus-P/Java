package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main {

    public static void main(String[] args) {
        Frame f = new Frame("My Frame");

        f.setSize(300,300);
        f.setVisible(true);
        f.setLayout(new FlowLayout(FlowLayout.CENTER));
        JTextField tf1= new JTextField(20);
        JTextField tf2 = new JTextField(20);
        f.add(tf1);
        f.add(tf2);
        JButton b = new JButton("Copy");
        f.add(b);
        b.addActionListener(new ActionListener() {
               public void actionPerformed(ActionEvent ae)
               {
                   String str = tf1.getText().toString();
                   tf2.setText(str);
               }
        });

    }
}
