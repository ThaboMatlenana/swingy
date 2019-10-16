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
public class HerroMaker {

    public static Herros HerroMaker(String a) {

        if(a.equals("1")){
            Hulk hulk = new Hulk();
            return hulk;
        }
        else if (a.equals("2")){
            CaptainAmerica captainAmerica = new CaptainAmerica();
            return captainAmerica;
        }
        else
            return null;
    }
}
