package FirstExcercises;

public class Task_9_2 {
    public static void main(String[] args) {
        compareChars("Viktoriia", "Anna");
    }

    public static void compareChars(String firstName, String secondName) {

        char lastChar = firstName.charAt(firstName.length() - 1);
        char firstChar = secondName.charAt(0);
        firstChar = Character.toLowerCase(firstChar);
        lastChar = Character.toLowerCase(lastChar);


        if (lastChar == firstChar) {
            System.out.println("They are the same");
        } else
            System.out.println("They are different");
    }
}
