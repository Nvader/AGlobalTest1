package sample;

public class Variables {

    private static int myNum;
    private static byte myByte ;
    private static short myShort ;
    private static long myLong ;
    private static float myFloatNum ;
    private static double myDouble ;
    private static char myLetter ;
    private static boolean myBool;
    private static String myText;

    public void print() {

        System.out.println(myNum);
        System.out.println(myByte);
        System.out.println(myShort);
        System.out.println(myLong);
        System.out.println(myFloatNum);
        System.out.println(myDouble);
        System.out.println(myLetter);
        System.out.println(myBool);
        System.out.println(myText);

    }

    public void createAndPrintRandomVariables() {
        System.out.println(myNum = 5);
        System.out.println(myByte = 3);
        System.out.println(myShort = 21);
        System.out.println(myLong = 3333);
        System.out.println(myFloatNum = 3.99f);
        System.out.println(myDouble = 5.55f);
        System.out.println(myLetter = 'O');
        System.out.println(myBool = true);
        System.out.println(myText = "Hello");
    }


}

    /*
    Суть задания: создать два класса,
    в одном объявить приватные переменные экземпляра класса всех примитивных типов + String, без инициализации.
    В этом же классе сделать два метода, один из них выводит в консоль все объявленные переменные,
    второй метод назначает переменным любое значение отличное от значения по умолчанию и тоже выводит их в консоль.
    Второй класс собственно должен создавать экземпляр первого класса и вызвать каждый из его методов в любом порядке один раз.

    инфа на тему:
    https://www.w3schools.com/java/java_data_types.asp
    https://www.tutorialspoint.com/java/java_variable_types
    }*/

