package com.company;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;
import javax.swing.*;

public class PanelPreset implements ActionListener{

    public int numClicks = 0;
    Button b1;

    public static void main(String[] args) {
        PanelPreset myWindow = new PanelPreset("My first window");

    }

    public  PanelPreset(String title) {
        //init
        JFrame f= new JFrame(title);
            JPanel panel=new JPanel();
            panel.setBounds(40,80,400,400);
            panel.setBackground(Color.gray);
        f.add(panel);
        f.setSize(1000,1000);
        f.setLayout(null);


        //init Button1 b1
            b1 = new Button("Click me");
            b1.setLabel("Click me");
            b1.setBounds(30,100,80,30);
            b1.setBackground(Color.yellow);

        //init Button2 b2
            JButton b2=new JButton("Button 2");
            b2.setBounds(120,100,80,30);
            b2.setBackground(Color.green);
            b2.addActionListener(this::actionPerformed);
        //init textField1
            JTextField textField1 = new JTextField(60);


        JMenu menu = new JMenu();
        JMenuBar bar = new JMenuBar();
        menu.add(bar);
        menu.setBounds(200,350,150,50);
        panel.add(textField1);
        panel.add(menu);
        panel.add(b1); panel.add(b2);
        menu.setPopupMenuVisible(true);



        boolean keepGoing = true;
        while(keepGoing){
            textField1.addActionListener(this);
                if (numClicks >= 10) {
                    keepGoing = false;
                }
        }


    }




    public void actionPerformed(ActionEvent e) {
        numClicks++;
        System.out.println("number of clicks = "+ numClicks);


    }


    private void startButton1() {
        JButton b1=new JButton("Button 1");
        b1.setBounds(50,100,80,30);
        b1.setBackground(Color.yellow);

    }

    private String getInput(String enter_input) {
        System.out.println(enter_input);
        Scanner scanner = new Scanner(System.in);
        String input = scanner.next();
        return input;


    }


}