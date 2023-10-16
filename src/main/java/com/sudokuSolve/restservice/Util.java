package com.sudokuSolve.restservice;

public class Util {

    public static String MatrixToString(int[][] matrix) {
        String result = "";
        for (int[] row : matrix) {
            for (int cell : row) {
                if (cell < 1 || cell > 9) {
                    result += ".";
                } else {
                    result += cell;
                }
            }
        }
        return result;
    }

    public static int[][] StringToMatrix(String string) {
        int[][] result = new int[9][9];
        int i = 0;
        for (int[] row : result) {
            for (int j = 0; j < row.length; j++) {
                char c = string.charAt(i);
                if (c < '1' || c > '9') {
                    row[j] = 0;
                } else {
                    row[j] = Character.getNumericValue(c);
                }
                i++;
            }
        }
        return result;
    }
}
