package FirstExcercises;

//Write a Java method to find the smallest number among three numbers.
public class FirstTask {

    public static void main(String args[]) {
        selectNumber(400, -500, -20);
    }

    public static void selectNumber(int first, int second, int third) {
        if ((first < second) && (first < third)) {
            System.out.println(first);
        } else if ((second < first) && (second < third)) {
            System.out.println(second);
        } else if ((third < first) && (third < second)) {
            System.out.println(third);
        }
    }
}
