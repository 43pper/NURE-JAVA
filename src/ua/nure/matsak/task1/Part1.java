package ua.nure.matsak.task1;

public class Part1 {
    public static void main(String[] args) {
        try{
            int i = 0;
            int sum = 0;
            while (i < args.length){
                sum += Integer.parseInt(args[i]);
                i++;
            }
            System.out.println(sum);
        }
        catch(Exception ex){
            System.out.println("Wrong arguments. Try to input correct numbers\n\n");
            ex.printStackTrace();
        }

    }
}
