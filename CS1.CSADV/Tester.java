import java.util.Scanner;

public class Tester {

    public static void main(String[] args) {
        Student jane = new Student();
        Student lucas = new Student("Lucas","Storey");
        Student andrea = new Student("Andrea","Llamas",15,2222);

        printNameAndAge(lucas);
        printNameAndAge(andrea);
        printNameAndAge(jane);

        jane.setLastName("Washington");
        WashingtonAdoption(lucas);
        andrea.WashingtonAdoption();

        //Books
        Book  book1 = new Book("The Hunger Games","Suzzanne Collins");
        Book book2  = new Book("Harry Potter: The Phiolosopher's Stone ", "J.K. Rowling", 275);

        studentReadsBook(lucas, book2);
        changeBook(book1);
        System.out.println(book1.getTitle()+" by "+ book1.getAuthor());

    }

    public static void printNameAndAge(Student student){
        System.out.println(student.getFirstName()+" "+student.getLastName()+"\nAge:"+student.getAge());
    }

    public static void WashingtonAdoption(Student student){
        student.setLastName("Washington");
    }

    public static void studentReadsBook(Student st, Book bk){
        System.out.println(st.getFirstName()+" is reading "+bk.getTitle()+" by "+bk.getAuthor());
    }

    public static void changeBook(Book bk){
        Scanner sc = new Scanner(System.in);
        System.out.println(bk.getTitle()+" by "+bk.getAuthor());
        System.out.print("New Title");
        String newTitle = sc.nextLine();
        System.out.print("New Author");
        String newAuthor = sc.nextLine();

        bk.setTitle(newTitle);
        bk.setAuthor(newAuthor);
    }
}
