import helloWorld.*;
import oop.*;
import dataTypes.*;

public class Main {


    public static void main(String[] args ){
        Hello.message("Hello from hello world");
        Person.message();

        Person Jian = new Person("Jian", "Earle", 20);
        System.out.println(Jian.getFirstName());
        DataTypes.printTypes();

    }
}