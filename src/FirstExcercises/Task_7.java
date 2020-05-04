package FirstExcercises;
//*Write a Java program to concatenate a given string to the end of another string.*
//
//Sample Output:
//
//String 1: PHP Exercises and
//String 2: Python Exercises
//The concatenated string: PHP Exercises and Python Exercises
public class Task_7 {
    public static void main(String[] args) {
        String firstString = "Alex";
        String secondString = "is a handsome man";
        System.out.println(firstString + " " + secondString);
        System.out.println(firstString.concat(" is awesome"));
    }
}
