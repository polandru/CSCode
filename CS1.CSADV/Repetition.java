import java.util.Scanner;

public class Repetition {

    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("How many times should the statement repeat?");
        int repeats = sc.nextInt();

        System.out.println("Before the loop");
        while (num < repeats) {
            System.out.println((num+1)+" Welcome to the 2nd 9-Weeks");
            num +=1;
        }
        System.out.println("After the Loop");

        sc.nextLine();

        String secret = "Magnolia";
        System.out.print("Guess the secret word:");
        String guess = sc.nextLine();
        while(!guess.equals(secret)){
            System.out.print("Nope! try again");
            guess = sc.nextLine();
        }
        System.out.println("Got it!");

        System.out.print("Enter a number");
        int num2 = sc.nextInt();

        String str = "Divisible by";

        if(num2%1==0){
            str +=" 1";
        }
        if(num2%2==0){
            str +=",2";
        }
    }
}
