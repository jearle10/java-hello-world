public class SpeedConverter {
    public static void main(String[] args){
        SpeedConverter.toMilesPerHour(15);
        SpeedConverter.printConversion(15);
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