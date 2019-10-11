
import java.sql.SQLOutput;
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
        print("Stephanie is planning on going to Coachella. The tickets were expensive, so she is only going with a few friends. Her friends are Abby, Chloe, and Stella. They bought the tickets ahead of time to make sure to get good tickets. They excitedly wait till the flight to California and prepare to have fun. They arrive at the hotel with a spectacular view and wait with exasperation as the next day is Coachella weekend one.");

        System.out.println();
        print("Stephanie is getting ready for the festival and tries to choose an outfit as everyone was outfit ready.They wanted to be the most unique looking at the festival, so they had to brainstorm what will they wear. \n" +
                "Stephanie has the choice of wearing something "+RED+" comfy and breathable"+RESET+" in the California heat "+RESET+" or a" +GREEN +" Mike Wazowski bodysuit"+RESET+" that will completely single her out from the rest of the girls there. What should she wear?\n");
        String ans = sc.nextLine();
        if(ans.equalsIgnoreCase("comfy and breathable")) {
           something();
        }else{
            mikewazoskibodysuit();

      } }
        public void something()  {
            print("Everyone is lining up to get into the festival and . They enter the festival and immediately start trying to get the best lighting for their instagram pics to showcase how cool they are to their thousands or friends. Abby is going to take everyone's pictures as she has a photography major at the University of Houston. Abby tries to take Chloe’s picture as she notices a dog in the background going number two. Abby has a choice to either kick the dog out of the frame or leave the dog in the frame and wait till Chloe sees.Should she"+PURPLE+" kick the dog"+RESET+" or"+YELLOW+" leave the dog"+RESET);
            String ans = sc.nextLine();
            if(ans.equalsIgnoreCase("Kick the dog") ){
                kickthedog();
                }else{
            leavethedog();}
    }


    public void mikewazoskibodysuit(){
        print("Stephanie chooses to wear the Mike Wazowski bodysuit and heads out the door ready to take an uber to the festival. Everyone is excited and ready to see Justin Bieber perform his number one single “Baby”");
        pause();
        print("Everyone is lining up to get into the festival and Stephanie and her friends. They enter the festival and immediately start trying to get the best lighting for their instagram pics to showcase how cool they are to their thousands or friends. Abby is going to take everyone's pictures as she has a photography major at the University of Houston. Abby tries to take Chloe’s picture as she notices a dog in the background going number two. Abby has a choice to either kick the dog out of the frame or leave the dog in the frame and wait till Chloe sees.Should she"+PURPLE+" kick the dog"+RESET+" or"+YELLOW+" leave the dog"+RESET);
        String ans = sc.nextLine();
        if(ans.equals("kick the dog")){

            kickthedog();
        }else{
            leavethedog();
        }
    }

    public void kickthedog(){
        print("Abby kicks the dog and takes the picture making sure Chloe’s best angles are shown. \n");
        print("Stephanie and her friends gets as close as possible to the stage when Justin Bieber is going to perform.They have waited since 2009 to able to see Justin Bieber sing “Baby” live. She remembers how excited she was seeing Justin Bieber at a restaurant once shortly after the time he had been detained for illegally racing his cars.Should they"+BLUE+" yell"+RESET+" or"+CYAN+" stay silent"+RESET);
        String ans = sc.nextLine();
        if(ans.equalsIgnoreCase("yell")){
            print("Justin Bieber notices them and says hi.  the end");
        }else{
            print("Justin Bieber makes them shed a tear from his beautiful performance and the they live happily ever after the end" +
                    "");
        }
    }

    public void leavethedog(){
        print("Abby leaves the dog on the frame and shows Chloe the picture afterward and they both have a good laugh.\n");
        print("Stephanie and her friends gets as close as possible to the stage when Justin Bieber is going to perform.They have waited since 2009 to able to see Justin Bieber sing “Baby” live. She remembers how excited she was seeing"+PURPLE+" Justin Bieber"+RESET+" at a restaurant once shortly after the time he had been detained for illegally racing his cars.Should they"+BLUE+" yell"+RESET+" or"+CYAN+" stay silent"+RESET);
        String ans = sc.nextLine();
        if(ans.equalsIgnoreCase("yell")){
            print("Justin Bieber notices them and says hi. All the girls live happily ever after the end");
        }else{
            print("Justin Bieber makes them shed a tear from his beautiful performance and they live happily ever after the end");
        }

    }

}





