package ua.nure.matsak.task1;

import java.util.Arrays;

public class Part5 {
    public static void main(String[] args) {
        try{
        int[] numbers = getPrimeNumbers(Integer.parseInt(args[0]));
        for (int i = 0; i < numbers.length; i++){
            System.out.print(numbers[i]);
            if (i != numbers.length - 1) System.out.print(" ");
        }

        }
        catch (NumberFormatException | ArrayIndexOutOfBoundsException ex){
            System.out.println("Wrong arguments. Try to input correct numbers\n\n");
            ex.printStackTrace();
        }
    }

    // I didn't use the function below because it is irrational
    public static boolean isPrime(int n){
        for (int i = 2; i < n; i++){
            if (n % i == 0) return false;
        }
        return true;
    }

    public static int[] getPrimeNumbers(int n){
        int currentNum = 2;
        int [] simpleNums = new int[n];
        for (int i = 0; i < n; i++){
            while (simpleNums[i] == 0){
                outer:{
                    for (int j = 0; j < i; j++){
                        if (currentNum % simpleNums[j] == 0) break outer;
                    }
                    simpleNums[i] = currentNum;
                }
                currentNum++;
            }
        }
        return simpleNums;
    }

}
