public class Repetition2 {
    public static void main(String[] args) {

        int num = 0;
        while(num<10){
            System.out.print(num+",");
            num += 1;
        }

        System.out.println();

        num = 0;
        while(num<10){
            if(num%2 == 0) {
                System.out.print(num + ",");
            }
            num += 1;
        }

        System.out.println();

        num = 0;
        while(num<20){
            if(num%5 == 0){
                num -= 3;
            }
            System.out.print(num+", ");
            num += 2;
        }

    }
}
