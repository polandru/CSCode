import java.util.Scanner;
import java.util.ArrayList;

public class Store{

    private static Scanner sc =new Scanner(System.in);
    private ArrayList order = new ArrayList();
    private double orderTotal;

    public Store(){
        System.out.println("Welcome to Aufchnitt  Butcher Shop\n\n");
        orderTotal = 0;

        String[] choices = {"Choice 1","Choice 2","Steak","Checkout"};
        int choice =-1;
        while(choice != 4){
            choice = printMenu("Aufschnitt Store Menu",choices);
            switch(choice){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    Steak steak = new Steak();
                    System.out.println(steak);
                    System.out.print("Do you want to customize your steak: ");
                    String str = sc.nextLine();
                    if(str.equals("yes")){
                        steak.customize();
                    }
                    order.add(steak);
                    orderTotal+=steak.getPrice();
                    break;
                case 4:
                    System.out.print("                         *************\n"+
                            "                         *   Order   *\n"+
                            "                         *************\n\n\n");
                    checkout();
                    break;
            }
        }

    }

    public static int printMenu(String title, String[] options){
        for(int i =0; i < title.length()+4;i++){
            System.out.print("*");
        }
        System.out.println();
        System.out.println("* "+title+" *");
        for(int i =0; i < title.length()+4;i++){
            System.out.print("*");
        }
        System.out.print("\n\n\n");

        for(int i =0; i < options.length; i++){
            System.out.println((i+1)+". "+options[i]);
        }

        int choice = -1;
        try{
            choice = sc.nextInt();
        }catch(Exception e){}
        sc.nextLine();

        if (!(choice > 0  && choice <= options.length)){
            clear();
            System.out.print("Invalid choice!\n\n\n");
            choice = printMenu("Aufschnitt Store Menu",options);
        }
        return choice;
    }

    public static void clear(){
        System.out.print("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");
    }

    public void checkout(){
        for(int i =0; i < order.size();i++){
            System.out.println(order.get(i));
        }
        System.out.print("\n\n\n Order Total: $"+orderTotal+"\n");
    }

    public static void main(String[] args){
        Store s = new Store();

    }

}