import java.util.Scanner;

public class Story {
    /****************************************************
     *Do not touch this part
     * **************************************************/
    Scanner sc = new Scanner(System.in);
    public static final String RESET = "\u001B[0m";
    public static final String BLACK = "\u001B[30m";
    public static final String RED = "\u001B[31m";
    public static final String GREEN = "\u001B[32m";
    public static final String YELLOW = "\u001B[33m";
    public static final String BLUE = "\u001B[34m";
    public static final String PURPLE = "\u001B[35m";
    public static final String CYAN = "\u001B[36m";
    public static final String WHITE = "\u001B[37m";

    public static final String BRIGHT_BLACK = "\u001B[90m";
    public static final String BRIGHT_RED = "\u001B[91m";
    public static final String BRIGHT_GREEN = "\u001B[92m";
    public static final String BRIGHT_YELLOW = "\u001B[93m";
    public static final String BRIGHT_BLUE = "\u001B[94m";
    public static final String BRIGHT_PURPLE = "\u001B[95m";
    public static final String BRIGHT_CYAN = "\u001B[96m";
    public static final String BRIGHT_WHITE = "\u001B[97m";

    public static final String BG_BLACK = "\u001B[40m";
    public static final String BG_RED = "\u001B[41m";
    public static final String BG_GREEN = "\u001B[42m";
    public static final String BG_YELLOW = "\u001B[43m";
    public static final String BG_BLUE = "\u001B[44m";
    public static final String BG_PURPLE = "\u001B[45m";
    public static final String BG_CYAN = "\u001B[46m";
    public static final String BG_WHITE = "\u001B[47m";

    public static final String BRIGHT_BG_BLACK = "\u001B[100m";
    public static final String BRIGHT_BG_RED = "\u001B[101m";
    public static final String BRIGHT_BG_GREEN = "\u001B[102m";
    public static final String BRIGHT_BG_YELLOW = "\u001B[103m";
    public static final String BRIGHT_BG_BLUE = "\u001B[104m";
    public static final String BRIGHT_BG_PURPLE = "\u001B[105m";
    public static final String BRIGHT_BG_CYAN = "\u001B[106m";
    public static final String BRIGHT_BG_WHITE = "\u001B[107m";


    public void flash(String text1, String text2, String textAfter) {

        for (int i = 0; i < 10; i++) {
            System.out.print(text1);
            System.out.print(RESET + textAfter);
            try {
                Thread.sleep(200);
            } catch (Exception e) {
            }
            erase(text1 + textAfter);
            System.out.print(text2);
            System.out.print(RESET + textAfter);
            try {
                Thread.sleep(200);
            } catch (Exception e) {
            }
            erase(text2 + textAfter);

        }
        System.out.print(RESET + text1 + RESET + textAfter);

    }

    public void crawl(String text) {

        int length = text.replaceAll("\u001B\\[.+m", "").length();
        int spaces = 60 - length;
        for (int i = 0; i < spaces; i++) {
            text += " ";
        }
        System.out.print(text);
        for (int i = 0; i < 60; i++) {
            try {
                Thread.sleep(150);
            } catch (Exception e) {
            }
            erase(text);
            text = text.substring(59, 60) + text.substring(0, 59);
            System.out.print(text);
        }
    }

    public void erase(String str) {
        String str2 = "";
        str = str.replaceAll("\u001B\\[.+m", "");
        for (int i = 0; i < str.length(); i++) {
            str2 += "\b";
        }
        System.out.print(RESET + str2);
    }

    public void pause() {
        System.out.println(RESET + "\n" + GREEN + "Press enter to continue...\n" + RESET);
        sc.nextLine();
    }

    public static void printChar(String str) {
        System.out.println(BRIGHT_BLUE + str + ":" + RESET);
    }

    public static void print(String str) {
        int width = 60;
        while (str.length() > 0) {
            if (str.length() > width) {
                String part = str.substring(0, width);
                int last = part.lastIndexOf(" ");
                str = str.substring(last + 1);
                System.out.println(part.substring(0, last));
            } else {
                System.out.print(str);
                str = "";
            }

        }
    }

    public static void main(String args[]) {
        (new Story()).start();
    }

    /******************************************************
     * Your code starts below
     ******************************************************/
    public void start() {
        System.out.println(" ");
        System.out.println(BLACK+"Your vision adjust to the new room that you are in.");
        System.out.println("You thought you did everything right, yet you somehow made a mistake.");
        System.out.println("The room seems to be empty.");
        pause();
        System.out.println("You need to find a way out of the room");

        print("Should you:" + RED + "1) Stay in the room " + BLACK + "or " + GREEN + "2) Leave the room");
        String ans = sc.nextLine();
        if(ans.equalsIgnoreCase("1")){
            start();
        }else{
            Part2();
        }
    }

    public void Part2(){
        System.out.println(BLACK+"You exit the room and enter a semi-busy office.");
        System.out.println("You walk to see everyone in the room and you find Jim.");
        System.out.println("You know Jim will be dying today so you need to save him.");
        pause();

        print("Should you: "+ GREEN + "1) Grab Jim and take him out of the office "+BLACK+"or "+RED+"2) Leave Jim alone");
        String ans = sc.nextLine();
        if(ans.equalsIgnoreCase("1")){
            Part3();
        }else{
            start();
        }

    }
    public void Part3(){
        System.out.println(BLACK+"You take Jim out and tell him about his death.");
        System.out.println("To protect him, you go to your car and grab the gun out of the console.");
        System.out.println("You need to find out how Jim dies.");
        pause();

        print("Should you: ");
        print(GREEN+"1) Take Jim to a Psychic ");
        print(BLACK+"or ");
        print(RED+"2) Not care enough to find out and leave");
        String ans = sc.nextLine();
        if(ans.equalsIgnoreCase("1")){
            Part4();
        }else{
            start();
        }
    }
    public void Part4(){
        System.out.println(BLACK+"You walk into the psychic's office.");
        System.out.println("You ask if the psychic can tell you your future.");
        System.out.println("The psychic says she can tell you your future...");
        pause();
        System.out.println("for the price of $500.");

        print("Should you: ");
        print(RED+"1) Leave because of the outrageous price ");
        print(BLACK+"or ");
        print(GREEN+"Pay the $500 to save your friend Jim");
        String ans = sc.nextLine();
        if(ans.equalsIgnoreCase("1")){
            start();
        }else{
            Part5();
        }

    }
    public void Part5(){
        System.out.println(BLACK+"The Psychic sits you down to tell you your future.");
        System.out.println("She tells you that Jim will die.");
        pause();
        System.out.println("She says you kill him.");
        System.out.println("You ask how to save his life");
        System.out.println("She tells there is only one way to save hi life...");
        pause();
        System.out.println("You must die to save Jim");
        System.out.println("You take your gun out, ready to shoot either you or Jim");

        print("Should you: ");
        print(GREEN+"1) Kill yourself to save Jim ");
        print(BLACK+"or ");
        print(RED+"Kill Jim to save yourself");
        String ans = sc.nextLine();
        if(ans.equalsIgnoreCase("1")){
            start();
        }else{
            conclusion();
        }
    }
    public void conclusion(){
        System.out.println(BLACK+"The psychic stands in awe that you would kill your friend.");
        System.out.println("She made the whole thing up about you having to kill him.");
        pause();
        System.out.println("You a selfish and twisted person for killing your friend to 'save' your life");
    }
}


