package com.company;

import javax.swing.*;
import javax.swing.border.TitledBorder;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MyGUI {

    int presetHeight = 500;
    int getPresetwidth = 500;


        // init stuff
        JFrame myFrame = new JFrame("My GUI");
        //buttons
        JButton okButton = new JButton();
        JButton button2 = new JButton("Cancel");
        JButton button3 = new JButton("Button 3");
        //panels
        JPanel panel1 = new JPanel();
        JPanel panel2 = new JPanel();


        public MyGUI() {}; // default constructor





        public void createGUI() {


            //okButton stuff
            okButton.setText("Okay");
            okButton.setToolTipText("This is the okay button: ");
            okButton.setSize(100, 100);

            //button2 stuff
            button2.setToolTipText("this is button2: ");
            button2.setSize(110,100);

            //button3 stuff
            button3.setToolTipText("this is button3: ");
            button3.setForeground(Color.red);

            //adding actionListeners
            GUIListener myListener = new GUIListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (e.getSource() == okButton){

                        System.out.println("okButton was pushed");
                    } else if (e.getSource() == button2) {

                        System.out.println("button2 was pushed");
                    } else if (e.getSource() == button3){

                        System.out.println("button3 was pushed");
                    }
                }
            };
            okButton.addActionListener(myListener);
            button2.addActionListener(myListener);
            button3.addActionListener(myListener);

        //set panels
            panel1.setBorder(new TitledBorder("Panel1 border"));
            panel1.setSize(100,50);

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


    public abstract class GUIListener implements ActionListener{




        public void actionPreformed(ActionEvent e) {

                if (e.getSource() == okButton){

                    System.out.println("okButton was pushed");
                } else if (e.getSource() == button2) {

                    System.out.println("button2 was pushed");
                } else if (e.getSource() == button3){

                    System.out.println("button3 was pushed");
                }
            }



    }


}
