package com.JonMockbee;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 800;
        int levelCompleted = 5;
        int bonus = 100;

 /*       if (score < 5000 && score> 1000){
            System.out.println("Your score was less 5000 but greater than one thousand ");
        }
        else if (score < 1000) {
            System.out.println("your score was less than 1000");
        }

        else {
            System.out.println("This is executed");
        }*/


 if (gameOver == true ) {
     int finalScore = score + (levelCompleted * bonus);
     System.out.println("Your final score " + finalScore);
     }




    }
}
