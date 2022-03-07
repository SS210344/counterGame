package com.company;
import com.company.Counter;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        while(true) {
            ArrayList<Counter> counters = new ArrayList<>();
            String Colour = "";
            for (int i = 0; i < 10; i++) {
                int RandomNum = GetRandomNumber();
                if (RandomNum == 1) {
                    Colour = "red";
                }
                if (RandomNum == 2) {
                    Colour = "Blue";
                }
                if (RandomNum == 3) {
                    Colour = "Yellow";
                }

                Counter counter = new Counter(Colour, RandomNum);
                counters.add(counter);

            }
            // game
            int Score = 0;
            Scanner input = new Scanner(System.in);
            for (int i = 0; i < 10; i++) {
                System.out.println("guess next colour from red, blue , yellow");
                String userInput = input.next();
                if (userInput.equals(counters.get(i).getColour())) {
                    System.out.println("corret guess Score +1");
                    Score = Score + 1;
                } else {
                    System.out.println("incorret score -1");
                    Score = Score - 1;
                }

            }
            System.out.println("you have completed 10 guesses you scored!");
            System.out.println(Score);

            System.out.println("play again Y/N");
            String playAgain = input.next();
            if (playAgain.equalsIgnoreCase("y")) {
                System.out.println("new game");
            } else {
                break;
            }
        }
    }
    public static int GetRandomNumber(){
        Random random = new Random();
        int RandomNum = random.nextInt(3);
        return RandomNum;

    }
}
