package FirstExcercises;
//*Write a Java program to check whether two String objects contain the same data.*
//"Stephen Edwin King" equals "Walter Winchell"? false
//"Stephen Edwin King" equals "Mike Royko"? false
public class Task_10 {
    public static void main(String[] args) {
checkIfIdenticalIgnoreCase("Stephen Edwin King", "Walter Winchell");
checkIfIdenticalIgnoreCase("Stephen Edwin King", "Mike Royko");
checkIfIdenticalIgnoreCase("Oleksand", "oleksand");
checkIfIdentical("Oleksand", "oleksand");
    }
    public static void checkIfIdenticalIgnoreCase(String first, String second){
        System.out.println(first.equalsIgnoreCase(second));
    }
    public static void checkIfIdentical(String first, String second){
        System.out.println(first.equals(second));
    }


}
