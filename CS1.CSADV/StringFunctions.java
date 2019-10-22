public class StringFunctions {
    public static void main(String[] args) {
        String str1 = "Hello";
        String str2 = "I went to the store";
        String str3 = "I went to the gym";

        System.out.print(str2.indexOf(str1.substring(1,2)));
        System.out.print(str3.substring(str1.indexOf("o"),10));
        System.out.println(str3.substring(str2.indexOf("t"),str3.indexOf("g")+1));

    }
}
