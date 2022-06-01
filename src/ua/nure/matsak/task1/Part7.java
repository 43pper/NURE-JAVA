package ua.nure.matsak.task1;

import java.util.Arrays;

public class Part7 {
    public static void main(String[] args) {
        int count = 0;
        try{
            count = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException | ArrayIndexOutOfBoundsException ex){
            System.out.println("Wrong arguments. Try to input correct numbers\n\n");
            ex.printStackTrace();
        }
        int[] primeNums = Part5.getPrimeNumbers(count);

        int maxSum = 0;
        int countOfMaxSum = 0;
        for(int x : primeNums){
            int thisSum = 0;
            int num = x;
            while (num > 0){
                int remainder = num % 10;
                thisSum += remainder;
                num -= remainder;
                num /= 10;
            }
            if (thisSum > maxSum) {
                maxSum = thisSum;
                countOfMaxSum = 1;
            }
            else if (thisSum == maxSum) {
                countOfMaxSum++;
            }
        }

        System.out.println(maxSum + " " + countOfMaxSum);
    }



}
