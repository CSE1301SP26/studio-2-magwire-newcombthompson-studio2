package studio2;
import java.util.Scanner;
public class Ruin {
    public static void main(String[] args){
        Scanner in = new Scanner (System.in);
        System.out.println("How many days would you like to play?");
        int days = in.nextInt();
        for (int x=1; x<=days;x++) {
        System.out.println("Day" + x);
        System.out.println("What's your starting amount?");
        double startAmount = in.nextDouble();
        System.out.println("What's your win limit?");
        double winLimit = in.nextDouble();
        double winChance = 0.5;
        double i = startAmount;
        int totalSimulations = 0; 
        int a = 0;
        int b = 0;
        double expectedRuin =(1-(startAmount/winLimit));
        System.out.println("Your expected ruin is "+ (expectedRuin*100) + "%");
       
            while (i > 0 && i < winLimit) {
            if (winChance > Math.random()) {
                i++;
                totalSimulations++;
                a++;
            } else {
                i--;
                totalSimulations++;
                b++;

            }
        }
        System.out.println("Total Simulations: " + totalSimulations);
        System.out.println(a+ " wins");
        System.out.println(b+ " losses");
        if (i >= winLimit) {
            System.out.println("Success");
        } else {
            System.out.println("Ruin");
        }
        
    }
}
}

