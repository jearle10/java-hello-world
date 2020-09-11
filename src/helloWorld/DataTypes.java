package helloWorld;

public class DataTypes {
    public static void main(String[] args){

        byte byteMin = Byte.MIN_VALUE;
        byte byteMax = Byte.MAX_VALUE;

        short shortMin = Short.MIN_VALUE;
        short shortMax = Short.MAX_VALUE;

        long longMin = Long.MIN_VALUE;
        long longMax = Long.MAX_VALUE;

        int intMin = Integer.MIN_VALUE;
        int intMax = Integer.MAX_VALUE;

        float floatMin = Float.MIN_VALUE;
        float floatMax = Float.MAX_VALUE;

        double doubleMin = Double.MIN_VALUE;
        double doubleMax = Double.MAX_VALUE;

        System.out.println("Min value of a byte is " + byteMin); // -128
        System.out.println("Max value of a byte is " + byteMax); // 127

        System.out.println("Min value of a short is " + shortMin); // -32,768
        System.out.println("Max value of a short is " + shortMax); // 32,767

        System.out.println("Min value of a long is " + longMin); // -9,223,372,036,854,775,808
        System.out.println("Max value of a long is " + longMax); // 9,223,372,036,854,775,807

        System.out.println("Min value of a int is " + intMin); // -2,147,483,648
        System.out.println("Max value of a int is " + intMax); // -2,147,483,647

        System.out.println("Min value of a float is " + floatMin); // 1.4E-45
        System.out.println("Max value of a float is " + floatMax); // 3.4028235E38

        System.out.println("Min value of a double is " + doubleMin); // 4.9E-324
        System.out.println("Max value of a double is " + doubleMax); // 1.7976931348623157E308
    }
}