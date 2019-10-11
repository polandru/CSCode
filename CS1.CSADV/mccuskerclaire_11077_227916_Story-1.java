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

        print("Our story begins at a high school like any other-"+BLUE+"The Idiot Academy"+RESET+"- on a bright and sunny day. As you sit by yourself in the cafeteria, an unfamiliar face approaches. An average height lanky, white kid, with hair matted into what might be cornrows is standing in front of you waiting for acknowledgment.");
        print("Do you talk to him?");
        String ans = sc.nextLine();

        if(ans.equalsIgnoreCase("yes")){
            talk();
        }else{
            noTalk();
        }
    }

    public void talk(){
        print("you say hi \n" +
                "He responds: “I suppose I should introduce myself: "+YELLOW+"I’m Bentley"+RESET+", a transfer to"+BLUE+ "The Idiot Academy"+RESET+", I don’t know anyone but my dad is Post Malone.” Then, he starts belting out better now. You’re kinda scared and back away slowly. You don’t think his dad is actually Post Malone. \n" +
                "\n");
        print("As you walk into your first class of the day, chemistry, you see that kid is sitting in the seat right next to yours. \n" +
                "\n" +
                "Do you sit by him or move seats?\n");
        String ans = sc.nextLine();

        if(ans.equalsIgnoreCase("yes")) {
            sitDown();
        }else {
            dontSit();

        }


    }
    public void sitDown() {
        print("You resume your conversation from this morning and really hit it off. You even become partners for a group project!Later on that day, you see Bentley sitting alone at lunch. \n" +
                "Do you- Go sit with him,or\n" +
                "Ignore his depressing presence? \n\n");
        String ans = sc.nextLine();

                if(ans.equalsIgnoreCase("yes")) {
                    goSit();
                }else{
                    dontGoSit();

                }
    }

    public void goSit() {
        print("Bentley looks up with tears in his eyes and says"+BLUE+" “Thanks man, I owe you one.”"+RESET+" You and Bentley exchange snapchat usernames and decide to hang out this weekend at a concert. Bentley said his dad will go with you and him...At the concert you and Bentley are talking and he mentions he has a tiktok. He then proceeds to peer pressure you into making a tik tok with him. \n" +
                "Do you give in?  or Refuse and sit in awkward silence the rest of the concert? \n");
        String ans = sc.nextLine();

        if(ans.equalsIgnoreCase("yes")) {
            giveIn();
        }else{
            dontGiveIn();

        }

    }
    public void giveIn() {
        print("You and Bentley go viral, get verified on tiktok, and become an unstoppable internet duo (similar to Logan and Jake paul, but funnier/cooler) Two very attractive females see you making an e-boy tiktok and like what they see. Once you tell them about your dads, they are instantly impressed and get your snapchats. The females are now you and Bentley’s girlfriends. You date one for 3 years and get married as soon as you turn 18. Bentley does the same with his girl. Unfortunately, you all die in a very dramatic plane crash on your way to honeymoon together in Barbados.  \n");

    }
    public void dontGiveIn() {
        print(" Bentley comes to the ultimate conclusion that you are lame. Unfriends you, and never hangs out with you again. As he becomes more and more tiktok famous, you become more and more depressed. Ultimately, you die. Post Malone’s son killed you RIP JAH.   \n");

    }
    public void dontGoSit() {
        print(" Bentley begins to sob and runs out of the cafeteria. Little did you know you just lost the best friend you ever could’ve had. You never talk to Bentley again. Bentley never makes any friends because no one will believe his dad is actually Post Malone. Bentley becomes depressed and dies. You killed Post Malone’s son.  Life resumes being a dull throb and you never find another friend quite as great as he was.");
    }


    public void dontSit(){
        print(" you move seats you never really see him and  "+RED+"Bevin(the highschool bully)"+RESET+"grabs you and gives you a very painful noogie and you automatically regret your decision.You never talk to Bentley again. Bentley never makes any friends because no one will believe his dad is actually Post Malone. Bentley becomes depressed and dies. "+RED+"You killed Post Malone’s son. The end"+RESET);

    }


    public void noTalk(){
        print("You look at your phone mindlessly to avoid his gaze. \n" +
                "The unidentified kid continues to light an unidentified smoking object and belts out better now. You slowly back away hoping he is not dangerous.  \n");
        print("As you walk into your first class of the day, chemistry, you see that kid is sitting in the seat right next to yours. \n" +
                "\n" +
                "Do you sit by him?\n");
        String ans = sc.nextLine();

        if(ans.equalsIgnoreCase("yes")) {
            sit();
        }else {
            noSit();

        }

    }

    public void sit(){
        print("You decided to sit by the new kid and since you didn’t say hi earlier yall dont talk and it gets really awkward until he shows you his first face tattoo. He says his dad did it for him \n" +
                "Do you ask about his dad or just end the conversation by saying “cool”?\n");
        String ans = sc.nextLine();

        if(ans.equalsIgnoreCase("yes")) {
            ask();
        }else{
            dontAsk();

        }


    }
    public void noSit(){
        print("You move seats you never really see him and "+RED+ "Bevin(the highschool bully)"+RESET+" grabs you and gives you a very painful noogie and you automatically regret your decision.You never talk to Bentley again. Bentley never makes any friends because no one will believe his dad is actually Post Malone. Bentley becomes depressed and dies. You killed Post Malone’s son. The end\n");


    }


    public void ask(){
        print("you ask the kid about his dad- he replies that he’s into the music industry and travels a lot.You talk a little about your family and then the teacher starts role call.\n" +
                " \n" +
                "It is then that the teacher gets down to Bentleys name and the teacher calls out “Bentley Malone”. At the mention of “Malone” the entire class turns around and stares at him.\n" +
                "Do you either smile proudly sitting by your new bsf or sit there just as surprised as everyone else?\n");
        String ans = sc.nextLine();

        if(ans.equalsIgnoreCase("yes")) {
            smile();
        }else{
            dontSmile();

        }

        }

    public void dontAsk(){
        print("If you end the conversation the story ends and you go on with your regular life never talking to Bentley again. Bentley never makes any friends because no one will believe his dad is actually Post Malone. Bentley becomes depressed and dies. You killed Post Malone’s son. The end");

    }

public void smile(){
    print(" you smile proudly and support Bentley he looks at you and smiles back and you automatically become friends.\n" +
            "Do you invite him to your house after school or just ask for his snap?\n");
    String ans = sc.nextLine();

    if(ans.equalsIgnoreCase("invite him")) {
        invite();
    }else{
        dontInvite();
    }


}

public void dontSmile(){
    print(" you sit there gaping, Bentley looks to you for support but sees you gaping and shuns you. You never get to go to a concert and Bentley purposely makes the rest of your highschool experience trash as he becomes friends with everyone and never forgives you for not having his back. Not only that but you become enemies.The end.\n");




}

public void invite(){
    print("If you invite him to your house he comes over and is really polite and gets along with all your friends. After he invites you to a 21 savage concert that his dad is opening as a favor.\n" +
            "\n" +
            "Do you go or spend the night at home working on homework?\n");
    String ans = sc.nextLine();

    if(ans.equalsIgnoreCase("yes")) {
        go();
    }else {
        dontGo();

    }




        }

    public void dontInvite(){
        print("If you just ask for his snap yall keep a streak and snapchat frequently but miss out on becoming best friends and are only friends. The end");

        }
    public void go(){
        print("If you go to the concert you meet not only Post Malone but 21 savage and all their friends. You and Bentley have a great time and post the entire concert from backstage on your snapchat stories. Yall have fun and Posty (as he lets you call him) drops you off at home in a brand new bentley. You and Bentley become life time best friends going on different adventures with each other and even stay in touch and visit each other in college and adulthood. You win at life.");

    }

    public void dontGo(){
        print("If you spend your night at home doing homework he takes someone else and they become really good friends with him while you become only an acquaintance. The end.");


    }


        }


