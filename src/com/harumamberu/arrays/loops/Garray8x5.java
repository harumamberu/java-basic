package com.harumamberu.arrays.loops;

/**
 * Created by Михаїл on 22.07.2016.
 */
public class Garray8x5 {
    public static void gArray8x5() {
        int[][] gArray = new int[8][5];
        for (int i = 0; i < 8; i++){
            for (int j = 0; j < 5; j++){
                gArray[i][j] = (int) (Math.floor(Math.random()*999 + 1));
            }
        }

        for (int[] i : gArray){
            System.out.println(i);
        }

    }
}
