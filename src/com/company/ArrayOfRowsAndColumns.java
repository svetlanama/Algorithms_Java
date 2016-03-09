package com.company;
import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created by svitlana on 3/9/16.
 */
public class ArrayOfRowsAndColumns {

    // Array rows and column
    //var mass = { {true, true, true} {true, false, true} {false, false, false} {false, true, false}}

    public static void arrOfRowsAndColumnsBoolean() {

        boolean[][] mass = {
                {true, true, true},
                {true, false, true},
                {false, false, false},
                {false, true, false},
        };

        for (int i = 0; i < mass.length; i++) {

            if (i == 0) {
                for (int k = 0; k < mass[i].length; k++) {
                    System.out.print((k == 0 ? "  " : "") + (k + 1) + "\t");
                }
            }

            System.out.print("\n" + (i + 1) + " ");
            // System.out.print("\n");

            for (int j = 0; j < mass[i].length; j++) {
                System.out.print((mass[i][j] ? "*" : "-") + "\t");
            }
        }
    }

    // code snippet to display a two-dimensional array transposition with M rows and N columns (rows are replaced by columns)
    public static void arrOfRowsAndColumns() {
        int[][] mass = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] mass2 = new int[3][3];
        for (int i = 0; i < mass.length; i++) {
            for (int j = 0; j < mass[i].length; j++) {
                mass2[i][j] = mass[j][i];
            }
        }


        for (int i = 0; i < mass2.length; i++) {

            if (i == 0) {
                for (int k = 0; k < mass2[i].length; k++) {
                    System.out.print((k == 0 ? "  " : "") + (k + 1) + "\t");
                }
            }

            System.out.print("\n" + (i + 1) + " ");
            // System.out.print("\n");

            for (int j = 0; j < mass2[i].length; j++) {
                System.out.print((mass2[i][j] == 1 ? "*" : "-") + "\t");
            }
        }

    }

}
