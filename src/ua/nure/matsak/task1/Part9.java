package ua.nure.matsak.task1;

public class Part9 {
    public static void main(String[] args) {
        int n = 0;
        try{
            n = Integer.parseInt(args[0]);
        }
        catch (NumberFormatException | ArrayIndexOutOfBoundsException ex){
            System.out.println("Wrong arguments. Try to input correct numbers\n\n");
            ex.printStackTrace();
        }

        int thisNum = Part6.nextPrime(1);
        boolean isFirst = true;
        while (thisNum < n){
            if (isFirst){
                System.out.print(thisNum);
                thisNum = Part6.nextPrime(thisNum);
                isFirst = false;
            }
            System.out.print(" " + thisNum);
            thisNum = Part6.nextPrime(thisNum);
        }
    }
}
