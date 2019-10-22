public class LoopAssignment {

    public static void main(String[] args) {
        int n = -2;
        while(n<=6){
            System.out.print(n+",");
            n +=2;
        }
        System.out.println();

        n = 1;
        int q =0;
        while(q<5){
            System.out.print(n+",");
            if(n > 0){
                n -= 2;
            }else{
                n += 2;
            }
            q++;
        }
        System.out.println();

        n = 1;
        while(n<=256){
            System.out.print(n+",");
            n *=4;
        }
        System.out.println();

        n =1;
        int ind = 0;
        while(ind<9){
            System.out.print(n+",");
            n+=2;
            ind++;
            if(ind%3==0){
                n -= 3;
            }
        }
        System.out.println();
        n = 0;
        int add = 1;
        while(n<=15){
            System.out.print(n+",");
            n += add;
            add++;
        }
        System.out.println();

        n = 6;
        while(n<=36){
            System.out.print(n+",");
            if(n%2 == 0){
                n -=3;
            }else{
                n *= 4;
            }
        }
        System.out.println();

        n = 1;
        int index =0;
        while(n < 5){
            System.out.print(n+",");
            index++;
            if(index%4 == 0){
                n += 1;
            }
        }
        System.out.println();

        int num1 = 1;
        int num2 = 1;

        System.out.print(num1+","+num2+",");
        while((num1+num2)<=21){
            int num  = num1+ num2;
            System.out.print(num+",");
            num1 = num2;
            num2 = num;
        }
    }
}
