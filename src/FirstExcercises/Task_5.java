package FirstExcercises;

//Write a Java program to check whether an given integer is a power of 4 or not.
//Given num = 64, return true. Given num = 6, return false.
public class Task_5 {
    public static void main(String[] args) {
        System.out.println(isBase(1));
        System.out.println(isBase(4));
        System.out.println(isBase(8));
        System.out.println(isBase(16));
        System.out.println(isBase(64));

    }

    public static boolean isBase(int A) {
        if (A % 4 == 0){
            if (A/4 == 1){
                return true;
            }else{
                return isBase(A / 4);
            }
        }
        return false;
    }
}
