package com.example.demo;
import java.util.*;

public class ArrayGane {

    public static boolean canWin(int leap, int[] game) {
       // int peek = game[0];
        int winDiff = game.length;
       // int gameSize = game.length-1;
        // Return true if you can win the game; otherwise, return false.
          int a = winDiff-leap;
            if(game[a]==0) return true;
        
        return false;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int q = scan.nextInt();
        while (q-- > 0) {
            int n = scan.nextInt();
            int leap = scan.nextInt();
            
            int[] game = new int[n];
            for (int i = 0; i < n; i++) {
                game[i] = scan.nextInt();
            }

            System.out.println( (canWin(leap, game)) ? "YES" : "NO" );
        }
        scan.close();
    }
}