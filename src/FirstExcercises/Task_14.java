package FirstExcercises;
//*Write a Java program to get a substring of a given string between two specified positions.*
//
//Sample Output:
//
//old = The quick brown fox jumps over the lazy dog.
//new = brown fox jumps
public class Task_14 {
    public static void main(String[] args) {
replaceSubstring("The quick brown fox jumps over the lazy dog", 10, 25);
    }
    public static void replaceSubstring(CharSequence sentence, int beginIndex, int endIndex){
        System.out.println(sentence.subSequence(beginIndex, endIndex));
    }
}
