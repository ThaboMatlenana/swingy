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
public class LargeRoboot implements IVillen {

    private int villenHP;
    private int villenHitPoint ;
    private String BigRoot;
    private int villenAttack;
    private int villenDefense;
    private int villenExpirience;
    private int villenWeapon;
    private int villenAmor;
    private int villenhelm;


    public int getVillenAttack() {
        return villenAttack;
    }

    public int getVillenDefense() {
        return villenDefense;
    }

    public int getVillenExpirience() {
        return villenExpirience;
    }

    public int getVillenWeapon() {
        return villenWeapon;
    }

    public int getVillenAmor() {
        return villenAmor;
    }

    public int getVillenhelm() {
        return villenhelm;
    }

    public LargeRoboot() {
        this.villenHP =20;
        this.villenHitPoint = 15;
        BigRoot ="Big Robot";
        villenAttack = 4;
        villenDefense = 5;
        villenWeapon = 6;
        villenAmor = 10;
        villenhelm = 40;
    }

    public int getRootHealth() {
        return villenHP;
    }

    public int getRobootPower(){
        return villenHitPoint;
    }

    public String getVillenName() {
        return BigRoot;
    }





}
