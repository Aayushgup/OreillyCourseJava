package com.company;

import java.util.Scanner;

public class Proj_6_2_TicTacToe {
    public static void main(String[] args) {
        System.out.println("WELCOME TO THE GAME !!");
      runGame();
    }
    public static void runGame()
    {
        String winner="";
        boolean xTurn =true;
        String [][] gameBoard=new String[3][3];
        initialize(gameBoard);
        print(gameBoard);

        while(winner.equals(""))
        {
            if(xTurn)
                System.out.println("Its X turn");
            else
                System.out.println("Its 0 turn");

            getUserInput(xTurn,gameBoard);
            System.out.println();
            print(gameBoard);
           winner=getWinner(gameBoard);
           xTurn=!xTurn;
           if(winner.equals("")&&isBoardFull(gameBoard))
               winner="DRAW";


        }
        if(winner.equals("DRAW"))
            System.out.println("MATCH DRAWN NO WINNER !!");
        else
            System.out.println("Game Over !! Winner is "+winner);

    }

    public static void initialize(String[][]gameBoard)
    {
        for(int i=0;i<gameBoard.length;i++)
        {
            for(int j=0;j<gameBoard.length;j++)
                gameBoard[i][j]=" ";
        }
    }
    public static void print(String[][]gameBoard)
    {
        for(int i=0;i<gameBoard.length;i++)
        {
            for(int j=0;j<gameBoard.length;j++) {
                System.out.print(gameBoard[i][j]);
                if(j<2)
                    System.out.print(" | ");
            }
            System.out.println();
            if(i<2)
                System.out.print("- - - - -");
            System.out.println();
        }
    }
    ///////////
    public static void getUserInput(boolean xTurn, String[][]gameBoard)
    {   Scanner sc=new Scanner(System.in);
        System.out.println("Please enter row and then column with space :");
        int row=sc.nextInt();
        int col=sc.nextInt();
          sc.nextLine();

          if(xTurn)
              gameBoard[row][col]="X";
          else
              gameBoard[row][col]="0";

    }
    /////////
    public static String getWinner(String[][] gameBoard)
    {
        int row=gameBoard.length;
        int col=gameBoard[0].length;
        for(int i=0;i<row;i++)
        {
            if(!gameBoard[i][0].equals(" ")&& gameBoard[i][0].equals(gameBoard[i][1])&&
                    gameBoard[i][1].equals(gameBoard[i][2]))
                return gameBoard[i][0];
        }
        for(int i=0;i<col;i++)
        {
            if(!gameBoard[0][i].equals(" ")&& gameBoard[0][i].equals(gameBoard[1][i])
                    && gameBoard[1][i].equals(gameBoard[2][i]))
                return gameBoard[0][i];
        }
        //for upper left diagonal

        if(!gameBoard[0][0].equals(" ")&& gameBoard[0][0].equals(gameBoard[1][1])
                && gameBoard[1][1].equals(gameBoard[2][2]))
            return gameBoard[0][0];

        // for upper right
        if(!gameBoard[0][2].equals(" ")&& gameBoard[0][2].equals(gameBoard[1][1])
                && gameBoard[1][1].equals(gameBoard[2][0]))
            return gameBoard[0][2];
        return "";


    }
    /// checking board is full or not
    public static boolean isBoardFull(String[][]gameBoard)
    {
        int count=0;
        for(int i=0;i<gameBoard.length;i++)
        {
            for(int j=0;j<gameBoard.length;j++)
                if(!gameBoard[i][j].equals(" "))
                    count++;
        }
        return count==9;

    }



}
