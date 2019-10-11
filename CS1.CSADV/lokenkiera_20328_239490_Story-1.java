import java.util.Scanner;

    public class Story  {
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
            (new Story()).start();
        }

        /******************************************************
         * Your code starts below
         ******************************************************/
        public void start() {
            print("It's a dark night a small group of people all from the same school but by no means friends end up getting kidnapped by a mysterious figure and put into a room. This is no ordinary room though, it's an escape room where "+BRIGHT_RED+"the cost of not escaping. Is your life."+RESET+"\n");
            pause();
            print("Who will you choose to take hold of this situation? Alex or Braxten:");
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("Alex")){

                Alex();
            } else {
                Braxten();
            }
        }


        public void Alex(){
            System.out.println("Sensing the rising panic Alex speaks up. “Everyone stay calm we’re going to make it out of this, we just have to work together.” Less worried the group begins to look around to maybe find something to break down the door. Alex spots an axe hanging on the wall, he cautiously stalks towards it. Suddenly a small “ping” rings out and spikes rise from the ground to impale him, "+CYAN+"miraculously he manages to escape the worst of it but his leg still gets hit"+RESET+", and starts bleeding profusely. Anna who hasn’t moved because of shock, comes back to reality and sees Alex in pain. More sympathetic than her counterparts she rushes to his side. Having some basic knowledge of how to stop bleeding she wonders if she should let it sit or fashion a tourniquet.\n");
            pause();

            print("Will she let him sit or will she fashion a tourniquet? Let sit or fashion a tourniquet:");
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("Let Sit")){
                Let();
            }else{
                Tourniquet();
            }
        }

        public void Let(){
            System.out.println("The bleeding continues and just as Anna realizes her mistake it's too late. So engrossed with Alex she hadn’t realized that the other two people already managed to get killed by spikes, and Alex was going to die any second now. After a minute it was all done Anna was alone. A voice comes on the speakers saying that she had done it and it was time for her reward. The room began filling with water and Anna quickly died.\n");
        }

        public void Tourniquet() {
            System.out.println("Tearing off a piece of her long dress Anna fashions a tourniquet, stopping the worst of Alex’s bleeding. Victoria and Braxton also recover in this time, panicked Victoria gets out her phone to call for help from her friends ,not even attempting to help Alex. Realising that there’s no service a rage fills her and she throws her phone at the ground. Braxton who’s still not fully grasping the situation asks “well then how are we going to get out?” Ever the strong one Alex provides that he thinks this is an escape room. Then after observing the room he notices some inconspicuous things in the corners of the room, a basket full of letters and a small tool box.\n");
            pause();

            print("Will they go to the basket of letters or the small tool box? Letters or Tool Box:");
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("Letters")) {
                Letters();
            } else {
                ToolBox();

            }
        }

        public void Letters(){
            System.out.println("Alex starts towards the corner with the box of letters. He has everyone help him open everyone of them searching for even the slightest him on a way to get out of there. The voice over the speaker comes on “You thought I would make it that easy. *chuckles* Well that’s where you are wrong”.  Anna starts to slump down in the corner landing on a bed of spikes. Everyone turns away and Victoria turns to look in the toolbox as Anna starts to slowly bleed out. Distraught but not completely out of hope the group tries to find another way. Alas it is of no use after an hour of madness they commit suicide one by one.\n");
            pause();

        }

        public void ToolBox(){
            System.out.println("Victoria heads to the toolbox first peering inside and carefully removing each tool while handing them to Braxton to hold. Braxton looks up from the tools and sees a spot of blood on the walls next to a few openings that resemble some of the tools.Now properly enthused the group attempts to match them perfectly. Without one slip up they complete the task and the wall behind them and to their left open up.\n");
            pause();

            print("Will they go to the left or will they go behind them? Left or Behind:");
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("Left")){
                Left();
            }else{
                Behind();
            }
        }

        public void Left(){
            crawl("They all decide to head left and are immediately killed by spikes.");
            System.out.println();
        }

        public void Behind() {
            System.out.println("They all decide to head behind them the start running. Out of options and out of time they run Alex who is slow because of his wound is left behind to the darkness swallowed up and lost forever. In the tunnel Victoria, Braxton, and Anna feel hope. Then out of the wall tacks start shooting Anna who was in the middle escaped the worst of it the others were not so fortunate. Collapsing to the ground their bodies are taken into the building by trap door. " + RED + "Running even harder " + BG_BLACK + RED + "Anna finally makes it outside" + RESET + " " + RED + "into a beautiful " + RESET + "");
            flash(BRIGHT_BG_RED+BLACK+"sunrise",BRIGHT_BG_YELLOW+WHITE+"sunrise","Recognizing where she is she starts running towards the nearest police station. But somethings wrong everything seems too perfect somehow and Anna starts lose consciousness. The tacks had been poisonous and though the dosage was small, it was extremely powerful. She collapses in the street.");
        }
        public void Braxten(){
            System.out.println("Not at all intimidated by the threat of the room Braxton confidently strides to the door. “Do you all honestly think this is real, I mean come on things like this don’t actually happen.” Right as he attempts to open the “door” it shoots out 10 spikes that instantly kill him. "+BG_BLACK+WHITE+"Staying suspended for a moment the spikes slowly recede letting his limp bloody body collapse onto the floor."+RESET+"The group is frozen with disbelief panic takes over and they begin to frantically grab and reach for whatever they can find. Somehow in some way Alex finds the key, he then: being smart: finds two different places to put it. The vent or the trap door in the floor.\n");
            pause();

            print("Will they go through the Vent or the Trapdoor? Vent or Trapdoor:");
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("Vent")){
                Vent();
            }else{
                Trapdoor();
            }
        }


        public void Vent(){
            System.out.println("Desperate to leave Alex thrusts the key into the vent key hole,then the key disintegrates. The vent bangs open revealing a red light and screams of agony. With no other options Alex takes the lead with the others close behind."+YELLOW+" After what seems like an eternity of constant crawling, crawling, and crawling Alex looks behind him only to find that the two girls aren’t there."+RESET+" Weeks later police search the building and find three starved bodies lost in the vents.\n");
        }

        public void Trapdoor(){
            System.out.println("Thinking that the trap door might actually be the way out Alex puts the key in and turns it. It opens up and leads down. What's left of the group heads down into the dark tunnel, at the end of the tunnel there’s a light. Overjoyed they run towards it only to run face first into a television screen. It falls over to reveal the actual way out, again but more cautiously they hurry to it. All of a sudden they feel darkness and immense pain. Having fallen into a pit of poison they all slowly drown.\n");
        }


    }

