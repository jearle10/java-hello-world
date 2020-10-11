package methods;

public class SpeedConverter {
    public static void main(String[] args){

        printConversion(-1);
//        System.out.println(toMilesPerHour(95.75));
    }

    public static long toMilesPerHour(double kilometersPerHour){
        if (kilometersPerHour < 0) return -1;
        double convertedMiles = kilometersPerHour / 1.609;
        long roundedMiles = Math.round(convertedMiles);
        return roundedMiles;
    }

    public static void printConversion (double kilometersPerHour) {

        long milesPerHour = toMilesPerHour(kilometersPerHour);
        if(milesPerHour == -1 ) {
            System.out.println("Invalid Value");
        } else {
            System.out.println(kilometersPerHour + " km/h" + " = " + milesPerHour + " mi/h" );
        }
    }
}