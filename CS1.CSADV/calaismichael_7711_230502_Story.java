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


            System.out.println("It's a Thursday night, the varsity scout team is playing their rivals, The Inbreds. Their team is fierce with hella dumb people strength. ");
            System.out.println();
            print("The ball is kicked off and you start on the 30 yard line. What play do you run pass or run");
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("choice1")) {
                pass1();
            } else {
                run1();
            }
        }

        public void pass1() {
            System.out.println("pass: failure you threw it to mowery and he dropped it.");
            pause();
            print("Its second and 13 or second and 10 do you run or pass \n");
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("choice1")) {
                run2();

            } else {

                pass2();
            }
        }


        public void run1() {
            System.out.println("Run: failure they tackle you in the backfield and its 2nd and 13\n");
            pause();
            print("Its second and 13 or second and 10 do you run or pass \n");
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("choice1")) {
                pass2();
            } else {


                run2();

            }
        }

        public void run2() {
            System.out.println("\n" +
                    " Run: success, it’s now 1st and 10 on the 45yd line\n");
            pause();
            print("its 1st and 10, do you run or pass");
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("choice1")) {
                run3();
            } else {

                pass3();


            }
        }


        private void pass2() {
            System.out.println("\n" +
                    (" Pass: success you throw a touchdown \n"));
            pause();
            print("its 1st and 10, do you run or pass");
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("choice1")) {
                run3();
            } else {

                pass3();


            }


        }

        private void pass3() {
            System.out.println("\n" +
                    "Pass: success you throw a touchdown ");
            pause();
            print("end of the line");


        }


        private void run3() {
            System.out.println("\n" +
                    "Run: success, it’s now 1st and 10 on the 45yd line\n");
            pause();
            print("its 1st and 10, do you run or pass");
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("choice1")) {
                run4();

            } else {

                pass4();

            }
        }


        private void run4() {
            System.out.println("\n" +
                    "Run:Run touchdown \n");
            pause();

            System.out.println("You kick the ball off and pin them on their 20");

            pause();

            System.out.println("They get a few 1st downs but your team forced them to kick a field goal, it's now 7-3");
            pause();
            System.out.print("End of 1st quarter");

            pause();

            System.out.print("beginning of second quarter");

        }


        private void pass4() {
            System.out.println("\n" +
                    "Run:Run touchdown \n");
            pause();
            print("its 1st and 10, do you run or pass");
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("choice1")) {

                run5();

            } else {

                pass5();

            }

        }

        private void run5() {
            System.out.println("\n" +
                    "Run:Run touchdown \n");
            pause();
            print("its 1st and 10, do you run or pass");
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("choice1")) {

                run5();

            } else {

                pass5();

            }
        }


        private void pass5() {
            System.out.println("\n" +
                    "Run:Run touchdown \n");
            pause();
            print("1st down on the 25yd line,  do you pass or run");
            String ans = sc.nextLine();
            if (ans.equalsIgnoreCase("choice1")) {

                run5();

            } else {

                System.out.print(" touchdown");
            }


            }
    }