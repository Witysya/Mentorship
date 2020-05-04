package FirstExcercises;

//Write a Java program to convert temperature from Fahrenheit to Celsius degree.
public class ThirdTask {
    public static void main(String[] args) {
        convertTemperature(500);
    }

    public static int convertTemperature(int tempInFahrenheit) {
        int tempInCelsius = (tempInFahrenheit - 32) * 5 / 9;
        System.out.println(tempInFahrenheit + " in Fahrenheit is equal to " + tempInCelsius + " in Celsius");
        return tempInCelsius;
    }
}
