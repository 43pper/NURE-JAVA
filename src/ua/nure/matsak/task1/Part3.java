package ua.nure.matsak.task1;

public class Part3 {
    public static void main(String[] args) {
        try{
            int num1 = Integer.parseInt(args[0]);
            int num2 = Integer.parseInt(args[1]);
            if (args.length > 2) throw new IllegalArgumentException();
            System.out.println(gcd(num1, num2) + " " + (num1 * num2) / gcd(num1, num2));
        }
        catch (IllegalArgumentException | ArrayIndexOutOfBoundsException ex){
            System.out.println("Wrong arguments. Try to input correct numbers\n\n");
            ex.printStackTrace();
        }

    }

    private static int gcd(int n1, int n2){
        if (n1 < n2) {
            int temp = n1;
            n1 = n2;
            n2 = temp;
        }

        if (n2 > 0) return gcd(n2, n1 % n2);
        else return n1;
    }
}
