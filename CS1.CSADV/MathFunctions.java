public class MathFunctions{

    public static void main(String[] args) {
        MathFunctions math = new MathFunctions();
        math.run();
    }

    public void run(){

        //4+5
        int ans = add(4,5);
        System.out.println("4+5="+ans);

        //4*5+7
        ans = multiply(4,5);
        ans = add(ans,7);
        System.out.println("4*5+7="+ans);

        //(4+5)*2
        ans = add(4,5);
        ans = multiply(ans,2);
        System.out.println("(4+5)*2="+ans);

        //(5*12)/2
        ans = multiply(5,12);
        ans = divide(ans,2);
        System.out.println("(5*12)/2="+ans);

        //(24-13)*2+(20/4+3)
        ans = subtract(24,13);
        ans = multiply(ans,2);
        int ans2 = divide(20,4);
        ans2 = add(ans2,3);
        ans =add(ans,ans2);
        System.out.println("(24-13)*2+(20/4+3)="+ans);

    }

    public int add(int a, int b){
        int answer = a+b;
        return answer;
    }

    public int multiply(int a, int b){
        int answer = a*b;
        return answer;
    }

    public int divide(int a, int b){
        int answer = a/b;
        return answer;
    }

    public int subtract(int a, int b){
        int answer = a-b;
        return answer;
    }
}
