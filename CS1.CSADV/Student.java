public class Student {

    private String firstName;
    private String lastName;
    private int age;
    private int id;

    public Student(){
        System.out.println("Default Constructor");
        firstName = "Jane";
        lastName = "Doe";
        age = 16;
        id = 1;
    }

    public Student(String first, String last){
        System.out.println("Second Constructor");
        firstName = first;
        lastName = last;
        age = 16;
        id = 1;
    }

    public Student (String first, String last, int theAge, int theID){
        System.out.println("Third Constructor");
        firstName = first;
        lastName = last;
        age = theAge;
        id = theID;
    }

    //Getter Methods
    public String getFirstName(){
        return firstName;
    }

    public String getLastName(){
        return lastName;
    }

    public int getAge(){
        return age;
    }

    public int getId(){
        return id;
    }

    //Setter Methods
    public void setFirstName(String first){
        firstName = first;
    }

    public void setLastName(String last){
        lastName = last;
    }

    public void setAge(int theAge){
        age = theAge;
    }

    public void setId(int theID){
        id = theID;
    }

    public void WashingtonAdoption(){
        lastName = "Washington";
    }

    public boolean equals(Student other){
        boolean  answer = other.getId()==id;
        return answer;
    }

    public String toString(){
        String str = firstName+" "+lastName+"\n"+"Age:"+age+"\n"+"ID:"+id;
        return str;
    }

}
