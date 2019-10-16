/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.swing.Model;

import com.swing.Model.BigRoobot;
import com.swing.Model.IVillen;
import com.swing.Model.LargeRoboot;
import com.swing.Model.SmallRoboot;

public class VillenMaker {

    public static IVillen VillenMaker(int b){

        Integer a = new Integer(b);
        if(a.equals(1)){
            LargeRoboot largeRoboot = new LargeRoboot();
            return largeRoboot;
        }
        else if (a.equals(2)){
            SmallRoboot smallRoboot = new SmallRoboot();
            return smallRoboot;
        }
        else if (a.equals(3)){
            BigRoobot bigRoobot = new BigRoobot();
            return bigRoobot;
        }
        else return null;
    }
}
