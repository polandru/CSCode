import java.sql.SQLOutput;
import java.util.Scanner;



public class Story {
    /****************************************************
     *Do not touch this part
     * **************************************************/
    Scanner sc = new Scanner(System.in);
    String name = " ";
    String p1 = " ";
    String p2 = " ";

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


    /******************************************************
     * WALTER 2.0 by Miguel V, Garrett D, Kyle D, Jayce P.
     ******************************************************/


    public void start() {
        String Epic = ("Using your epic gamer senses, you and your party lead a methodical assault on the whole base, wiping all military presence, you and each of your party members each acquire an alien homie and goth gf." + "\n" + BRIGHT_GREEN+"Ending III - The Epic Gamer"+RESET);
        String Criminal = ("You wake up in the back of a musty police car. The officer says, “Hey, you, you’re finally awake!”. Once you arrive at the jail, you can hear Tekashi mumble rapping to the other inmates. You are given a life sentence and live in jail for the rest of your depressing life." + "\n" + BRIGHT_GREEN+"Ending IV - The Criminal"+RESET);
        String SCP = ("You leave the crater that once was the legendary air force base and take a Kyle’s Mustang to Rachel, Nevada where you share your story with the world and become an internet legend. The US Military is actively looking for you." + "\n" + BRIGHT_GREEN+ "Ending II - SCP"+RESET);
        String Journalist = ("You and your remaining party members escape with the camera to show the world the secrets of Area 51. You and your party become very popular journalists and live a fairly comfortable life." + "\n" + BRIGHT_GREEN+"Ending I - The Journalist"+RESET);
        print("The date is September 20, 2019. You are at the area 51 gate, awaiting command to initiate the infamous raid. Weeaboos and furries are lined up from what you can tell is about half a mile from Area 51. You can smell the rancidity of the bronies and neckbeards naruto running right beside you.");
        System.out.println("");
        System.out.println(BRIGHT_GREEN + "A. Search the building" + RESET);
        System.out.println(BRIGHT_GREEN + "B. Wait for a command" + RESET);
        String ans = sc.nextLine();
        if (ans.equalsIgnoreCase("B")) {
            System.out.println("You sit and wait for what feels like hours. After standing waiting for orders for 3 days straight, you die of thirst" + "\n" + BRIGHT_RED + "YOU DIED" + RESET);
        }
        if (ans.equalsIgnoreCase("A")) {
            print("One of your party members finds an old Polaroid camera, scrunchie, and a receipt from Claire’s.");
            System.out.println("");
            System.out.println(BRIGHT_GREEN + "A. Take pictures of the base" + RESET);
            System.out.println(BRIGHT_GREEN + "B. Bribe a guard outside of the building with the scrunchie so he will let you have access to the rest of the base" + RESET);
            String ans2 = sc.nextLine();
            if (ans2.equalsIgnoreCase("A")) {
                print("After taking several low quality shots of the base you upload them to Instagram and get jailed for life");
                System.out.println("");
                print(Criminal);
            } else {
                print("The guard at the front gate of the base hesitantly snaches the scrunchie and grants you access to the rest of the base. What will you do next?");
                System.out.println("");
                System.out.println(BRIGHT_GREEN + "A. Enter one of the large testing rooms" + RESET);
                System.out.println(BRIGHT_GREEN + "B. Enter a room with the inscription SCP on the door" + RESET);
                String ans3 = sc.nextLine();
                if (ans3.equalsIgnoreCase("A")) {
                    print("You find no aliens but you do find a file cabinet marked " + RED + "TOP SECRET ALIEN FILES AND STUFF" + RESET);
                    System.out.println("");
                    System.out.println(BRIGHT_GREEN + "A. Take pictures of the contents" + RESET);
                    System.out.println(BRIGHT_GREEN + "B. Leave the file cabinet and go deeper into the room" + RESET);
                    String ans4 = sc.nextLine();
                    if (ans4.equalsIgnoreCase("A")) {
                        System.out.println("You take pictures");
                        System.out.println(BRIGHT_GREEN + "A. Take More Pictures" + RESET);
                        System.out.println(BRIGHT_GREEN + "B. Leave the base with the pictures you have" + RESET);
                        String ans5 = sc.nextLine();
                        if (ans5.equalsIgnoreCase("A")) {
                            print("A strike team of three marines kick in the door, one holsters his rifle and hits a fat nae nae");
                            System.out.println("");
                            System.out.println(BRIGHT_GREEN + "A. Applaud him because it was a good nae nae" + RESET);
                            System.out.println(BRIGHT_GREEN + "B. Throw your camera at the marines and run" + RESET);
                            String ans6 = sc.nextLine();
                            if (ans6.equalsIgnoreCase("A")) {
                                print("The Marine who hit the fat nae nae bows, and signals for the other Marines to stand down, he then leads your party to the front gates of the base and wishes you a safe trip back to wherever you came from");
                                System.out.println("");
                                print(Journalist);
                            } else {
                                print("The camera shattered in a disappointing cloud of smoke. The Marine who hit the nae nae stood, shook his head, looked at the two Marines behind him and snapped his fingers. The two other Marines raised their weapons and sawed your party in half with automatic shotguns." + "\n" + BRIGHT_RED + "YOU DIED" + RESET);
                                System.out.println("");

                            }
                        } else {
                            System.out.println("");
                            print(Journalist);
                        }
                    } else {
                        print("A figure wearing a U.S. Marine uniform and a helmet inscribed with " + YELLOW + "100" + RESET + " slaughters you and your party with a bipod knife");
                        System.out.println("");
                        print(BRIGHT_RED + "YOU DIED" + RESET);
                    }
                } else {
                    print("There is a humanoid figure in the room, it makes a gurgling noise, extends a boney white finger, pointing at the door, you turn around, the door explodes and a team of five masked figures open fire on the figure, the figure produces an ear-piercing screech and lunges for you, it explodes all around you, killing all your party members and sparing only you.");
                    System.out.println("");
                    print(SCP);
                }
            }
        } else {
            if (ans.equalsIgnoreCase("b")) {
                System.out.println(" ");
            } else {
                print(Epic);
            }
        }
    }
}
