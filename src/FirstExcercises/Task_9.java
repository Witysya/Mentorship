package FirstExcercises;


//*Write a Java program to check whether
// a given string ends with the contents of another string.*
public class Task_9 {
    public static void main(String[] args) {
        checkCharacters("Viktoriia", "Oleksandr");
    }

    public static void checkCharacters(String first, String second) {
        boolean firstBoolean = first.endsWith("a");
        boolean secondBoolean = second.startsWith("a");



/*        if (firstBoolean == secondBoolean) {
            System.out.println("First and Last character are the same");
        } else {
            System.out.println("They are not the same");
        }*/
    }

}
