import java.util.Scanner;

public class Intro {

    public static void main(String[] args) {
    }

    public static double circleArea(double radius){
        double area = 3.14159265*radius*radius;
        return area;
    }

    //This function returns the biggest of the two number
    public static int biggest(int num1, int num2){
        if(num1>num2){
            return num1;
        }else{
            return num2;
        }
    }


    //f(x) =  x^2  x<5
    //f(x) = 2x+5 x>=5
    public static double function(double x){
        double answer=0;

        if(x < 5){
            answer = x*x;
            return answer;
        }


        if(x>=5){
            answer = 2*x+5;
            return answer;
        }
        return 0;



    }



}


