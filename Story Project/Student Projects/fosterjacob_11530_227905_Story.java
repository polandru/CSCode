import java.sql.SQLOutput;
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
    public void start() {//jacob foster and gracia ledezma project p2
        print("You are a Big Wolf in a tiny rural town where you became a vegan because you didn’t believe in eating other animals.");
        print(" There are also multiple different animals such as Moose, Beavers, Sheep, and Pigs.");
        print("One day one of the Pigs ask you if they could barrow your " + YELLOW + "GOLDEN!! " + RESET + " bathtub?");
        print("Do you lend the pig your " + YELLOW + "GOLDEN!! " + RESET + "bathtub? (Yes or No?)");
        String ans = sc.nextLine();
        if (ans.equalsIgnoreCase("Yes")) {
            YES();
        } else {
            NO();
        }
    }

    public void YES() {
        System.out.println("You give the pig your " + YELLOW + "golden " + RESET + "bathtub to the little pig.");
        System.out.println();
        print("After a whole week of working you decide you want your golden bathtub back because you want to take a bath. This entire week they haven’t even mentioned that they are going to give it back, so you start to get worried. Should you go confront the pigs about it, steal it back, or get the cops? (confront, steal, or cops)");
        String ans2 = sc.nextLine();
        if (ans2.equalsIgnoreCase("confront")) {
            confront();
        } else {
            if (ans2.equalsIgnoreCase("steal")) {
                steal();
            } else {
                if (ans2.equalsIgnoreCase("cops")) {
                    cops();
                }
            }
        }
    }

    public void NO() {
        System.out.println("You say sorry but no, and you send the pig on his way.");
        System.out.println();
        print("Eventually after a hard week of work you want to take a bath. You get home and see your " + YELLOW + "golden " + RESET + "bathtub missing!!!!");
        System.out.println("You believe that the pig has taken it! will you confront the pig steal your tub back or get the cops?(confront, steal, or cops)");
        String ans2 = sc.nextLine();
        if (ans2.equalsIgnoreCase("confront")) {
            confront();
        } else {
            if (ans2.equalsIgnoreCase("steal")) {
                steal();
            } else {
                if (ans2.equalsIgnoreCase("cops")) {
                    cops();
                }
            }
        }
    }

    public void confront() {
        print("You go and confront the pigs about stealing your bathtub. When you get there You ask them if they have your bathtub they said ‘we don’t have it.’ when your on your way out, you see that they have become wealthier.");
        print(RED + "GAMEOVER" + RESET);
    }

    public void steal() {
        print("You go back to the pigs house to steal the bathtub back. There are two options for you to take 1. Sneak through the back door or 2. try and Blow the house down(back/blow)");
        String ans2 = sc.nextLine();
        if (ans2.equalsIgnoreCase("back")) {
            back();
        } else {
            if (ans2.equalsIgnoreCase("blow")) {
                blow();
            }
        }
    }

    public void cops() {
        print("The");
        flash(BG_RED + "COPS", BG_BLUE + "COPS", " investigate the house, but they end up finding nothing. what to do? (steal/confront)");
        String ans2 = sc.nextLine();
        if (ans2.equalsIgnoreCase("confront")) {
            confront();
        } else {
            if (ans2.equalsIgnoreCase("steal")) {
                steal();
            }
        }
    }

    public void blow() {
        print("It doesn’t work your a wolf not mother nature. And she strikes you down with a tree the size of a sky scrapper!");
        print(RED + "GAMEOVER" + RESET);
    }

    public void back() {
        print("You try too sneak in through the backdoor but it’s locked. You can either break the Lock or try the Window(Lock/Window)");
        String ans2 = sc.nextLine();
        if (ans2.equalsIgnoreCase("door")) {
            door();
        } else {
            if (ans2.equalsIgnoreCase("window")) {
                window();
            }
        }
    }

    public void door() {
        print("You try too sneak in through the backdoor but it’s locked. You can either break the Lock or try the Window(lock/Window)");
        String ans2 = sc.nextLine();
        if (ans2.equalsIgnoreCase("lock")) {
            lock();
        } else {
            if (ans2.equalsIgnoreCase("window")) {
                window();
            }
        }
    }
    public void lock() {
        print("You find a rock to break the lock with, but make a loud sound ‘someone might have heard’ when you walk in there is nothing in the living room. There are 2 places you can go to look for your tub. Either the bathroom or the Basement (Bathroom/Basement)");
        String ans2 = sc.nextLine();
        if (ans2.equalsIgnoreCase("bathroom")) {
            bathroom();
        } else {
            if (ans2.equalsIgnoreCase("basement")) {
                basement();
            }
        }
    }

    public void window(){
    print("The window is open ‘there is no glass in the window’ There are 2 places you can go to look for your tub. Either the bathroom or the Basement (Bathroom/Basement)");
    String ans2 = sc.nextLine();
        if (ans2.equalsIgnoreCase("bathroom")) {
            bathroom();
        } else {
            if (ans2.equalsIgnoreCase("basement")) {
                basement();
            }
        }
    }

    public void bathroom() {
        print("When you go to the bathroom someone hears you so you hide behind the curtain while in YOUR Golden Bathtub, You can Eat the pig to not get caught or Stay hidden.(Eat/Stay)");
        String ans2 = sc.nextLine();
        if (ans2.equalsIgnoreCase("eat")) {
            eatbath();
        } else {
            if (ans2.equalsIgnoreCase("stay")) {
                staybath();
            }
        }
    }

    public void basement() {
        print("You go to the basement,and someone hears you, so you go in and hide, You can either eat him to not get caught or stay hidden(Eat/Stay)");
        String ans2 = sc.nextLine();
        if (ans2.equalsIgnoreCase("eat")) {
            eatbase();
        } else {
            if (ans2.equalsIgnoreCase("")) {
                staybase();
            }
        }
    }
    public void eatbath() {
        print("You surprise the pig and gobble him up whole and you find your tub and go home later to be arrested by the police, but hey you got your tub back.");
        print(RED + "GAMEOVER" + RESET);
    }
    public void staybath() {
        print("The pig knows your there and tries to run but falls and a bookshelf falls on him and he dies. You take your bathtub and sneak out.");
        print(RED + "GAMEOVER" + RESET);
    }
    public void eatbase() {
        print("You surprise the pig and gobble him up whole and you find your tub and go home later to be arrested by the ");
        flash(BG_RED + "POLICE!", BG_BLUE + "POLICE!","At least you got your "+YELLOW+"GOLDEN! "+RESET+"bathtub back.");
                print(RED + "GAMEOVER" + RESET);
    }
    public void staybase() {
        print("You stay there, but the pig finds you and knocks you out and you wake up over an open fire being stared at by all the pigs smiling menacingly they say that was your last mistake.");
        print(RED + "GAMEOVER" + RESET);
    }
}