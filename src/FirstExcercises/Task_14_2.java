package FirstExcercises;
//*Write a Java program to get a substring of a given string between two specified positions.*

//old = The quick brown fox jumps over the lazy dog.
//new = brown fox jumps
public class Task_14_2 {
    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over the lazy dog";
        getSubstring(sentence, (sentence.indexOf("b")), sentence.indexOf("s"));
    }

    public static void getSubstring(String sentence, int startWith, int endWith) {
        System.out.println(sentence.substring(startWith, endWith));
    }
}
