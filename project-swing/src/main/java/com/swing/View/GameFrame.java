package com.swing.View;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame {

    JFrame gameFrame = new JFrame();
    Container container;
    JPanel titleNamePanel, startButtunPanel, mainTextPanel, choiceButtonpanel, playerPanel;
    JLabel titleNameLabel, hpLabel, hpLabelNumber, weponlabel, weponlabelName;
    JTextArea mainTextArea;
    Font titleFont = new Font("Time New Roma", Font.PLAIN, 40);
    Font ButtonFont = new Font("Time New Roma", Font.PLAIN, 20);
    JButton leftbotton, rightbotton, upbotton, downbotton;
    TittleScreenHander tittleScreenHander = new TittleScreenHander();
    Tittle Tittle = new Tittle();







    public void createGameFrame() {
        gameFrame.setSize(800, 600);
        gameFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        gameFrame.getContentPane().setBackground(Color.black);
        gameFrame.setLayout(null);
        gameFrame.setVisible(true);
        container = gameFrame.getContentPane();


        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 100);
        titleNamePanel.setBackground(Color.black);
        container.add(titleNamePanel);

        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.black);
        container.add(mainTextPanel);


        mainTextArea = new JTextArea("");
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(ButtonFont);
        mainTextArea.setLineWrap(true);
        mainTextPanel.add(mainTextArea);



        choiceButtonpanel = new JPanel();
        choiceButtonpanel.setBounds(250, 350, 300, 150);
        choiceButtonpanel.setBackground(Color.black);
        choiceButtonpanel.setLayout(new GridLayout(4, 1));
        container.add(choiceButtonpanel);

        leftbotton = new JButton("left");
        leftbotton.setBackground(Color.black);
        leftbotton.setForeground(Color.black);
        leftbotton.setFont(ButtonFont);
        leftbotton.setFocusPainted(false);
        choiceButtonpanel.add(leftbotton);


        rightbotton = new JButton("Right");
        rightbotton.setBackground(Color.black);
        rightbotton.setForeground(Color.black);
        rightbotton.setFont(ButtonFont);
        choiceButtonpanel.add(rightbotton);

        upbotton = new JButton("up");
        upbotton.setBackground(Color.black);
        upbotton.setForeground(Color.black);
        upbotton.setFont(ButtonFont);
        upbotton.setFocusPainted(false);
        upbotton.addActionListener(tittleScreenHander);
        choiceButtonpanel.add(upbotton);


        downbotton = new JButton("down");
        downbotton.setBackground(Color.black);
        downbotton.setForeground(Color.black);
        downbotton.setFont(ButtonFont);
        downbotton.setFocusPainted(false);
        downbotton.addActionListener(Tittle);
        choiceButtonpanel.add(downbotton);


    }


    public void printNow(){
        String jam = "i am";
        mainTextArea.setText(jam);

    }

    public void printNowthis(){
        String jam = "i am jam";
        mainTextArea.setText(jam);

    }



    public class TittleScreenHander implements ActionListener {


        public void actionPerformed(ActionEvent event) {


            printNow();


        }
    }

    public class Tittle implements ActionListener {


        public void actionPerformed(ActionEvent event) {

            mainTextArea.append(" johnson");


        }
    }
}
