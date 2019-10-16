package com.swing.View;

import com.swing.Controller.Choices;
import com.swing.Controller.MapBuilder;
import com.swing.Model.HerroMaker;
import com.swing.Model.Herros;
import com.swing.Model.IVillen;
import com.swing.Model.VillenMaker;

import java.io.*;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;


public class GamePlay {

    static Random random = new Random();


    boolean running = true;
    static Herros herro = HerroMaker.HerroMaker("1");
    static int score = 0;
    static int portionPower = 50;
    static int Numportion = 3;
    static int runningTries = 3;
    static int herroPower = herro.getHerroPower();
    static int herroHP = herro.getHerroHP();
    static  int herroDefense = herro.getDefense();
    static int herroExpiriance = herro.getHerroExpiriance();
    static int herroWeapon = herro.getWeapon();
    static int herroAmor = herro.getHerroAmor();
    static int herroHelm = herro.getHerroHelm();
    static int villenStreagth = 1;
    static int villenHit;
    static int herroHit;
    static int HerroLifes = 3;
    static int NumVillen = 2;
    static int level = 1;
    static int boardsize = (int) ((level - 1) * 5 + 10 - (level * (0.02)));
    static String amar ="Gun";


//    int vellenPower = 25;
//        int villenHealth = 100;
//
//        //Human;
//        int HumanPower = 35;
//        int portionNum = 3;
//        int humanHealth = 250;
//        int potionHealth = 150;



    static String payerName;
    static String Line = null;
    static BufferedReader reader = null;
    static String playerStatistics;
    static  String jay;
    static String splited[];
    static ArrayList<Object> playerStats = new ArrayList<Object>();
    static ArrayList<String> playerNames = new ArrayList<String>();





    public void theGame() {


        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        System.out.println("/**********************************\\");
        System.out.println("/*                                *\\");
        System.out.println("/* Welcome to The Avengers Game   *\\");
        System.out.println("/*                                *\\");
        System.out.println("/**********************************\\");
        String input;

        StartGame:
        while (true) {
            System.out.println("1 continue game");
            System.out.println("2 create a hero");
            input = scanner.nextLine();
            if (input.equals("1")) {
                break StartGame;
            } else if (input.equals("2")) {
                break StartGame;
            } else {
                System.out.println("Wrong Input");
            }
            ;
        }
//        System.out.println("Please insert your name");
//        NAMES:
//        while (true) {
//            input = scanner.nextLine();
//            if (input.isEmpty()) {
//                System.out.println("please insert your name");
//            } else
//                break NAMES;
//        }

        ArrayList<Object> playerStats = new ArrayList<Object>();
        ArrayList<String> playerNames = new ArrayList<String>();
        System.out.println("Please insert hero name");

        NAMES:
        while(true){
            input = scanner.nextLine();

            if(input.isEmpty()){
                System.out.println("please insert hero name");;
            }
            else
                break NAMES;
        }


        try {
            ///home/pi/NetBeansProjects/Swingy
              reader = new BufferedReader(new FileReader("/goinfre/tmatlena/Downloads/project-swing/" + "names" + ".txt")); // your location
           // reader = new BufferedReader(new FileReader("/goinfre/jdubula//Desktop/Swingy/" + "names" + ".txt"));
            // reader = new BufferedReader(new FileReader("/home/pi/NetBeansProjects/Swingy/" + "names" + ".txt"));
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

            splited = Line.split(" ");


            int i = 0;
            while (i < splited.length) {
                playerNames.add(splited[i]);
                i++;
            }

            if (playerNames.contains(input)) {
                System.out.println("the name is contained");
                payerName = input;
                theLoadingValueFuction();
                boardsize = (int) ((level - 1) * 5 + 10 - (level * (0.02)));



            } else {
                System.out.println("the name is not contained");
                payerName = input;
                playerStatistics = herroHP + " " + level + " " + score + " "+amar;
                playerNames.add(input);
                theSavingFuction();
                dataBase();
                WEPONS :
                while(true){
                    String amar = Choices.ChooseAmar();
                    if(amar.equals("1")){
                        amar = "Gun";
                        break WEPONS;
                    }
                    else if (amar.equals("2")){
                        amar = "Sword";
                        break WEPONS;
                    }
                    else
                    {
                        System.out.println("please choose one or two");

                    }


                }
                break Game;
            }

        }
        displayStats();
        MapBuilder mapBuilder = new MapBuilder();
        mapBuilder.createCharArray(boardsize);
        mapBuilder.placePlayers();



        Game:
        while (running) {


            IVillen villen = VillenMaker.VillenMaker(random.nextInt(2) + 1);
            IVillen villenTwo = VillenMaker.VillenMaker(random.nextInt(2) + 1);

            if (score > 10) {
                villenStreagth = 2;

            } else if (score > 30) {
                villenStreagth = 3;
            }
            int villenPower = villen.getRobootPower();
            int villenHP = villen.getRootHealth();

            int villenPowerTwo = villenTwo.getRobootPower();
            int villenHealthTwo = villenTwo.getRootHealth();
            theSavingFuction();


            System.out.println("\n************* " + villen.getVillenName() + " has appeard *************   " + level + " ");

            while (villenHP >= 0) {
                input = Choices.ChoicesOnTheMap();
                boolean gamePlay = mapBuilder.movePlayer(input);
                int i = mapBuilder.finishgame;
                if (i == 0) {
                    System.out.println("\n");
                    System.out.println("\n************* " + villen.getVillenName() + " has appeard *************   ");
                    System.out.println("\nyou are now in level " + level);
                    score++;
                    mapBuilder.placePlayerAfterThelevelisComplete(level++);

                    break;
                }
                if (gamePlay) {
                    input = Choices.Choices();
                    if (input.equals("1")) {
                        villenHit = (herroPower* level);
                        herroHit = (villenPower*level/2);
                        villenHP = villenHP - villenHit;
                        herroHP = herroHP - herroHit;

                        System.out.println();
                        System.out.println("you are fighting " + villen.getVillenName() + " ,you do " +villenHit + " damage to him, he does " + herroHit + " to you");
                        if (herroHP < 1) {
                            System.out.println("you died. \n 1. would you like to continue \n 2. start over");
                            input = scanner.nextLine();
                            if (input.equals("1")) {
                                if (HerroLifes > 0) {
                                    herroPower = herro.getHerroPower();
                                    herroHP = herro.getHerroHP();
                                    Numportion = 3;
                                    HerroLifes--;
                                } else {
                                    System.out.println("you do not have any lifes left");
                                    break Game;
                                }
                            } else
                                break Game;
                        }
                        if (villenHP < 1) {

                            score++;
                            level++;
                            System.out.println(villen.getVillenName() + " died your health is " + herroHP + " your score is now " + score);
                            NumVillen--;
                            mapBuilder.movePlayer("5");
                            mapBuilder.placePlayerAfterTheVillenDies(level);
                            break;
                        } else
                            System.out.println(villen.getVillenName() + " is not dead, he still has " + villenHP + " health left, and your health is " + herroHP);

                    } else if (input.equals("2")) {

                        if (Numportion > 0) {
                            herroHP = herroHP + portionPower;
                            System.out.println("you are drinking the portion, your health is now " + herroHP);
                            Numportion--;
                        } else
                            System.out.println("you are out of portionS");
                    } else if (input.equals("3")) {
                        if (runningTries > 0) {
                            System.out.println("you ran away");
                            mapBuilder.placePlayers();

                        } else {
                            System.out.println("you ran out of run running tries");
                            System.out.println("************* " + villen.getVillenName() + " has appeard *************");
                        }

                    } else
                        System.out.println("please choose 1, 2 or 3");


                }
                theSavingFuction();
            }
        }
    }



    public   void theSavingFuction(){
        playerStatistics = herroHP + " " + level + " " + score + " "+amar;
        System.out.println("\nsaving ");
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
              reader = new BufferedReader(new FileReader("/goinfre/tmatlena/Downloads/project-swing/" + payerName + ".txt")); // thibos
          //  reader = new BufferedReader(new FileReader("/goinfre/jdubula//Desktop/Swingy/" + payerName + ".txt"));
            //    reader = new BufferedReader(new FileReader("/home/pi/NetBeansProjects/Swingy/" + payerName + ".txt"));
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
            amar =  splited[3];


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

    public void displayStats(){
        System.out.println("Hello "+ payerName + " your stats:  ");
        System.out.println("HP:" +herroHP);
        System.out.println("Level: " +level);
        System.out.println("Score: "+ score);
        System.out.println("Amar: " +amar);

    }
}