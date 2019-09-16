public class Lock {
    private int num1;
    private int num2;
    private int num3;
    private boolean open;

    public Lock(int n1, int n2, int n3){
        num1=n1;
        num2=n2;
        num3=n3;
        open = false;
    }

    public void open(int n1, int n2, int n3){
        if(n1==num1){
            if(n2==num2){
                if(n3==num3){
                    open();
                }
            }
        }
    }

    private void open(){
        open = true;
    }
}
