package com.company;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;

public class GUIpreset {


    public static void main(String[] args) {

        JFrame myFrame = new JFrame("My GUI");


        //set buttons
        JButton okButton = new JButton();
        okButton.setText("Okay");
        okButton.setToolTipText("This is the okay button: ");
        okButton.setSize(100, 100);

        JButton button2 = new JButton("Cancel");
        button2.setToolTipText("this is button2: ");
        button2.setSize(110,100);

        JButton button3 = new JButton("Button 3");
        button3.setToolTipText("this is button3: ");
        button3.setForeground(Color.red);


        //set panels
        JPanel panel1 = new JPanel();
        panel1.setBorder(new TitledBorder("Panel1 border"));
        panel1.setSize(100,50);

        JPanel panel2 = new JPanel();
        panel2.setBorder(new TitledBorder("Panel2 border"));
        panel2.setLayout(new GridLayout(2,2));



        //add components to panel1
        panel1.add(okButton);
        panel1.add(button2);

        //add components to panel2
        panel2.add(button3);


        //add components to myFrame
        myFrame.add(panel1);
        myFrame.add(panel2);





        myFrame.setSize(600,400);
        myFrame.setLocationRelativeTo(null);
        myFrame.setLayout(new GridLayout(2,5));
        myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        myFrame.setVisible(true);


    }



}
