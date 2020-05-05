package FirstExcercises;

//*Write a Java program to compare a given string to another string, ignoring case considerations*.
//"Stephen Edwin King" equals "Walter Winchell"? false
//"Stephen Edwin King" equals "stephen edwin king"? true
public class Task_11 {
    public static void main(String[] args) {
checkIfIdenticalIgnoreCase("Stephen Edwin King", "Walter Winchell");
checkIfIdenticalIgnoreCase("Stephen Edwin King", "stephen edwin king");
    }

    public static void checkIfIdenticalIgnoreCase(String first, String second) {
        System.out.println(first.equalsIgnoreCase(second));
    }
}