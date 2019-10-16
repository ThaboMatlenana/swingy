package com.swing.Controller;

public class LevelUp {


    public static int increaseLevel(int level) {
        int  levelUp = level * 1000 +((level-1)*2 * 450);
        return levelUp;
    }


}
