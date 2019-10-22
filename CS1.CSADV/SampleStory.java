import java.util.Scanner;

public class SampleStory {
    /****************************************************
     *Do not touch this part
     * **************************************************/
    Scanner sc = new Scanner(System.in);
    public static final String RESET  = "\u001B[0m";
    public static final String BLACK  = "\u001B[30m";
    public static final String RED    = "\u001B[31m";
    public static final String GREEN  = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE   = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN   = "\u001B[36m";
    public static final String WHITE  = "\u001B[37m";

    public static final String BRIGHT_BLACK  = "\u001B[90m";
    public static final String BRIGHT_RED    = "\u001B[91m";
    public static final String BRIGHT_GREEN  = "\u001B[92m";
    public static final String BRIGHT_YELLOW = "\u001B[93m";
    public static final String BRIGHT_BLUE   = "\u001B[94m";
    public static final String BRIGHT_PURPLE = "\u001B[95m";
    public static final String BRIGHT_CYAN   = "\u001B[96m";
    public static final String BRIGHT_WHITE  = "\u001B[97m";

    public static final String BG_BLACK  = "\u001B[40m";
    public static final String BG_RED    = "\u001B[41m";
    public static final String BG_GREEN  = "\u001B[42m";
    public static final String BG_YELLOW = "\u001B[43m";
    public static final String BG_BLUE   = "\u001B[44m";
    public static final String BG_PURPLE = "\u001B[45m";
    public static final String BG_CYAN   = "\u001B[46m";
    public static final String BG_WHITE  = "\u001B[47m";

    public static final String BRIGHT_BG_BLACK  = "\u001B[100m";
    public static final String BRIGHT_BG_RED    = "\u001B[101m";
    public static final String BRIGHT_BG_GREEN  = "\u001B[102m";
    public static final String BRIGHT_BG_YELLOW = "\u001B[103m";
    public static final String BRIGHT_BG_BLUE   = "\u001B[104m";
    public static final String BRIGHT_BG_PURPLE = "\u001B[105m";
    public static final String BRIGHT_BG_CYAN   = "\u001B[106m";
    public static final String BRIGHT_BG_WHITE  = "\u001B[107m";


    public void flash(String text1,String text2, String textAfter){

        for(int i=0;i<10; i++) {
            System.out.print(text1);
            System.out.print(RESET+textAfter);
            try {
                Thread.sleep(200);
            }catch(Exception e){}
            erase(text1+textAfter);
            System.out.print(text2);
            System.out.print(RESET+textAfter);
            try {
                Thread.sleep(200);
            }catch(Exception e){}
            erase(text2+textAfter);

        }
        System.out.print(RESET+text1+RESET+textAfter);

    }

    public void crawl(String text){

        int length = text.replaceAll("\u001B\\[.+m","").length();
        int spaces =60-length;
        for(int i = 0;i<spaces;i++){
            text += " ";
        }
        System.out.print(text);
        for(int i=0;i <60;i++){
            try {
                Thread.sleep(150);
            }catch(Exception e){}
            erase(text);
            text = text.substring(59,60)+text.substring(0,59);
            System.out.print(text);
        }
    }

    public void erase(String str){
        String str2 ="";
        str = str.replaceAll("\u001B\\[.+m","");
        for(int i=0;i<str.length();i++){
            str2+="\b";
        }
        System.out.print(RESET+str2);
    }

    public void pause(){
        System.out.println(RESET+"\n"+GREEN+"Press enter to continue...\n"+RESET);
        sc.nextLine();
    }

    public static void printChar(String str){
        System.out.println(BRIGHT_BLUE+str+":"+RESET);
    }

    public static void print(String str){
        int width = 60;
        while(str.length()>0){
            if(str.length()>width) {
                String part = str.substring(0,width);
                int last = part.lastIndexOf(" ");
                str = str.substring(last+1);
                System.out.println(part.substring(0,last));
            }else {
                System.out.print(str);
                str="";
            }

        }
    }

    public static void main(String args[]) {
        (new SampleStory()).start();
    }

    /******************************************************
     * Your code starts below
     ******************************************************/
    public void start() {
        print("I woke up today at 5 am. I picked the light blue shirt, and black pants");
        System.out.println();
        print("What route should I take to work? East or West");
        String ans = sc.nextLine();
        if(ans.equalsIgnoreCase("east")){
            print("I tried to outrun the train but failed\n\n");
            print("The End");
        }else{
            westRoute();
        }
    }

    public void westRoute(){
        print("I am passing the gas station. They sell breakfast tacos.\n\n");
        print("Should I get one?Yes or No");
        String ans = sc.nextLine();
        if(ans.equalsIgnoreCase("yes")){

            tacos();
        }else{
            noTacos();
        }
    }

    public void tacos(){
        print("Oops, I got food poisoning\n");
        print("I'm very sick. I don't know if I should go to the hospital or stay at home");
        String ans = sc.nextLine();
        if(ans.equalsIgnoreCase("go")){
            print("I get an antibiotic-resistant resistant infection and die\n\n The End");
        }else{
            print("I recover and live happily ever after\n\n The End");
        }
    }

    public void noTacos(){
        print("I get to work. I have a great day! Should I go to Chick-fil-a to celebrate?");
        String ans = sc.nextLine();
        if(ans.equalsIgnoreCase("Yes")){
            tacos();
        }else{
            print("I get home. I grade some papers. I watch some TV. I go to bed \n\n The End");
        }

    }

}
