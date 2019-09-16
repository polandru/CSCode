import java.util.Scanner;

public class HW{

    public double forceCalc(double mass, double acceleration){
        double force = mass*acceleration;
        return force;
    }

    public boolean passCheck(String password){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter password:");
        String userInput = sc.nextLine();
        if(password.equals(userInput)){
            return true;
        }else{
            return false;
        }
    }

    public double calculateShipping(double length, double height, double width){
        double volume  = length*width*height;
        double  cost = volume/14.57;
        return cost;
    }

    public double diceAvg(){
        int die1 = (int)(Math.random()*6)+1;
        int die2 = (int)(Math.random()*6)+1;
        int die3 = (int)(Math.random()*6)+1;
        double avg = (die1+die2+die3)/3.0;

        return avg;
    }

}