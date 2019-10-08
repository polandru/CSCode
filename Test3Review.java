import java.util.Scanner;

public class Test3Review {


    public static void main(String[] args) {
        /*** Section 3 Objects */
        //Question 1
        Student s1 = new Student();
        Student s2 = new Student("Gary","Chase");
        Student s3 = new Student("Melanie","Rapp",18,3323);

        //Question 2
        s2.setLastName("Jacobson");

        //Question3
        s1.setFirstName(s2.getFirstName());
        s1.setLastName(s2.getLastName());

        //Question 4
        System.out.print("First Name:"+s3.getFirstName());
        System.out.println();
        System.out.print("Age:"+s3.getAge());

        //Question 5
        Book b1 = new Book("Fahrenheit 451","Ray Bradbury");
        Book b2 = new Book("Fahrenheit 452","Andrew Perdomo",453);

        //Question 6
        String title = b1.getTitle();
        String author = b1.getAuthor();
        int pages = b1.getNumPages();

        b1.setTitle(b2.getTitle());
        b1.setAuthor(b2.getAuthor());
        b1.setNumPages(b2.getNumPages());//I added the setNumPages method to the class

        b2.setTitle(title);
        b2.setAuthor(author);
        b2.setNumPages(pages);
    }

    public double calcVol(double r, double h){
        double volume = 3.14159*r*r*h;
        return volume;
    }

    public int random(){
        int high = 99999;
        int low = 10000;

        int ans = (int)(Math.random()*(high-low+1))+low;
        return ans;
    }

    public boolean lugageCheck(double length, double width, double height) {

        if (length >= 20) {
            return false;
        }
        if (width >= 20) {
            return false;
        }
        if (height >= 20) {
            return false;
        }
        double volume = length*width*height;

        if(volume>=3000){
            return false;
        }
        return true;
    }

    public String flip(String sentence){
        int first = sentence.indexOf(" ");
        int second = sentence.indexOf(" ",first+1);

        String firstWord = sentence.substring(0,first);
        String secondWord = sentence.substring(first+1,second);
        String rest = sentence.substring(second+1);

        String newSentence =secondWord+" "+firstWord+" "+rest;

        return newSentence;
    }

    public double calculate(double l, double w, double h,String str){
        double ans = 0;
        if(str.equals("volume")){
            ans = l*w*h;
        }
        if(str.equals("surface area")){
            ans = l*h*4 + w*h*2;
        }

        return ans;
    }

    public String part(){
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int length = str.length();
        int n = (int)(Math.random()*length);
        int m = (int)(Math.random()*length);

        String ans ="";
        if(n > m){
            ans = str.substring(m,n);
        }else{
            ans = str.substring(n,m);
        }
        return ans;
    }
}
