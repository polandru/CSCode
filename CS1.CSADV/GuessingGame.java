import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Guess a number between 1 and 100: ");
        int ans = sc.nextInt();
        int secret  = (int)(Math.random()*100)+1;


        if (ans ==  secret) {
            System.out.println("You got it!");
        }
        if( ans > secret){
            System.out.print("Too high by "+(ans - secret));
        }
        if( ans < secret ){
            System.out.print("Too Low by "+(secret - ans));
        }
    }





}
