package ua.nure.matsak.task1;

import java.util.Arrays;

public class Part8 {
    static private int space = 1;

    public static void main(String[] args) {
        int n = 0;
        try{
            n = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException | ArrayIndexOutOfBoundsException ex){
            System.out.println("Wrong arguments. Try to input correct numbers\n\n");
            ex.printStackTrace();
        }
        int[][] triangle = pascal(n);
        for (int i = 0; i < triangle.length; i++) {
            for (int k = 0; k < triangle.length - 1 - i; k++){
                System.out.print(" ");
            }
            for (int j = 0; j < triangle[i].length; j++) {
                System.out.print(triangle[i][j]);
                if (j < triangle[i].length - 1) {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static int[][] pascal(int n){
        int[][] pascalTringle = new int[n][];
        pascalTringle[0] = new int[]{1};
        for (int i = 1; i < n; i++){
            int[] line = new int[i+1];
            int value = 0;
            for (int j = 1; j < line.length - 1; j++){
                value = pascalTringle[i-1][j] + pascalTringle[i-1][j-1];
                line[j] = value;
                if (value > 9) space = 2;
                if (value > 99) space = 3;
                if (value > 999) space = 4;
            }
            line[0] = 1;
            line[line.length-1] = 1;
            pascalTringle[i] = line;
        }
        return pascalTringle;
    }
}
