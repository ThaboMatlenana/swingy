package com.swing.View;

import com.swing.Controller.Choices;
import com.swing.Controller.MapBuilder;
import com.swing.Model.HerroMaker;
import com.swing.Model.Herros;
import com.swing.Model.IVillen;
import com.swing.Model.VillenMaker;
import com.swing.Controller.simulation;

import java.util.Random;
import java.util.Scanner;

public class GamePlayForGUI {


    public static void theGame() {


        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        boolean running = true;
        System.out.println("/**********************************\\");
        System.out.println("/*                                *\\");
        System.out.println("/* Welcome to The Avengers Game   *\\");
        System.out.println("/*                                *\\");
        System.out.println("/**********************************\\");
        System.out.println("Please Choose a Herro");
        System.out.println("1. Hulk");
        System.out.println("2. Captain  America");
        String input = scanner.nextLine();

        Herros herro = HerroMaker.HerroMaker(input);
        System.out.println("you choose " + herro.getHerroName());
        int score = 0;
        int portionPower = 50;
        int Numportion = 3;
        int runningTries = 3;
        int herroPower = herro.getHerroPower();
        int herroHP = 200;
        int herroDefense = herro.getDefense();
        int herroExpiriance = herro.getHerroExpiriance();
        int herroWeapon = herro.getWeapon();
        int herroAmor = herro.getHerroAmor();
        int herroHelm = herro.getHerroHelm();
        int villenStreagth = 1;
        int villenHit;
        int herroHit;
        int HerroLifes = 3;
        int NumVillen = 2;
        int level = 1;
        int boardsize = (int) ((level - 1) * 5 + 10 - (level * (0.02)));
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
            int villenHealth = villen.getRootHealth();

            int villenPowerTwo = villenTwo.getRobootPower();
            int villenHealthTwo = villenTwo.getRootHealth();


            System.out.println("\n************* " + villen.getVillenName() + " has appeard *************   " + level + " ");

            while (villenHealth >= 0) {
                input = Choices.ChoicesOnTheMap();
                boolean gamePlay = mapBuilder.movePlayer(input);
                int i = mapBuilder.finishgame;
                if (i == 0) {
                    System.out.println("\n");
                    System.out.println("\n************* " + villen.getVillenName() + " has appeard *************   ");
                    System.out.println("\nyou are now in level " + level);
                    mapBuilder.placePlayerAfterThelevelisComplete(level++);

                    break;
                }
                if (gamePlay) {
                    input = Choices.Choices();
                    if (input.equals("1")) {
                        villenHit = simulation.gameSimulationPlayerHit(herroAmor,herroDefense,herroWeapon,level,villen.getVillenAttack());
                        herroHit = (simulation.gameSimulationVillenHit(herroPower,herroExpiriance,herroWeapon,villen.getVillenDefense(),villen.getVillenWeapon(),level));
                        villenHealth = villenHealth - herroHit;
                        herroHP = herroHP - villenHit;

                        System.out.println();
                        System.out.println("you are fighting " + villen.getVillenName() + " ,you do " + herroHit + " damage to him, he does " + villenHit + " to you");
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
                        if (villenHealth < 1) {

                            score++;
                            System.out.println(villen.getVillenName() + " died your health is " + herroHP + " your score is now " + score);
                            NumVillen--;
                            mapBuilder.movePlayer("5");
                            mapBuilder.placePlayerAfterTheVillenDies(level);
                            break;
                        } else
                            System.out.println(villen.getVillenName() + " is not dead, he still has " + villenHealth + " health left, and your health is " + herroHP);

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
            }
        }
    }
}