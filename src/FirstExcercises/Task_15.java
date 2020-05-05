package FirstExcercises;
//*Write a Java program to convert all the characters in a string to lowercase.*
public class Task_15 {
    public static void main(String[] args) {
        String sentence = "BUILD STRENGTH BODY WITH STRENGTH-BOOSTING YOGA";
        convertString(sentence);
    }
    public static void convertString(String sentence){
        System.out.println(sentence.toLowerCase());
    }
}
