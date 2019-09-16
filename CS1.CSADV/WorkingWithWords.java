public class WorkingWithWords {

    public static void main(String[] args){
        String sentence = "All cats are evil!";

        System.out.println("My sentence is "+sentence.length()+" characters long");

        System.out.println("The word cat is in the sentence: "+sentence.contains("cat"));
        System.out.println("The word dog is in the sentence: "+sentence.contains("dog"));
        System.out.println("I am angry! "+sentence.toUpperCase());

        System.out.println("The first c in the sentence is at: "+sentence.indexOf("c"));
        System.out.println("The first a in the sentence is at: "+sentence.indexOf("a"));
        System.out.println("The first x in the sentence is at: "+sentence.indexOf("x"));
        System.out.println("The first are in the sentence is at: "+sentence.indexOf("are"));

        System.out.println(sentence.substring(4));
        System.out.println(sentence.substring(9));

        System.out.println("Evil is at:"+sentence.indexOf("evil"));

        System.out.println(sentence.substring(0,13)+"awesome!");

        String str1 = "mhs";
        String str2 = "MHS";
        String str3 = "mhs";

        boolean str1eqstr2 = str1.equals(str2); // Checks whether string 1 equals string 2
        boolean str1eqstr3 = str1.equals(str3); // Checks whether string 2 is equal to string 1

    }
}
