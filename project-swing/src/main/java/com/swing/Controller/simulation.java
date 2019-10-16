package com.swing.Controller;

public class simulation {

    public static int gameSimulationPlayerHit(int herroAmor,int herroDefense, int villenWepon , int level, int villenAttack ){

        int result =  (villenWepon*level*villenAttack) - (herroDefense + herroAmor) ;

        return result;
    }

    public static int gameSimulationVillenHit(int herroHitAttack,int herroEP,int herroWeapon,int villenDefense, int villenWepon , int level){

        int result =  ( herroWeapon*herroEP*herroHitAttack) ;

        return result;
    }
}

