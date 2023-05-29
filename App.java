package ru.javacore;
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello Kirill!" );
        Tester tester1 = new Tester();
        tester1.print();
        Tester tester2 = new Tester("Petya","Petrov");
        tester2.print(14);
        Tester tester3 = new Tester("Annya","Popova", 1, "A", 1000);
        tester3.print(10,true);
        Tester.staticMethod();
    }
}
