/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fun;

import java.util.*;
public class Fun {

   



    
    public static final String ROCK = "ROCK";
    public static final String PAPER = "PAPER";
    public static final String SCISSORS = "SCISSORS";

    public static void main(String args[]) 
    {
      System.out.println("Enter any one of the following inputs:  ");
      System.out.println("ROCK");
      System.out.println("PAPER");
      System.out.println("SCISSORS");
      System.out.println();
          
      String playerMove = getPlayerMove();
      String computerMove = getComputerMove(); 
 
      //Rules of the Game Applied Below:
      /*if both playerMove and computerMove
        produces the same formation, then 
        Game is a tie*/
      if (playerMove.equals(computerMove))
            System.out.println("Game is Tie !!");
      // if playerMove is ROCK         
      else if (playerMove.equals(Fun.ROCK))
        System.out.println(computerMove.equals(Fun.PAPER) ? "Computer Wins": "Player wins");   
      // if playerMove is PAPER
      else if (playerMove.equals(Fun.PAPER))
        System.out.println(computerMove.equals(Fun.SCISSORS) ? "Computer Wins": "Player wins");   
      // if playerMove is SCISSORS    
      else
        System.out.println(computerMove.equals(Fun.ROCK) ? "Computer Wins": "Player wins");   
    }
    
    /* Get Computer's move using Random 
       class nextInt() method */   
    public static String getComputerMove()
    {
        String computermove;
        Random random = new Random();
        int input = random.nextInt(3)+1;
        if (input == 1)
            computermove = Fun.ROCK;
        else if(input == 2)
            computermove = Fun.PAPER;
        else
            computermove = Fun.SCISSORS;
            
        System.out.println("Computer move is: " + computermove);
        System.out.println();
        return computermove;    
    }
    
    /* Get Player's move using Scanner
       class */
    public static String getPlayerMove()
    {
        Scanner in = new Scanner(System.in);
        String input = in.next();
        String playermove = input.toUpperCase();
        System.out.println("Player move is: "+ playermove);
        return playermove;
    }    
}