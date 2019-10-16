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
public class Altron {

    private int AltronPower;
    private int AltronHealth;
    private int attack;
    private int defense;
    private int expiriance;
    private int Weapon;
    private int Amor ;
    private int helm;

    public int getAttack() {
        return attack;
    }

    public int getDefense() {
        return defense;
    }

    public int getExpiriance() {
        return expiriance;
    }

    public int getWeapon() {
        return Weapon;
    }

    public int getAmor() {
        return Amor;
    }

    public int getHelm() {
        return helm;
    }


    public Altron(int AltronPower, int AltronHealth) {
        this.AltronPower = 50;
        this.AltronHealth = 35;
        this.attack = 20;
        this.defense = 35;
        this.expiriance  =45;
        this.Weapon = 30;
        this.Amor = 10;
        this.helm = 30;
    }

    public int getAltronHealth() {
        return AltronHealth;
    }

    public int getAltronPower() {
        return AltronPower;
    }




}
