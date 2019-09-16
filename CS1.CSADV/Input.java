import java.util.Scanner;
public class Input {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name?");
        String ans = sc.nextLine();
        System.out.println("Hi "+ans);
    }

    public static void sayHi(){
        System.out.print("Hello");
    }


}
