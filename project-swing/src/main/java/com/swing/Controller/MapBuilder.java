package com.swing.Controller;

import java.util. Random;



public class MapBuilder {

    private int boadsize = (int) ((1-1)*5 +10 - (1* (0.02)));


    private  char [][] board;



    Random random = new Random();
    private   int herroY = boadsize/2;
    private  int herroX = boadsize/2;

    int VillenY = random.nextInt(7) + 1;
    int VillenX = random.nextInt(7) + 1;

    int VillenTwoY = random.nextInt(7) + 1;
    int VillenTwoX = random.nextInt(7) + 1;



    public int finishgame = 0;


    public    void placePlayers(){
        this.buildbord();
        board[herroY][herroX] = 'H';
        board[VillenY][VillenX] = 'V';
        board[VillenTwoY][VillenTwoX] = 'W';

        this.drawboard();
    }

    public    void placePlayerAfterThelevelisComplete(int level){

        this.boadsize = (int) ((level-1)*5 +10 - (level * (0.02)));
        herroY = ((boadsize )/2);
        herroX = (boadsize /2);

        VillenY = random.nextInt(boadsize-1) + 1;
        VillenX = random.nextInt(boadsize-1) + 1;

        VillenTwoY = random.nextInt(boadsize-1) + 1;
        VillenTwoX = random.nextInt(boadsize-1) + 1;

        this.createCharArray(boadsize);
        this.buildbord();
        board[herroY][herroX] = 'H';
        board[VillenY][VillenX] = 'V';
        board[VillenTwoY][VillenTwoX] = 'W';
        this.drawboard();
    }


    public    void placePlayerAfterTheVillenDies(int level){
        this.boadsize = (int) ((level-1)*5 +10 - (level * (0.02)));
        herroY = ((boadsize )/2);
        herroX = (boadsize /2);

        VillenY = random.nextInt(boadsize-1) + 1;
        VillenX = random.nextInt(boadsize-1) + 1;

        VillenTwoY = random.nextInt(boadsize-1) + 1;
        VillenTwoX = random.nextInt(boadsize-1) + 1;

        this.createCharArray(boadsize);
        this.buildbord();
        board[herroY][herroX] = 'H';
        board[VillenY][VillenX] = 'V';
        board[VillenTwoY][VillenTwoX] = 'W';
        this.drawboard();


    }


    public void createCharArray(int boadsize){
        this.boadsize = boadsize;
        board = new char[boadsize][boadsize];
    }



    public boolean movePlayer(String str){

        // to move you to the direction of the Villen
        if (str.equals("5")){
            board[herroY][herroX] = '.';
            herroX = VillenX;
            herroY = VillenX;
            return false;


        }

        if (str.equals("1")) {
            if (herroY == 0) {
                System.out.println("you are at the boarder");
                finishgame = 0;
                this.drawboard();
                return false;
            }

            else
            {
                if ((herroY - 1 == VillenY && herroX ==VillenX) || (herroY - 1 == VillenTwoY && herroX == VillenTwoY) ) {
                    System.out.println("You meet the villen, what do you do?");
                    this.drawboard();
                    finishgame = 1;
                    return true;

                } else {
                    board[herroY][herroX] = '.';
                    herroY = herroY - 1;
                    board[herroY][herroX] = 'H';
                    this.drawboard();
                    finishgame = 1;
                    return false;
                }
            }

        }

        else if (str.equals("2")) {
            if ( herroY == boadsize-1 ) {
                System.out.println("you are at the boarder");
                finishgame = 0;
                this.drawboard();

                return false;
            }
            else {

                if(( herroY + 1 == VillenY && herroX ==VillenX) || ( herroY + 1 == VillenTwoY && herroX ==VillenTwoX))  {
                    System.out.println("You meet the villen, what do you do?");
                    this.drawboard();
                    finishgame = 1;
                    return true;

                }
                board[herroY][herroX] = '.';
                herroY = herroY + 1;
                board[herroY][herroX] = 'H';
                this.drawboard();
                finishgame = 1;
                return false;



            }

        } else if (str.equals("3")) {
            if ( herroX == 0) {
                System.out.println("you are at the boarder");
                finishgame = 0;
                this.drawboard();
                return false;
            }
            else{

                if((herroX - 1 == VillenX && herroY ==VillenY) || ( herroX - 1 == VillenTwoX && herroY ==VillenTwoY)){
                    System.out.println("You meet the villen, what do you do?");
                    this.drawboard();
                    finishgame = 1;
                    return true;
                }
                board[herroY][herroX] = '.';
                herroX = herroX - 1;
                board[herroY][herroX] = 'H';
                this.drawboard();
                finishgame = 1;
                return false;
            }
        } else if (str.equals("4")) {
            if (herroX == boadsize - 1) {
                System.out.println("you are at the boarder");
                finishgame = 0;
                this.drawboard();
                return false;
            }
            else{
                if(( herroX  + 1 == VillenX && herroY ==VillenY)|| ( herroX  + 1 == VillenTwoX && herroY ==VillenTwoY)){
                    System.out.println("You meet the villen, what do you do?");
                    this.drawboard();
                    finishgame = 1;
                    return true;
                }

                board[herroY][herroX] = '.';
                herroX = herroX + 1;
                board[herroY][herroX] = 'H';
                this.drawboard();
                return false;

            }
        }

        else
        {
            System.out.println("wrong in put");
            return false;
        }

    }


    public  void buildbord() {

        for (int y = 0; y < boadsize; y++) {
            for(int x = 0; x< boadsize; x++){
                board[y][x] = '.';
            }

        }
    }

    public  void drawboard(){

        for (int y = 0; y < boadsize; y++) {
            System.out.println();
            for(int x = 0; x< boadsize; x++){
                System.out.print(board[y][x]);
            }

        }

    }
}
