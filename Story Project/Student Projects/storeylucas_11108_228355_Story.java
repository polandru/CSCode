
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
    public void start() {
        print("It is 11:00 PM in New York City. Rain bounces off of the top of the cab that Sheriff Bigby Wolf is riding in. He received a call from a Fable telling him that it was urgent but he was told no more than that. “Can you hurry it up? I'm kind of in a rush.” said Bigby. “Sorry sir traffic is bad but I could let you off here, you'd get there earlier but you would be all wet.” \n");
        System.out.println();
        print("Does Bigby exit in the cab?");
        String ans = sc.nextLine();
        if (ans.equalsIgnoreCase("yes")) {
            exitCab();
        } else {
            stayinCab();
        }

    }
    public void exitCab(){
        print("Bigby exits the cab and begins the walk to the address he was told to appear at. Fifteen minutes later and he arrives at an apartment complex. According to the call he received the room that called him was on the second floor. After walking up the door he sees that it is slightly ajar.\n");
        System.out.println();
        print("Does Bigby wait by the door?");
        String ans = sc.nextLine();
        if (ans.equalsIgnoreCase("yes")) {
            waitbyDoor();
        }else{
            runInside();
        }
    }
    public void stayinCab(){
        print("Bigby waits in the cab for thirty minutes because the traffic was bad. He gets out of the car and walks into the apartment complex. After walking up to the second floor he sees the door wide open, peering inside he sees furniture strewn about.\n");
        System.out.println();
        print("Does Bigby wait by the door?");
        String ans = sc.nextLine();
        if (ans.equalsIgnoreCase("yes")) {
            waitbyDoor();
        }else{
            runInside();
        }
    }
    public void waitbyDoor(){
        print("Waiting by the door Bigby hears a crash and decides to run in. Looking around the room he sees that it is in shambles. Looking at the window he sees that it is shattered. Running to the window he sees that someone has jumped out.\n");
        System.out.println();
        print("Does Bigby jump out of the window or run inside?");
        String ans = sc.nextLine();
        if (ans.equalsIgnoreCase("run inside")) {
            rundownStairs();
        }else{
            jumpoutWindow();
        }
    }
    public void runInside(){
        print("Running inside Bigby is tackled by a large man in a plaid shirt. After getting back up he contemplates jumping out the window.");
        System.out.println();
        print("Does Bigby jump out of the window or run inside?");
        String ans = sc.nextLine();
        if (ans.equalsIgnoreCase("run inside")) {
            rundownStairs();
        }else{
            jumpoutWindow();
        }
    }
    public void rundownStairs(){
        print("Running down the stairs Bigby watches in "+RED+"Anger"+RESET+" as the man tears a car door off with a massive axe. The man gets inside and drives off. “Darn.” says Bigby. “Took too long.”");
        System.out.println();
        print("Bigby walks inside and talks to the hotel owner. He finds out that the man from the room is a drunk who doesn’t pay his rent and he ran when he saw Bigby enter the building. Bigby waits by the sidewalk for another cab so he can return to his office and start a new case.");
        System.out.println();
        print("The End.");
    }
    public void jumpoutWindow(){
        print("After taking a running "+GREEN+"jump"+RESET+" out of the window Bigby lands on top of the man with a "+YELLOW+"THUD!"+RESET+", knocking him out. After getting up, he realizes that he is staring down at the Woodsman. Yes, the same Woodsman from the Little Red Riding Hood story.\n");
        System.out.println();
        print("After interrogating The Woodsman he finds out that The Woodsman ran because he was drunk and didn’t want to pay rent. Bigby takes him back to the apartment offices and makes him pay up. Bigby walks his way back home after a job well done.\n");
        System.out.println();
        print("The End.");
    }
}