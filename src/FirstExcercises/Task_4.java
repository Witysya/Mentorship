package FirstExcercises;

//Write a java method which takes a number from
// 1 - 7 and prints day of week(for 1 monday). Use switch
public class Task_4 {
    public static void main(String[] args) {
        dayOfWeek(4);
        dayOfWeek(1);
    }

    public static void dayOfWeek(int day) {

        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
        }
    }
}

