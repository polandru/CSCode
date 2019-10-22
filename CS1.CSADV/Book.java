public class Book {
    private String title;
    private String author;
    private int numPages;

    public Book(String theTitle, String theAuthor){
        System.out.println("First Constructor");
        title = theTitle;
        author = theAuthor;
        numPages = 0;
    }

    public Book(String theTitle, String theAuthor, int np){
        System.out.println("Second Constructor");
        title = theTitle;
        author = theAuthor;
        numPages =np;
    }

    public String getTitle(){
        return title;
    }

    public String getAuthor(){
        return  author;
    }

    public int getNumPages(){
        return  numPages;
    }

    public void setTitle(String newTitle){
        title = newTitle;
    }

    public void setAuthor(String newAuthor){
        author = newAuthor;
    }

    public void addPages(int number){
        numPages += number;
    }

    public void setNumPages(int n){
        numPages=n;
    }

    public String toString(){
        String str = "Title:"+title+"\nAuthor:"+author+"\nPages:"+numPages;
        return str;
    }
}
