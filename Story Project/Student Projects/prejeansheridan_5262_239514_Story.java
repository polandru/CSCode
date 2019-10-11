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
       //The print was giving me some trouble so I replaced some of them with System.out.println.Hope you don't mind sorry!
      public void start() {
            System.out.println("Our story begins at my new boarding school on an abnormally ");
            System.out.println( "bright and sunny day. A large group of friends were having a discussion " );
          System.out.println(  "over lunch.One of them looks at me and started inviting me to sit with " );
          System.out.println( "them. I suppose I should introduce myself: I’m Nyx, a transfer to the " );
          System.out.println( "boarding school , I don’t know anyone here and I am incredibly anxious " );
          System.out.println( "around other people. I moved a lot growing up so I never saw the point " );
          System.out.println( "in making close friends, or any friends for that matter. Because of this" );
          System.out.println( " I immediately began to panic. I saw two obvious options:");


            print("\n" +
                    "What should I do?\n"+GREEN+"Run or Go"+RESET);
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("Run")) {
                System.out.println(" \"People are too scary I’ll just eat alone as I normally would.");
                System.out.println(" Unfortunately at this exact moment the universe decided to remind me that");
                System.out.println(" this isn’t a normal school, nor was I a normal girl. The wall in front of");
                System.out.println(" me suddenly exploded, and a hand suddenly yanked me back just in time to" );
                System.out.println(" avoid the blast. “Are you an idiot?” The girl in front of me had short" );
                System.out.println(" red hair, green eyes, that reminded me of the grassy hill that was next" );
                System.out.println(" to my old home, and pale heavily freckled skin. She couldn’t have been " );
                System.out.println("much taller than five foot one ,and that’s being nice, and she had " );
                System.out.println("black-framed glasses with lenses that reminded me of the bottom of a " );
                System.out.println("glass bottle. If it weren’t for the death glare I was receiving from her " );
                System.out.println("she almost would have reminded me of a mouse or maybe a kitten ,but she " );
                System.out.println("had a glare that very well could have killed a person or at least made " );
                System.out.println("them pass out from sheer terror. The girl sighed causing her short red " );
                System.out.println("curls to bounce like little springs. “So what’s your skill?” She asked " );
                System.out.println("clearly curious, and who could blame her in this school you were labeled" );
                System.out.println(" based off of your gift. “Spiders” suddenly her worst fear was whispered" );
                System.out.println(" into my mind and I’m sure that if I were to try I would be able to probe" );
                System.out.println(" her brain for more. I suppose I should explain that I am able to hear " );
                System.out.println("people's worst fear and some of the little things that they keep hidden" );
                System.out.println(" among other things, but I can’t control it.");
                System.out.print("\nShould I tell het my gift?\n"+GREEN+"do not tell or tell?"+RESET);
                String ans2 = sc.nextLine();
                if(ans2.equalsIgnoreCase("do not tell")){
                    System.out.println("Why don’t you tell me yours first then I may tell you mine.”");
                    System.out.println(" I snapped harsher than I intended, but I knew that even)");
                    System.out.println(" amongst the gifted mine was an oddity. “Oh! Of course how ");
                    System.out.println("rude of me I haven’t even introduced myself!” The red-head");
                    System.out.println(" began now suddenly very chipper, ”Call me Thea.I’m a ");
                    System.out.println("salamander!” That made sense, and it was an ability to be ");
                    System.out.println("proud of. Dragonlings were rare and among them salamanders");
                    System.out.println(" were even more of a rarity. “I see so your a shapeshifter");
                    System.out.println(" who is also capable of pyrokinesis?” I asked Thea even");
                    System.out.println(" though I was already sure what her answer was going to be.");
                    System.out.println(" “Tsk tsk tsk,” She clicked her tongue at me, ”Now I believe ");
                    System.out.println("it is time that you tell me what your skill is!” She looked");
                    System.out.println(" so excited to hear it, not that I blame her meeting new ");
                    System.out.println("people often times led to hearing about new powers. I guess ");
                    System.out.println("I had no choice but to tell her at this point.");
                    Tell();
                }else{
                    Tell();
                }

            } else {
                System.out.println("I’ve been to a lot of schools they can’t be any different right?");
                System.out.println(" I began to walk towards the group when suddenly a had came through the");
                System.out.println(" floor and grabbed me. It started to pull me into the ground. If you’ve" );
                System.out.println(" ever wondered what under a school looks like it’s honestly just REALLY" );
                System.out.println(" dark. There wasn’t a lot of air here and just when I thought I was going" );
                System.out.println(" to pass out from a lack of oxygen I suddenly woke up at home ready to" );
                System.out.println( " restart the day.\n\n");
                print("This is a" + RED + " BAD ENDING\n\n ");



            }
            }

        public void Tell() {
            print("\"“I guess you could say that I’m an odd mix between a psychic and a telepath?”" +
                    "\" I figured that was all she needed to know. What was her name again?" +
                    "\" “Hey Thea!” Another girl and a boy who seemed to be the new girls brother" +
                    "\" ran up to us. Well Thea to be more specific. “Hi there I’m Diana. " +
                    "\"I’m a dragon master.” She beamed. Looking at her it made sense," +
                    "\" most dragonlings had a dragon master who mirrored some of their" +
                    "\" personality. This girl however was tall and muscular ,probably a" +
                    "\" side effect from years of training, she had dark hair and golden " +
                    "\"eyes that seemed to be examining if I was a threat to her. She seemed " +
                    "\"to relax when she noticed that my arms were more like noodles and I was" +
                    "\" so skinny that I looked underfed. “Honestly Diana you’re going to give the" +
                    "\" poor girl heart failure,” The boy finally spoke up in a voice that was " +
                    "\"deeper than I had expected, “ The names Fletcher I’m an amulet master.”" +
                    "\"I was not expecting that one and it must have shown on my face because" +
                    "\" the three of them looked slightly panicked for a moment before remaining" +
                    "\" their composure. “Sorry if this is an odd question ,but are you too" +
                    "\" siblings?” The two looked surprised before bursting into sudden laughter." +
                    "\" “Most people can’t tell that they’re siblings upon meeting them. " +
                    "\"Especially after hearing their talents.” I could understand the talents" +
                    "\" throwing people off, but they were practically identical with the acception" +
                    " of their eye color and Diana having slightly softer features. I opened my mouth" +
                    " to say something but at that moment the bell rang out loudly telling everyone to " +
                    "get to class." +
                    "\"”Well that’s over now we need to get going or else we’ll be late.” " +
                    "\"Fletcher wheezed out winded form all his laughing." +
                    "\"“Yup Thea and I have to get too ‘team bonding class’” Diana rolled her eyes" +
                    "\" as Thea started to drag her away." +
                    "\"I awkwardly waved as Fletcher yelled to them, “If I hear about you " +
                    "\"both being late again I’ll put a gravity spell on you and you won’t be able" +
                    "\" to fly for two weeks.” At that comment the two girls started to move " +
                    "\"faster towards what I can only assume is their class. Now then all I have" +
                    "\" to do is find the principal’s office to pick up my schedule. “Do you need" +
                    "\" help finding the office? The maze can be kinda hard to navigate at first.”" +
                    "\" Fletcher offered. I looked at him confused." +
                    "\"“What maze?” I asked confused. Fletcher turned and pointed at the door to" +
                    "\" what I assumed was the office, but now that I looked there seemed to bn" +
                    "\" hedges moving behind it.");
            System.out.print("\n" + "What should I do?\n"+GREEN+"Accept or Decline"+ RESET);
            String ans3 = sc.nextLine();
            if (ans3.equalsIgnoreCase("Accept")) {
                print("“I think that I’ll take you up on that offer” I said starting to panic a little bit. " +
                        "We walked towards the door and as we got closer I noticed that the wooden door was trembling slightly " +
                        "as though something was pushing against it. “That’s pretty normal but usually it’s nothing dangerous.” " +
                        "Fletcher attempted- poorly -to comfort me. I took a deep breath and opened the door into the hedges. " +
                        "It didn’t take us long to find the office with Fletcher leading us the pixies and fairies in the office didn’t take long to find my schedule and so we were able to get to our class only a few minutes late.\n" +
                        "“Well here it is ‘Magical enchantments and potions 101’” Fletcher and I had this and several of my " +
                        "other class together. As we entered the teacher stopped to look at us, she quickly recognized me as a " +
                        "new student and excused the fact that we were tardy. “Would you like to introduce yourself?”\n");

                System.out.print("Should I introduce myself? Yes or no ");
                String ans5 = sc.nextLine();
                if(ans5.equalsIgnoreCase("Yes")) {
                    print("I quickly stated my name before going to the only empty seat in the" +
                            " class which just so happened to be right behind Fletcher. The class " +
                            "went by quickly as most of the information was review and I had yet to" +
                            " be given supplies. Because I didn’t have my supplies I had no way to" +
                            " be sure of how I was going to get my notes. That was until I heard a" +
                            " voice and three sets of footsteps coming up behind me. It was Diana," +
                            " Thea, and Fletcher holding out a bunch of notes. “Fletch told us that" +
                            " you had no supplies or notes so we decided to help out!” Diana beamed" +
                            " enthusiastically. I wasn’t sure what to say, but I managed to utter a" +
                            " confused “Thanks,” before smiling. This was going to be my last school." +
                            " The school where I would finally make friends.\n");
                }else {
                    print("I stood in silence as their thoughts suddenly began to overwhelm me and the world went dark.\n" +
                            "\n");
                }

            }else{
                decline();
            }
    }

        public void decline() {
            print("“No thank you I’ll be fine on my own.” I said sounding more confident than I actually was. " +
                    "I strode confidently towards the door to the office opened it and waltzed right in.\n" +
                    "It was an hour later and I had no idea where I was when I heard a soft sound. I looked around to see if " +
                    "I could place it and saw a small black cat looking at me it began to scamper away but before it could get " +
                    "too far away it stopped and seemed to beckon me to follow it.\n");

            System.out.print("\n" + "What should I do?\n"+GREEN+"Follow or do not follow"+ RESET);
            String ans5 = sc.nextLine();
            if (ans5.equalsIgnoreCase("Follow")) {
                print("I followed that cat to the office, but it turned out that I wasted the entire day wandering around lost." +
                        " I never made any friends and we ended up moving again.\n\n");
            } else {
                Donotfollow();

            }
        }
        public void Donotfollow() {
            print("I didn’t follow the cat and so I never escaped the maze now my ghost " +
                    "haunts the maze to remind everyone not to get lost in the maze.\n\n ");
        }
    }






