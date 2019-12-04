import java.util.Scanner;

/*
    Created by Mr. Perdomo
*/
public class Steak {

    private String style;
    private double size;
    private String fill;
    private double rate;

    public Steak(){
        style = "New York Strip";
        size = 4.0;
        fill = "cotton";
        rate = 4.0;
    }

    public double getPrice(){
        return rate*size;
    }

    public void customize(){
        String[] cuts = {"New York Strip", "Chuck","T-Bone","Skirt"};
        int choice  = -1;
        Store.printMenu("The cut choices", cuts);
        switch(choice){
            case 1:
                rate = 4;
                break;
            case 2:
                rate = 2;
                style = "Chuck";
                break;
            case 3:
                rate = 5.42;
                style="T-Bone";
                break;
            case 4:
                rate = 3.77;
                style ="Skirt";
                break;
        }
        System.out.print("Enter the size in lbs:");
        Scanner sc =new Scanner(System.in);
        size = sc.nextDouble();
        sc.nextLine();

        String[] fills = {"Cotton","Feathers"};
        choice = Store.printMenu("The fill choices",fills);
        switch(choice){
            case 1:
                rate += 1;
                break;
            case 2:
                fill = "feathers";
                rate +=3;
                break;
        }
    }

    public String toString(){
        return "Steak:\n Style: "+style+"\n Size: "+size+" lbs \n Fill: "+fill+"\n Price: "+getPrice()+"\n\n";
    }

}