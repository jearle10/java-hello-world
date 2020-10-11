package oop;


public class Person {

    private String firstName;
    private String lastName;
    private int age;

    public Person(String firstName,  String lastName, int age  ){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public static void main(String[] args) {
    }

    public String getFirstName(){
        return this.firstName;
    }


    public static void message(){
        System.out.println("Hello from Person class");
    }
}