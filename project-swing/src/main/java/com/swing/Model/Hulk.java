/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swing.Model;



/**
 *
 * @author pi
 */
public class Hulk implements Herros {

    private int herroHP;
    private int herroPower;
    private String HerroName;
    private int herroAttack;
    private int defense;
    private int herroExpiriance;
    private int herroWeapon = 30;
    private int herroAmor = 10;

    private int herroHelm = 30;

    public Hulk() {
        this.herroHP = 300;
        this.herroPower = 40;
        this.HerroName ="Captain America";
        this.herroAttack = 20;
        this.defense = 35;
        this.herroExpiriance =45;
        this.herroWeapon = 3;
        this.herroAmor = 10;
        this.herroHelm = 30;
    }

    public int getHerroHP() {
        return herroHP;
    }

    public int getHerroPower() {
        return herroPower;
    }

    public int getHerroAttack() {
        return herroAttack;
    }



    public int getDefense() {
        return defense;
    }



    public int getHerroExpiriance() {
        return herroExpiriance;
    }



    public String getHerroName(){
        return HerroName;
    }

    public int getWeapon() {
        return herroWeapon;
    }

    public int getHerroAmor() {
        return herroAmor;
    }

    public int getHerroHelm() {
        return herroHelm;
    }
}


