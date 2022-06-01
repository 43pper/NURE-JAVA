package ua.nure.matsak.task1;

public class Part6 {
    public static void main(String[] args) {
        try{
            int num = Integer.parseInt(args[0]);
            int currentPrime = 2;
            boolean isFirstPrime = true;
            StringBuilder finalString = new StringBuilder();
            while (num > 1){
                if (num % currentPrime == 0){
                    int degree = 0;
                    while (num % currentPrime == 0){
                        num /= currentPrime;
                        degree++;
                    }
                    if (isFirstPrime) {
                        finalString.append(currentPrime).append("^").append(degree);
                        isFirstPrime = false;
                    }
                    else{
                    finalString.append(" * ").append(currentPrime).append("^").append(degree);
                    }
                    currentPrime = nextPrime(currentPrime);
                }
                else{
                    currentPrime = nextPrime(currentPrime);
                }
            }
            System.out.println(finalString);
        }
        catch(NumberFormatException | ArrayIndexOutOfBoundsException ex){
            System.out.println("Wrong arguments. Try to input correct numbers\n\n");
            ex.printStackTrace();
        }

    }

    public static int nextPrime(int n){
        boolean isPrime = false;
        n += 1;
        while (!isPrime){
            isPrime = true;
            for (int i = 2; i < n; i++){
                if (n % i == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) break;
            n += 1;
        }
        return n;
    }

}


