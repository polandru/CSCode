import java.util.Scanner;

public class Story {
    /****************************************************
     *Do not touch this part
     * **************************************************/
    Scanner sc = new Scanner(System.in);
    boolean plays_fortnite;
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
//        print("This is normal text");
//        pause();
//        print("This is some "+RED+"c"+BLUE+"o"+YELLOW+"l"+CYAN+"o"+PURPLE+"r"+RESET+"ful text");
//        System.out.println();
//        pause();
//        print("You can also have "+BRIGHT_BG_PURPLE+BRIGHT_WHITE+"background"+RESET+" colors");
//        pause();
//        System.out.println();
//        System.out.print("Gracelynn and Claire were arrested by the ");
//        flash(BG_RED+"COPS",BG_BLUE+"COPS"," at a Post Malone concert");
//        pause();
//        crawl("BREAKING NEWS: Mr Perdomo is really tired!");
//        System.out.println();
//
//
//        print("Asking a question. choice1 or choice2:");
//        String ans = sc.nextLine();
//        if(ans.equalsIgnoreCase("choice1")){
//            choice1();
//        }else{
//            choice2();
//        }

        print(BRIGHT_BG_WHITE + BLACK + "You're asleep, dreaming, you feel oddly comfortable, you're walking down a dimly lit street." + "\n");
        print(BRIGHT_BG_WHITE + BLACK + "A Hooded figure approaches you, you can't seem to make out his face." + "\n");
        print(BG_RED + BLACK + "All of a sudden, he grabs your face with a grip of steel, despite this, he whispers to you" + RESET + "\n" + "\n");

        print(RED + "Do you play fortnite?(Y/N)"+RESET);

        String ans = sc.nextLine();
        if(ans.equalsIgnoreCase("Y"))
            plays_fortnite = true;
        else
            plays_fortnite = false;

        WAKEUP();


    }
    public void WAKEUP(){
        if (plays_fortnite = true) {
            print("You wake up peacefully, there's a whole day ahead of you.");
            schoolOrComputer();
        }

        if (plays_fortnite = false) {
            print("You wake up feeling as if you were in a terrible nightmare, you are sweating all over. \n  A heavy bead of sweat drops down your chin");
            schoolOrComputer();


        }
    }

    public void schoolOrComputer(){
        print("What do you do now? Go to school or go to the computer?(C/S)");
        String ans = sc.nextLine();
        if(ans.equalsIgnoreCase("S")){
            school();
        }else{
            computer();
        }
    }

    public void computer(){
        print("You boot up your old computer, you've had it for awhile."+"\n"+"You can browse the web or play Fortnite, which one do you choose?(F/B)");
        String ans = sc.nextLine();
        int num=0;
        if(ans.equalsIgnoreCase("B")){
            num = (int)Math.random()*100;

            if(num <26){
                print(GREEN + "One of your Friends messages you on AOL. He says:'hey man wanna play some fortnite' he sent it at 11 a' clock last night" + RESET);
            }

            if(num>25 && num <51){
                print(GREEN + "Looks like everyone is talking about the new Fortnite tournament, the grand prize is one hundred million dollars" + RESET);
            }

            if(num>50 && num <76 ){
                print(GREEN + "Uh Oh! You clicked on a funny looking add and almost downloaded a virus, luckily your antivirus stopped you." + RESET);
            }

            if(num>76){
                print(GREEN + "You browse some Minecraft mods, you download some cool ones to try out later" + RESET);
            }

        }
    }

    public void school(){

    }


}
