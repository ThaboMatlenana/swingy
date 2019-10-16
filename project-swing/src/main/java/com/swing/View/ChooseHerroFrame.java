package com.swing.View;

import com.swing.Model.HerroMaker;
import com.swing.Model.Herros;
import com.swing.Model.IVillen;
import com.swing.Model.VillenMaker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Random;


public class ChooseHerroFrame {

    public static void main(String[] args) throws IOException {

        new ChooseHerroFrame();


    }


    int score = 0;
    Herros herro = HerroMaker.HerroMaker("1");
    int portionPower = 50;
    int Numportion = 3;
    int runningTries = 3;
    int herroPower = herro.getHerroPower();
    int herroHP = herro.getHerroHP();
    int herroDefense = herro.getDefense();
    int herroExpiriance = herro.getHerroAttack();
    int herroWeapon = herro.getWeapon();
    int herroAmor = herro.getHerroAmor();
    int herroHelm = herro.getHerroHelm();
    int villenAttack = 20;
    int villenHP = 20;
    int HerroLifes = 3;
    int NumVillen = 2;
    int level = 1;
    int fightRun = 0;
    int move = 0;
    int continueVarable = 1;
    String payerName;
    String Line;
    BufferedReader reader;
    String playerStatistics;
    String jay;
    String splited[];


    private static JFrame chooseHerro;
    private static Container container;
    private static JPanel titleNamePanel, herroButtunPanel, mainTextPanel, choiceButtonpanel, herroStatsPanel, EnterNamePanel, startButtonPanel;
    private static JLabel titleNameLabel, playerHpLabel, playerScoreLabel, playerLevelLabel, playerWeponLebel;
    private static JTextArea mainTextArea, playerHp, playerScore, playerLevel, playerWepon;
    private static Font titleFont = new Font("Time New Roma", Font.PLAIN, 40);
    private static Font ButtonFont = new Font("Time New Roma", Font.PLAIN, 20);
    private static Font statsFont = new Font("Time New Roma", Font.PLAIN, 15);
    private static JButton Hulk, captainAmerica, rightbotton, upbotton, downbotton, leftbotton, StartButton, fightButton, runButton, continueButton, saveButton, testButton;
    HerroScreenHandler tittleScreenHander = new HerroScreenHandler();
    JTextField text, errorMessege;
    RightMovement rightMovement = new RightMovement();
    UpMovement upMovement = new UpMovement();
    LeftMovement leftMovement = new LeftMovement();
    StartGame startGame = new StartGame();
    EnterName enterName = new EnterName();
    DownMovement downMovement = new DownMovement();
    RunningMovement runningMovement = new RunningMovement();
    FightingMovement fightingMovement = new FightingMovement();
    ContinueMovement continueMovement = new ContinueMovement();
    TestMovement testMovement = new TestMovement();
    SaveName saveName = new SaveName();
    Saving saving = new Saving();
    //SaveNameContinue saveNameContinue = new SaveNameContinue();

    int villenHealth;


    Random random = new Random();
    int i = random.nextInt(15);
    IVillen villen = createVillen();
    ArrayList<Object> playerStats = new ArrayList<Object>();
    ArrayList<String> playerNames = new ArrayList<String>();


    public void ChooseHerroFrame() {

        //  payerName = text.getText();
        //  dataBase();


//        chooseHerro = new JFrame();
//        chooseHerro.setSize(800, 600);
//        chooseHerro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//        chooseHerro.getContentPane().setBackground(Color.black);
//        chooseHerro.setLayout(null);
//        chooseHerro.setVisible(true);
//        container = chooseHerro.getContentPane();



        EnterNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);
        startButtonPanel.setVisible(false);
        titleNamePanel = new JPanel();
        titleNamePanel.setBounds(100, 100, 600, 100);
        titleNamePanel.setBackground(Color.black);


        titleNameLabel = new JLabel("Hello "+ payerName + " choose a herro");
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);
        titleNamePanel.add(titleNameLabel);
        titleNamePanel.setVisible(true);


        herroButtunPanel = new JPanel();
        herroButtunPanel.setBounds(300, 400, 200, 100);
        herroButtunPanel.setBackground(Color.black);
        herroButtunPanel.setVisible(true);

        Hulk = new JButton("HULK");
        Hulk.setBackground(Color.black);
        Hulk.setForeground(Color.black);
        Hulk.setFont(ButtonFont);
        Hulk.addActionListener(tittleScreenHander);
        herroButtunPanel.add(Hulk);


        captainAmerica = new JButton("CAPTAIN AMERICA");
        captainAmerica.setBackground(Color.black);
        captainAmerica.setForeground(Color.black);
        captainAmerica.setFont(ButtonFont);

        herroButtunPanel.add(captainAmerica);


        container.add(titleNamePanel);
        container.add(herroButtunPanel);


    }

    public void enterName() {


//        herroStatsPanel.setVisible(false);
//        mainTextPanel.setVisible(false);
        startButtonPanel.setVisible(false);


        EnterNamePanel = new JPanel();
        EnterNamePanel.setBounds(100, 100, 600, 250);
        EnterNamePanel.setBackground(Color.black);
        container.add(EnterNamePanel);


        text = new JTextField();
        text.setBounds(100, 100, 600, 400);
        text.setText("enter your name here");
        text.setBackground(Color.white);
        text.setForeground(Color.black);
        text.setFont(ButtonFont);
        EnterNamePanel.add(text);


        errorMessege = new JTextField();
        errorMessege.setBounds(200, 200, 600, 400);
        errorMessege.setText("mow this is me");
        errorMessege.setBackground(Color.white);
        errorMessege.setForeground(Color.black);
        errorMessege.setFont(ButtonFont);
        EnterNamePanel.add(errorMessege);


        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(250, 350, 300, 150);
        startButtonPanel.setBackground(Color.black);
        startButtonPanel.setLayout(new GridLayout(4, 1));
        container.add(startButtonPanel);


        StartButton = new JButton("Start Game");
        StartButton.setBackground(Color.black);
        StartButton.setForeground(Color.white);
        StartButton.setFont(ButtonFont);
        StartButton.addActionListener(saveName);
        startButtonPanel.add(StartButton);


//
//        JButton newButton = new JButton("New Game");
//        newButton.setBackground(Color.black);
//        newButton.setForeground(Color.white);
//        newButton.addActionListener(startGame);
//        newButton.setFont(ButtonFont);
//
//        startButtonPanel.add(newButton);


    }

    public ChooseHerroFrame() {



        chooseHerro = new JFrame();
        chooseHerro.setSize(800, 600);
        chooseHerro.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        chooseHerro.getContentPane().setBackground(Color.black);
        chooseHerro.setLayout(null);
        chooseHerro.setVisible(true);
        container = chooseHerro.getContentPane();


//        herroStatsPanel = new JPanel();
//        herroStatsPanel.setBounds(100, 10, 600, 50);
//        herroStatsPanel.setBackground(Color.black);
//        container.add(herroStatsPanel);
//
//
//        playerHpLabel = new JLabel("PlayerHP");
//        playerHpLabel.setBounds(100, 25, 50, 50);
//        playerHpLabel.setBackground(Color.black);
//        playerHpLabel.setForeground(Color.white);
//        playerHpLabel.setFont(statsFont);
//        herroStatsPanel.add(playerHpLabel);
//
//        playerHp = new JTextArea("");
//        playerHp.setBounds(100, 50, 50, 50);
//        playerHp.setBackground(Color.black);
//        playerHp.setForeground(Color.white);
//        playerHp.setFont(statsFont);
//        playerHp.setText("" + herro.getHerroHP());
//        herroStatsPanel.add(playerHp);
//
//
//        playerLevelLabel = new JLabel("PlayerLevel");
//        playerLevelLabel.setBounds(100, 25, 50, 50);
//        playerLevelLabel.setBackground(Color.black);
//        playerLevelLabel.setForeground(Color.white);
//        playerLevelLabel.setFont(statsFont);
//        herroStatsPanel.add(playerLevelLabel);
//
//        playerLevel = new JTextArea("");
//        playerLevel.setBounds(100, 50, 50, 50);
//        playerLevel.setBackground(Color.black);
//        playerLevel.setForeground(Color.white);
//        playerLevel.setFont(statsFont);
//        playerLevel.setText("" + level);
//        herroStatsPanel.add(playerLevel);
//
//
//        playerScoreLabel = new JLabel("PlayerScore");
//        playerScoreLabel.setBounds(100, 25, 50, 50);
//        playerScoreLabel.setBackground(Color.black);
//        playerScoreLabel.setForeground(Color.white);
//        playerScoreLabel.setFont(statsFont);
//        herroStatsPanel.add(playerScoreLabel);
//
//        playerScore = new JTextArea("");
//        playerScore.setBounds(100, 50, 50, 50);
//        playerScore.setBackground(Color.black);
//        playerScore.setForeground(Color.white);
//        playerScore.setFont(statsFont);
//        playerScore.setText("" + score);
//        herroStatsPanel.add(playerScore);
//
//
//
//
//
//        mainTextPanel = new JPanel();
//        mainTextPanel.setBounds(100, 100, 600, 250);
//        mainTextPanel.setBackground(Color.black);
//        container.add(mainTextPanel);
//
//
//        mainTextArea = new JTextArea("");
//        mainTextArea.setBounds(100, 100, 600, 400);
//        mainTextArea.setBackground(Color.black);
//        mainTextArea.setForeground(Color.white);
//        mainTextArea.setFont(ButtonFont);
//        mainTextArea.setVisible(false);
//        mainTextArea.setLineWrap(true);
//        mainTextPanel.add(mainTextArea);
//

//        JTextField text = new JTextField();
//        text.setBounds(100,100,600,400);
//        text.setText("enter your name here");
//        text.setBackground(Color.white);
//        text.setForeground(Color.black);
//        text.setFont(ButtonFont);
//        mainTextPanel.add(text);


        startButtonPanel = new JPanel();
        startButtonPanel.setBounds(250, 350, 300, 150);
        startButtonPanel.setBackground(Color.black);
        startButtonPanel.setLayout(new GridLayout(4, 1));
        container.add(startButtonPanel);


//        saveButton = new JButton("Save");
//        saveButton.setBackground(Color.black);
//        saveButton.setForeground(Color.white);
//        saveButton.setFont(ButtonFont);
//        saveButton.addActionListener(saving);
//        startButtonPanel.add(saveButton);

        testButton = new JButton("Continue");
        testButton.setBackground(Color.black);
        testButton.setForeground(Color.white);
        testButton.setFont(ButtonFont);
        testButton.addActionListener(enterName);
        startButtonPanel.add(testButton);

        JButton newButton = new JButton("New Game");
        newButton.setBackground(Color.black);
        newButton.setForeground(Color.white);
        newButton.addActionListener(enterName);
        newButton.setFont(ButtonFont);

        startButtonPanel.add(newButton);



    }

    public class HerroScreenHandler implements ActionListener {



        public void actionPerformed(ActionEvent event) {


            createGameFrameNewGame();


        }
    }


    public class SaveName implements ActionListener {


        public void actionPerformed(ActionEvent event) {


            //  "/goinfre/jdubula//Desktop/Swingy/"+ payerName+ ".txt"
            try {
                reader = new BufferedReader(new FileReader("/goinfre/jdubula//Desktop/Swingy/" + "names" + ".txt"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }

            Game:
            while (true) {
                try {
                    if (!((Line = reader.readLine()) != null)) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }

                String splited[] = Line.split(" ");


//                int i = 0;
//                while (i < splited.length) {
//                    playerNames.add(splited[i]);
//                    i++;
//                }


                if (playerNames.contains(text.getText())) {
                    errorMessege.setText("the name is contained");
                    payerName = text.getText();
                    createGameFrameContinue();
                    theLoadingValueFuction();
                } else {
                    errorMessege.setText("the name is not contained");
                    payerName = text.getText();
                    playerStatistics = herroHP + " " + level + " " + score;
                    playerNames.add(text.getText());
                    theSavingFuction();
                    dataBase();
                    ChooseHerroFrame();
                    break Game;

                }

            }


        }


    }




    public class StartGame implements ActionListener {


        public void actionPerformed(ActionEvent event) {


            ChooseHerroFrame();


        }
    }

    public class EnterName implements ActionListener {


        public void actionPerformed(ActionEvent event) {

            enterName();

        }
    }

    public void createGameFrameContinue() {

//         herroButtunPanel.setVisible(false);
//            titleNamePanel.setVisible(false);

        EnterNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);

        herroStatsPanel = new JPanel();
        herroStatsPanel.setBounds(100, 10, 600, 50);
        herroStatsPanel.setBackground(Color.black);
        container.add(herroStatsPanel);


        playerHpLabel = new JLabel("PlayerHP");
        playerHpLabel.setBounds(100, 25, 50, 50);
        playerHpLabel.setBackground(Color.black);
        playerHpLabel.setForeground(Color.white);
        playerHpLabel.setFont(statsFont);
        herroStatsPanel.add(playerHpLabel);

        playerHp = new JTextArea("");
        playerHp.setBounds(100, 50, 50, 50);
        playerHp.setBackground(Color.black);
        playerHp.setForeground(Color.white);
        playerHp.setFont(statsFont);
        playerHp.setText("" + herro.getHerroHP());
        herroStatsPanel.add(playerHp);


        playerLevelLabel = new JLabel("PlayerLevel");
        playerLevelLabel.setBounds(100, 25, 50, 50);
        playerLevelLabel.setBackground(Color.black);
        playerLevelLabel.setForeground(Color.white);
        playerLevelLabel.setFont(statsFont);
        herroStatsPanel.add(playerLevelLabel);

        playerLevel = new JTextArea("");
        playerLevel.setBounds(100, 50, 50, 50);
        playerLevel.setBackground(Color.black);
        playerLevel.setForeground(Color.white);
        playerLevel.setFont(statsFont);
        playerLevel.setText("" + level);
        herroStatsPanel.add(playerLevel);


        playerScoreLabel = new JLabel("PlayerScore");
        playerScoreLabel.setBounds(100, 25, 50, 50);
        playerScoreLabel.setBackground(Color.black);
        playerScoreLabel.setForeground(Color.white);
        playerScoreLabel.setFont(statsFont);
        herroStatsPanel.add(playerScoreLabel);

        playerScore = new JTextArea("");
        playerScore.setBounds(100, 50, 50, 50);
        playerScore.setBackground(Color.black);
        playerScore.setForeground(Color.white);
        playerScore.setFont(statsFont);
        playerScore.setText("" + score);
        herroStatsPanel.add(playerScore);


//
//        playerWeponLebel = new JLabel("PlayerWepon");
//        playerWeponLebel.setBounds(100,25,50,50);
//        playerWeponLebel.setBackground(Color.black);
//        playerWeponLebel.setForeground(Color.white);
//        playerWeponLebel.setFont(statsFont);
//        herroStatsPanel.add(playerWeponLebel);
//
//        playerWepon = new JTextArea("2000");
//        playerWepon.setBounds(100,50,50,50);
//        playerWepon.setBackground(Color.black);
//        playerWepon.setForeground(Color.white);
//        playerWepon.setFont(statsFont);
//        herroStatsPanel.add(playerWepon);


        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.black);
        container.add(mainTextPanel);


        mainTextArea = new JTextArea("");
        mainTextArea.setBounds(100, 100, 600, 400);
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


        fightButton = new JButton("Fight");
        fightButton.setBackground(Color.black);
        fightButton.setForeground(Color.white);
        fightButton.setFont(ButtonFont);
        fightButton.setFocusPainted(false);
        fightButton.addActionListener(fightingMovement);
        choiceButtonpanel.add(fightButton);


        runButton = new JButton("Run");
        runButton.setBackground(Color.black);
        runButton.setForeground(Color.white);
        runButton.setFont(ButtonFont);
        runButton.setFocusPainted(false);
        runButton.addActionListener(runningMovement);
        choiceButtonpanel.add(runButton);


        leftbotton = new JButton("left");
        leftbotton.setBackground(Color.black);
        leftbotton.setForeground(Color.white);
        leftbotton.setFont(ButtonFont);
        leftbotton.setFocusPainted(false);
        leftbotton.addActionListener(leftMovement);
        choiceButtonpanel.add(leftbotton);


        rightbotton = new JButton("Right");
        rightbotton.setBackground(Color.green);
        rightbotton.setForeground(Color.white);
        rightbotton.setFont(ButtonFont);
        rightbotton.addActionListener(rightMovement);
        choiceButtonpanel.add(rightbotton);

        upbotton = new JButton("up");
        upbotton.setBackground(Color.black);
        upbotton.setForeground(Color.white);
        upbotton.setFont(ButtonFont);
        upbotton.setFocusPainted(false);
        upbotton.addActionListener(upMovement);
        choiceButtonpanel.add(upbotton);


        downbotton = new JButton("down");
        downbotton.setBackground(Color.black);
        downbotton.setForeground(Color.white);
        downbotton.setFont(ButtonFont);
        downbotton.setFocusPainted(false);
        downbotton.addActionListener(downMovement);
        choiceButtonpanel.add(downbotton);

        continueButton = new JButton("Continue");
        continueButton.setBackground(Color.black);
        continueButton.setForeground(Color.white);
        continueButton.setFont(ButtonFont);
        continueButton.addActionListener(continueMovement);
        choiceButtonpanel.add(continueButton);

        saveButton = new JButton("Save");
        saveButton.setBackground(Color.black);
        saveButton.setForeground(Color.white);
        saveButton.setFont(ButtonFont);
        saveButton.addActionListener(saving);
        choiceButtonpanel.add(saveButton);

//        testButton = new JButton("Test");
//        testButton.setBackground(Color.black);
//        testButton.setForeground(Color.white);
//        testButton.setFont(ButtonFont);
//        testButton.addActionListener(testMovement);
//        choiceButtonpanel.add(testButton);

        playerStats.add(payerName);
        playerStats.add(herroHP);
        playerStats.add(level);
        playerStats.add(herroAmor);
        playerStats.add(score);
        playerStats.add(herroPower);
        playerStatistics = herroHP + " " + level + " " + score;


        if (i < 5) {
            mainTextArea.setText(villen.getVillenName() + " has appeared\nthe villen has " + villen.getVillenWeapon() + "\nthe villenHP is " + villen.getRootHealth() + "\n WHAT DO YOU DO");
        } else
            mainTextArea.setText("please move left,right,up or down");
        // mainTextArea.setText(villen.getVillenName() + " has appeared\nthe villen has "+ villen.getVillenWeapon()+ "\nthe villenHP is "+ villen.getRootHealth() + "\n WHAT DO YOU DO");


    }


    public void createGameFrameNewGame() {

        herroButtunPanel.setVisible(false);
        titleNamePanel.setVisible(false);

        EnterNamePanel.setVisible(false);
        startButtonPanel.setVisible(false);

        herroStatsPanel = new JPanel();
        herroStatsPanel.setBounds(100, 10, 600, 50);
        herroStatsPanel.setBackground(Color.black);
        container.add(herroStatsPanel);


        playerHpLabel = new JLabel("PlayerHP");
        playerHpLabel.setBounds(100, 25, 50, 50);
        playerHpLabel.setBackground(Color.black);
        playerHpLabel.setForeground(Color.white);
        playerHpLabel.setFont(statsFont);
        herroStatsPanel.add(playerHpLabel);

        playerHp = new JTextArea("");
        playerHp.setBounds(100, 50, 50, 50);
        playerHp.setBackground(Color.black);
        playerHp.setForeground(Color.white);
        playerHp.setFont(statsFont);
        playerHp.setText("" + herro.getHerroHP());
        herroStatsPanel.add(playerHp);


        playerLevelLabel = new JLabel("PlayerLevel");
        playerLevelLabel.setBounds(100, 25, 50, 50);
        playerLevelLabel.setBackground(Color.black);
        playerLevelLabel.setForeground(Color.white);
        playerLevelLabel.setFont(statsFont);
        herroStatsPanel.add(playerLevelLabel);

        playerLevel = new JTextArea("");
        playerLevel.setBounds(100, 50, 50, 50);
        playerLevel.setBackground(Color.black);
        playerLevel.setForeground(Color.white);
        playerLevel.setFont(statsFont);
        playerLevel.setText("" + level);
        herroStatsPanel.add(playerLevel);


        playerScoreLabel = new JLabel("PlayerScore");
        playerScoreLabel.setBounds(100, 25, 50, 50);
        playerScoreLabel.setBackground(Color.black);
        playerScoreLabel.setForeground(Color.white);
        playerScoreLabel.setFont(statsFont);
        herroStatsPanel.add(playerScoreLabel);

        playerScore = new JTextArea("");
        playerScore.setBounds(100, 50, 50, 50);
        playerScore.setBackground(Color.black);
        playerScore.setForeground(Color.white);
        playerScore.setFont(statsFont);
        playerScore.setText("" + score);
        herroStatsPanel.add(playerScore);


//
//        playerWeponLebel = new JLabel("PlayerWepon");
//        playerWeponLebel.setBounds(100,25,50,50);
//        playerWeponLebel.setBackground(Color.black);
//        playerWeponLebel.setForeground(Color.white);
//        playerWeponLebel.setFont(statsFont);
//        herroStatsPanel.add(playerWeponLebel);
//
//        playerWepon = new JTextArea("2000");
//        playerWepon.setBounds(100,50,50,50);
//        playerWepon.setBackground(Color.black);
//        playerWepon.setForeground(Color.white);
//        playerWepon.setFont(statsFont);
//        herroStatsPanel.add(playerWepon);


        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.black);
        container.add(mainTextPanel);


        mainTextArea = new JTextArea("");
        mainTextArea.setBounds(100, 100, 600, 400);
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


        fightButton = new JButton("Fight");
        fightButton.setBackground(Color.black);
        fightButton.setForeground(Color.white);
        fightButton.setFont(ButtonFont);
        fightButton.setFocusPainted(false);
        fightButton.addActionListener(fightingMovement);
        choiceButtonpanel.add(fightButton);


        runButton = new JButton("Run");
        runButton.setBackground(Color.black);
        runButton.setForeground(Color.white);
        runButton.setFont(ButtonFont);
        runButton.setFocusPainted(false);
        runButton.addActionListener(runningMovement);
        choiceButtonpanel.add(runButton);


        leftbotton = new JButton("left");
        leftbotton.setBackground(Color.black);
        leftbotton.setForeground(Color.white);
        leftbotton.setFont(ButtonFont);
        leftbotton.setFocusPainted(false);
        leftbotton.addActionListener(leftMovement);
        choiceButtonpanel.add(leftbotton);


        rightbotton = new JButton("Right");
        rightbotton.setBackground(Color.green);
        rightbotton.setForeground(Color.white);
        rightbotton.setFont(ButtonFont);
        rightbotton.addActionListener(rightMovement);
        choiceButtonpanel.add(rightbotton);

        upbotton = new JButton("up");
        upbotton.setBackground(Color.black);
        upbotton.setForeground(Color.white);
        upbotton.setFont(ButtonFont);
        upbotton.setFocusPainted(false);
        upbotton.addActionListener(upMovement);
        choiceButtonpanel.add(upbotton);


        downbotton = new JButton("down");
        downbotton.setBackground(Color.black);
        downbotton.setForeground(Color.white);
        downbotton.setFont(ButtonFont);
        downbotton.setFocusPainted(false);
        downbotton.addActionListener(downMovement);
        choiceButtonpanel.add(downbotton);

        continueButton = new JButton("Continue");
        continueButton.setBackground(Color.black);
        continueButton.setForeground(Color.white);
        continueButton.setFont(ButtonFont);
        continueButton.addActionListener(continueMovement);
        choiceButtonpanel.add(continueButton);

        saveButton = new JButton("Save");
        saveButton.setBackground(Color.black);
        saveButton.setForeground(Color.white);
        saveButton.setFont(ButtonFont);
        saveButton.addActionListener(saving);
        choiceButtonpanel.add(saveButton);

//        testButton = new JButton("Test");
//        testButton.setBackground(Color.black);
//        testButton.setForeground(Color.white);
//        testButton.setFont(ButtonFont);
//        testButton.addActionListener(testMovement);
//        choiceButtonpanel.add(testButton);

        playerStats.add(payerName);
        playerStats.add(herroHP);
        playerStats.add(level);
        playerStats.add(herroAmor);
        playerStats.add(score);
        playerStats.add(herroPower);
        playerStatistics = herroHP + " " + level + " " + score;


        if (i < 5) {
            mainTextArea.setText(villen.getVillenName() + " has appeared\nthe villen has " + villen.getVillenWeapon() + "\nthe villenHP is " + villen.getRootHealth() + "\n WHAT DO YOU DO");
        } else
            mainTextArea.setText("please move left,right,up or down");
        // mainTextArea.setText(villen.getVillenName() + " has appeared\nthe villen has "+ villen.getVillenWeapon()+ "\nthe villenHP is "+ villen.getRootHealth() + "\n WHAT DO YOU DO");


    }

    public IVillen createVillen() {

        IVillen villen = VillenMaker.VillenMaker(random.nextInt(2) + 1);

        return villen;
    }


    public class UpMovement implements ActionListener {


        public void actionPerformed(ActionEvent event) {

            if (fightRun != 1) {
                if (i > 5) {

                    i = random.nextInt(20);
                    if (i < 5) {
                        mainTextArea.setText("You moved up, then \n" + villen.getVillenName() + " has appeared\nthe villen has " + villen.getVillenWeapon() + "\nthe villenHP is " + villen.getRootHealth() + "\n WHAT DO YOU DO");

                    } else {
                        mainTextArea.setText("you moved up");
                        move++;
                        if (move > 5) {
                            mainTextArea.setText(" you have reached the boarder, you fineshed stage");
                            move = 0;
                            level++;
                            playerLevel.setText("" + level);
                        }
                    }
                } else
                    mainTextArea.append("\nyou have to fight or run");
            } else
                mainTextArea.append("\ncontinue or save");
        }
    }


    public class DownMovement implements ActionListener {


        public void actionPerformed(ActionEvent event) {

            if (fightRun != 1) {
                if (i > 5) {

                    i = random.nextInt(20);
                    if (i < 5) {
                        mainTextArea.setText("You moved down, then \n" + villen.getVillenName() + " has appeared\nthe villen has " + villen.getVillenWeapon() + "\nthe villenHP is " + villen.getRootHealth() + "\n WHAT DO YOU DO");

                    } else {
                        mainTextArea.setText("you moved down");
                        move++;
                        if (move > 5) {
                            mainTextArea.setText(" you have reached the boarder, you finished stage");
                            level++;
                            move = 0;
                            playerLevel.setText("" + level);
                        }
                    }
                } else
                    mainTextArea.append("\nyou have to fight or run");
            } else
                mainTextArea.append("\ncontinue or save");
        }
    }

    public class LeftMovement implements ActionListener {


        public void actionPerformed(ActionEvent event) {

            if (fightRun != 1) {
                if (i > 5) {

                    i = random.nextInt(20);
                    if (i < 5) {
                        mainTextArea.setText("You moved left, then \n" + villen.getVillenName() + " has appeared\nthe villen has " + villen.getVillenWeapon() + "\nthe villenHP is " + villen.getRootHealth() + "\n WHAT DO YOU DO");

                    } else {
                        mainTextArea.setText("you moved left");
                        move++;
                        if (move > 5) {
                            mainTextArea.setText(" you have reached the boarder, you finished stage");
                            level++;
                            move = 0;
                            playerLevel.setText("" + level);
                        }
                    }
                } else
                    mainTextArea.append("\nyou have to fight or run");
            } else
                mainTextArea.append("\ncontinue or save");
        }
    }

    public class RightMovement implements ActionListener {


        public void actionPerformed(ActionEvent event) {

            if (fightRun != 1) {
                if (i > 5) {

                    i = random.nextInt(20);
                    if (i < 5) {
                        mainTextArea.setText("You moved right, then \n" + villen.getVillenName() + " has appeared\nthe villen has " + villen.getVillenWeapon() + "\nthe villenHP is " + villen.getRootHealth() + "\n WHAT DO YOU DO");

                    } else {
                        mainTextArea.setText("you moved right");
                        move++;
                        if (move > 5) {
                            mainTextArea.setText(" you have reached the boarder, you finished stage");
                            level++;
                            move = 0;
                            playerLevel.setText("" + level);
                        }
                    }
                } else
                    mainTextArea.append("\nyou have to fight or run");
            } else
                mainTextArea.append("\ncontinue or save");
        }
    }

    public void fight() {
        villenHealth = villen.getRootHealth() - herro.getHerroAttack();


    }

    public class FightingMovement implements ActionListener {


        public void actionPerformed(ActionEvent event) {

            if (i < 5) {
                mainTextArea.setText("you are fight the villen\n it does " + villen.getRobootPower() + " to you and you do " + herro.getHerroPower() + " to the villen\n ");
                playerHp.setText("" + herro.getHerroHP());
                fight();
                if (villenHealth > 0) {
                    mainTextArea.append(" the villen did not die what would you like to do ?");

                } else {
                    mainTextArea.append("the villen is dead would you like to continue");
                    score = score + 10;
                    playerScore.setText("" + score);
                    i = 7;
                    fightRun = 1;
                }
            } else
                mainTextArea.setText("The is no villen to fight, please move left,right,up or down");

        }
    }

    public class RunningMovement implements ActionListener {


        public void actionPerformed(ActionEvent event) {

            if (i < 5) {
                if (runningTries > 0) {
                    mainTextArea.setText("you are running");
                    runningTries--;
                } else
                    mainTextArea.setText("you are can not run this time");

            } else
                mainTextArea.setText("there is no villen to run from you chicken\ngo back and fight ");
        }
    }

    public class ContinueMovement implements ActionListener {


        public void actionPerformed(ActionEvent event) {

            villen = createVillen();


            if (i < 5) {

                if (fightRun == 1) {
                    i = random.nextInt(20);
                    if (i < 5) {
                        mainTextArea.setText(villen.getVillenName() + " has appeared\nthe villen has " + villen.getVillenWeapon() + "\nthe villenHP is " + villen.getRootHealth() + "\n WHAT DO YOU DO");
                    } else {
                        mainTextArea.setText("you continued the game, please move left,right,up or down");
                        fightRun = 0;
                        i = 7;
                    }

                } else
                    mainTextArea.setText(" please move up, down, left or right");
            } else {
                mainTextArea.append("\nplease move up, down, left or right");
            }


        }
    }


    public class TestMovement implements ActionListener {


        public void actionPerformed(ActionEvent event) {



            try {
                reader = new BufferedReader(new FileReader("/goinfre/jdubula//Desktop/Swingy/" + payerName + ".txt"));
            } catch (FileNotFoundException e) {
                e.printStackTrace();
            }
            while (true) {
                try {
                    if (!((Line = reader.readLine()) != null)) break;
                } catch (IOException e) {
                    e.printStackTrace();
                }
                mainTextArea.setText(Line);
                String splited[] = Line.split(" ");
                herroHP = Integer.parseInt(splited[0]);
                level = Integer.parseInt(splited[1]);
                score = Integer.parseInt(splited[2]);
                playerHp.setText("" + herroHP);
                playerLevel.setText("" + level);
                playerScore.setText("" + score);

            }
        }
    }


    public class Saving implements ActionListener {


        public void actionPerformed(ActionEvent event) {

            //    playerNames.add(payerName);
            //    playerStats.toString();
            String fileName = payerName + ".txt";
            playerStatistics = herroHP + " " + level + " " + score;

            FileWriter fw = null;
            try {
                fw = new FileWriter(fileName);

                String jam = playerStatistics;
                fw.write(jam);
                mainTextArea.setText("game saved");

                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    public void dataBase(){

        FileWriter fw = null;

        try {
            fw = new FileWriter("names.txt",true);


            fw.write(" "+ payerName);


            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }



    public   void theSavingFuction(){
        // playerNames.add(payerName);

        String fileName = payerName + ".txt";

        FileWriter fw = null;
        try {
            fw = new FileWriter(fileName);

            String jam = playerStatistics;
            fw.write(jam);


            fw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }



    }

    public void theLoadingValueFuction(){
        //
        try {
            reader = new BufferedReader(new FileReader("/goinfre/jdubula//Desktop/Swingy/" + payerName + ".txt"));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        while (true) {
            try {
                if (!((Line = reader.readLine()) != null)) break;
            } catch (IOException e) {
                e.printStackTrace();
            }

            String splited[] = Line.split(" ");
            herroHP = Integer.parseInt(splited[0]);
            level = Integer.parseInt(splited[1]);
            score = Integer.parseInt(splited[2]);
            playerHp.setText("" + herroHP);
            playerLevel.setText("" + level);
            playerScore.setText("" + score);

        }
    }
}