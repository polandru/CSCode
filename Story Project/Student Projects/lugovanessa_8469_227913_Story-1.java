import java.awt.*;
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

    public void start() {
        print("Beep!Beep!Beep! Jessica’s alarm buzzed. She got out of bed and started getting for the day at school.\n");
        pause();
        print("Jessica stood examining her closet, wondering what she should wear to school today. She picks: Choice1: floral dress Choice2: vintage outfit Choice3:Band tee \n" +
                "\n\n");
        String ans = sc.nextLine();
        if (ans.equalsIgnoreCase("Floral Dress")) {
            Outfit();
        }
        if (ans.equalsIgnoreCase("Vintage outfit")) {
            Outfit();
        }
        if (ans.equalsIgnoreCase("Band tee")) {
            Outfit();


        }
    }

        public void Outfit () {
            print("Jessica starts her school day like normal, doing her hair and makeup and stopping at Starbucks before school for iced coffee. When Jessica gets to school, she meets her friend Emma to catch up on all the events of the last 12 hours that they had been apart. \n" +
                    "\n");
            pause();
            print("OMG I love your outfit!” Emma says to Jessica. ");
            pause();
            print("“Thank you so much! I got it last weekend!” Jessica responds.\n");
            pause();
            print("“Hey are you going to Ashley’s party tonight?” Emma asks Jessica. ");
            pause();
            print("“Umm I don’t know about that Em Ashley hates me” responds Jessica.\n");
            pause();
            print("“What! That's definitely not true and anyyyyway Aiden will be there”\n" +
                    "\n");
            pause();
            print("Jessica responds…\n" +
                    "“Emma, I really don’t think that’s a good idea” (No) or “Okay why not! It can’t be that bad”(Yes)\n" +
                    "\n");
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("No")) {
                No();
            } else {
                Yes();
            }
        }
        public void No () {
            print("“Okay well what do you want to do tonight?” Emma asks.\n" +
                    "\t“Why don't we go see a movie and have a sleepover?” Jessica asks.\n" +
                    "\t“Okay sounds like fun!”\n");
            pause();
            print("The two girls had a sleepover and watched cheesy rom coms all night.");
        }
        public void Yes () {
            print("That night Emma comes over to Jessica’s house so they can get ready for the party together. Jessica’s little sister comes in to spy on them.\n\t“What are you two doing?” Piper asks\n\t“That’s none of your business.” Jessica responds.\n“Are you going to a party??” Piper asks again.\n“Why does it matter to you?” Jessica says.\n“Take me with you or I’m telling Mommy!!” \n“Oh don\'t you dare!”\n\nThe two sisters start yelling at each other.\n");
            pause();
            print("Jessica’s mom comes into Jessica’s room to see what all the commotion is about. \n" +
                    "“Mom, Piper is trying to ruin our plans!” Jessica whines.\n" +
                    "“Well what are your plans?”\n" +
                    "“Em and I were going to go to Ashley’s party tonight.”\n" +
                    "“Jes, I don’t think that’s a good idea. It’s really dangerous this late and we all know what happens at highschool parties.” Jessica’s mom says.\n" +
                    "“Fineee I guess we just won’t go then” Jessica tells her mom.\n");
            pause();
            print("After Piper and Jessica’s mom leave her room the two sit looking at each other.\n" +
                    "“Do you still want to go to the party?”\n No let's just listen to my mom(No) or Yeah let's just sneak out the window(Sneakout)");
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("No")) {
                No();
            } else {
                SneakOut();
            }


        }
        public void SneakOut(){
            print("“Okay let’s do it” Emma says.\n");
            pause();
            print("The two girls sneak out the window to go to Ashley’s party. \n" +
                    "When they arrive, there is loud music and bright lights coming out from Ashley’s house.\n" +
                    "The two girls go inside the house and immediately become the life of the party.\n");
            pause();
            print("Jessica and Emma spent the next hour care free, focused on having fun rather than worrying about what anyone else was doing. One of Emma’s other friends came over and pulled her away from Jessica. Jessica stood alone by the snack table. She scrolled through her phone to try to look busy when someone bumped into her unexpectedly. \n");
            pause();
            print("“Hey, lonely” the boy said.\n" +
                    "“Hi” Jessica responded with a tight lipped smile. She knew exactly who this boy was: Tyler Mitchem, the football team captain. \n" +
                    "You look like you could use a drink” Tyler slurred. \n" +
                    "“Umm no thanks” Jessica told him. \n" +
                    "“No really take it” Tyler pushed a cup into her hand. \n");
            print("Jessica….\n" +
                    "pushes the cup back at Tyler, making it spill all over him.(Push) \t\n" +
                    "turns around and throws the drink in the trash(Trash)\n" +
                    "says “Fine what’s the harm(Drink)”\n");
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("Push")) {
                Push();
            }
                if (ans.equalsIgnoreCase("Trash")) {
                    Trash();
                }
                    if (ans.equalsIgnoreCase("Drink")) {
                        Drink();
                    }

        }

        public void Push () {
            print(" “You did not just do that to me!” Tyler yells.\n" +
                    "“Tyler, leave me alone! I don’t want your drink and I don’t want you around me!” Jessica storms away from Tyler as he yells profanities at her back.\n" +
                    "As Jessica pushes her way toward the bathroom, she sees Ashley chewing out Tyler about how he just treated her. She turns quickly and slams face first into the person in front of her. \n");
            pause();
            print("“Please just get away from me,” Jessica says. She looks up to realize who she just exploded at.\n" +
                    "“Hey. I’m sorry I’m really not trying to cause any problems” Aiden says. \n" +
                    "“Oh no- I’m sorry- I didn’t mean to-” Jessica stutters. \n" +
                    "“It’s really not an issue” Aiden says. “I saw what Tyler did to you and he’s a real douche for it.”\n" +
                    "“Tell me about it” Jessica says. \n" +
                    "“You seem really shaken up. Maybe you should go home”\n" +
                    "“That's probably for the best”\n");
            pause();
            print("“I have to find Emma first, though”\n" +
                    "“Emma? I’m pretty sure she left with Chris half an hour ago.”\n" +
                    "Jessica checked her phone to see 2 missed calls and 5 texts all from Emma.\n" +
                    "\t“OMG I’m talking to Chris!!”\n" +
                    "\t“He wants me to leave with him!!!”\n" +
                    "\t“Do you care if I go with him?”\n" +
                    "\t“What’s wrong why aren’t you answering??”\n" +
                    "\t“Chris is taking me home so I’ll see you tomorrow xx”\n" +
                    "Jessica takes a second to respond to Emma’s text before telling Aiden “Okay then let’s get out of here.”\n");
            pause();
            print("Aiden walks Jessica to his truck and helps her in. Jessica spends most of the ride staring out the window and when they pull into her driveway she finally turns to look at Aiden. \n" +
                    "“Thank you for taking me home. I really appreciate it.” Jessica says.\n" +
                    "“I would do anything for you,” Aiden tells Jessica, leaning in.\n");
            print("Jessica…\n" +
                    "leans in toward Aiden.(lean) \n" +
                    "or smiles and looks at Aiden before finally getting out of his truck and going inside her house.(Smile)\n");
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("Lean")) {
                Lean();
            } else {
                Smile();
            }
        }


        public void Trash () {
            print("“I have to get out of here” Jessica mutters to herself. She heads inside toward where Emma and her friends went. As she searches for Emma in the house, she runs face first into a tall brunette boy. \n" +
                    "“Oh my bad” the boy says.\n" +
                    "Jessica looks up to see exactly who she’s talking to and is greeted by the kind eyes of Aiden, the boy from her economics class. \n" +
                    "“Aiden. Hi” is all Jessica can manage to say. \n" +
                    "“Hi Jessica,” Aiden responds. “Are you okay? I saw what Tyler did to you out here.”\n" +
                    "“Honestly no. I’m just ready to go home.”\n" +
                    "“I get that. I’m about to head out and I can take you home if you want me to.”\n" +
                    "“I would really like that”\n");
            pause();
            print("“I have to find Emma first, though”\n" +
                    "“Emma? I’m pretty sure she left with Chris half an hour ago.”\n" +
                    "Jessica checked her phone to see 2 missed calls and 5 texts all from Emma.\n" +
                    "\t“OMG I’m talking to Chris!!”\n" +
                    "\t“He wants me to leave with him!!!”\n" +
                    "\t“Do you care if I go with him?”\n" +
                    "\t“What’s wrong why aren’t you answering??”\n" +
                    "\t“Chris is taking me home so I’ll see you tomorrow xx”\n" +
                    "Jessica takes a second to respond to Emma’s text before telling Aiden “Okay then let’s get out of here.”\n");
            pause();
            print("Aiden walks Jessica to his truck and helps her in. Jessica spends most of the ride staring out the window and when they pull into her driveway she finally turns to look at Aiden. \n" +
                    "“Thank you for taking me home. I really appreciate it.” Jessica says.\n" +
                    "“I would do anything for you,” Aiden tells Jessica, leaning in.\n");
            print("Jessica…\n" +
                    "leans in toward Aiden.(lean) \n" +
                    "or smiles and looks at Aiden before finally getting out of his truck and going inside her house.(Smile)\n");
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("Lean")) {
                Lean();
            } else {
                Smile();
            }
        }
        public void Drink () {
            print("Jessica takes the drink from Tyler. After she finishes it, she realizes how sick it made her. Aiden walks into the bathroom and finds Jessica curled up on the floor. \n" +
                    "“Im so sorry- woah are you okay?” Aiden says.\n" +
                    "Jessica tries to speak but can’t.\n" +
                    "“Oh we need to get you home. Lets go”\n" +
                    "Aiden finds Emma and takes them both to his truck. He drops the two girls off at Jessica’s house.\n" +
                    "“You’re a really good guy, Aiden. Thank you” Emma says\n");
            pause();
            print("Jessica wakes up to an Emma beside her and a text from aiden.\n" +
                    "\t“Hey I really hope you’re okay. I’m thinking about you. Give me a call when you get this”\n" +
                    "“OMG what happened last night?” Jessica asks Emma.\n");
            pause();
            print("“Oh you will never believe it.” Emma says\n");
        }
        public void Smile () {
            print("Jessica collapses onto her bed and immediately falls asleep. She wakes up to notifications flashing on her cellphone screen.\n");
            pause();
            flash(BG_CYAN + BLACK + "4 new messages", BLACK + "4 new messages", " "
            );
            pause();
            print("\tAiden:  “I really enjoyed last night. Maybe we can get lunch today. Give me a call when you get this :)”\n");
            pause();
            print("Emma: “OMG AIDEN TOOK YOU HOME SO HAPPY FOR YOU”\n" +
                    "\t“WHY DIDN'T YOU TELL ME”\n" +
                    "\t“CALL ME ASAP”\n");
            pause();
            print("Jessica smiles to herself and starts responding to the texts she received. \n" +
                    "\n");
        }
        public void Lean () {
            print(" Aiden and Jessica lock eyes with their faces inches from each other. Both of their eyes close and they kiss. When they finally pull away from each other Jessica can’t hide her smile. They sit staring at each other for a few minutes until Jessica finally says. “I should really get inside. Goodnight, Aiden. Thank you so much”\n" +
                    "“Goodnight” Aiden says, awestruck.\n");
            pause();
            print("Jessica collapses onto her bed and immediately falls asleep. She wakes up to notifications flashing on her cellphone screen.\n");
            pause();
            flash(BG_CYAN + BLACK + "4 new messages", BLACK + "4 new messages", " ");
            pause();
            print("\tAiden: “I’m sorry about what happened at the party last night, but I’m glad you let me take you home. I would love to get to know you better. We should get dinner some time.”\n");
            pause();
            print("\tEmma: “OMG AIDEN TOOK YOU HOME SO HAPPY FOR YOU”\n" +
                    "\t“WHY DIDN'T YOU TELL ME”\n" +
                    "\t“CALL ME ASAP”\n");
            pause();
            print("Jessica smiles to herself and starts responding to the texts she received");
        }
    }
