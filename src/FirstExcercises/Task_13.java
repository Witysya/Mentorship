package FirstExcercises;
//*Write a Java program to replace all the 'd' characters with 'f' characters*

public class Task_13 {
    public static void main(String[] args) {
replaceMethod("doddored",'d', 'f');
    }
    public static void replaceMethod(String word, Character prevChar,Character futureChar ){
        System.out.println(word.replace(prevChar, futureChar));
    }
}
