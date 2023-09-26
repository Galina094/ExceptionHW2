

import java.util.Scanner;

class Number{
    public static void GetNum() {

        boolean ans = true;

        while (ans){
            try{

                Scanner in = new Scanner(System.in);
                System.out.println("Input number type of float: ");
                float num = in.nextFloat();

                if (num%1>0){
                    ans = false;
                }

                System.out.printf("Your num = " + num);
                System.out.println();

            } catch (Exception ex) {
                System.out.println("Error! It's not float!");
            }
        }
    }
}


class Tasks{
    public static void Task2(){
        try {
            int d = 0;
            double[] intArray = new double[8];
            double[] catchedRes1 = new double[(int) intArray[8/d]];
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }

    public static void Task3() throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);
            int[] abc = { 1, 2 };
            abc[2] = 9;
        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException ex) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }
    public static void printSum(Integer a, Integer b) {
        System.out.println(a + b);
    }

    public static void Task4(){
        try {
            Scanner in = new Scanner(System.in);
            System.out.println("Enter your name!");
            String name = in.nextLine();
            if(name.isEmpty()){
                throw new Exception("Error! String is empty!");
            }
            System.out.println("Your name is:" + name);
        } catch (Exception e){
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("Done!");
        }
    }

}

public class HW1_Task1 {
    public static void main(String[] args) throws Exception {

        // Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
        // Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить
        // у пользователя ввод данных.
        Number.GetNum();

        Tasks.Task2();
        Tasks.Task3();

        // Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
        // Пользователю должно показаться сообщение, что пустые строки вводить нельзя.
        Tasks.Task4();
    }
}