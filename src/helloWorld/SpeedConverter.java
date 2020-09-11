package helloWorld;

public class SpeedConverter {
    public static void main(String[] args){
        toMilesPerHour(15);
        printConversion(15);

        Hello.message("Hello my name is Jian");

    }

    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0) return -1;

        double convertedMiles = kilometersPerHour * 0.621;
        long roundedMiles = Math.round(convertedMiles);
        return roundedMiles;
    }

    public static void printConversion (double kilometersPerHour) {
        if (kilometersPerHour < 0 ) System.out.println("Invalid value");
        long milesPerHour = toMilesPerHour(kilometersPerHour);
        System.out.println(kilometersPerHour + " kmph" + " = " + milesPerHour + " mph" );

    }
}