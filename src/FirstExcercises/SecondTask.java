package FirstExcercises;

public class SecondTask {
    //Write a Java program to calculate the sum of two integers and return true if the sum is equal to a third integer
    public static void main(String args[]) {
        boolean output= calculateNumber(20, 30, 50);
        System.out.println(output);
    }

    public static boolean calculateNumber(int first, int second, int third) {
        int sum = first + second;
        if (sum == third) {
            return true;
        }
        return false;
    }

}

