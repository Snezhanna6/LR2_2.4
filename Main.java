package Main;

import java.util.Scanner;

public class Main {

    private static float[] numbers = new float[2];

    public static void main(String[] args) {

        //Вызов метода для ввода чисел
        inputNumbers();
        //Вызов метода для вывода в консоль результатов
        outputResidual();
    }

    //Функция для ввода двух чисел
    public static void inputNumbers(){
        Scanner in = new Scanner(System.in);

        try {
            System.out.println("Введите первое число: ");
            numbers[0] = in.nextFloat();
        }catch (Exception e){
            System.out.println("Первое число введено не правльно!");
            System.exit(0);
        }

        try {
            System.out.println("Введите второе число: ");
            numbers[1] = in.nextFloat();
        }catch (Exception e){
            System.out.println("Второе число введено не правльно!");
            System.exit(0);
        }
    }

    //Функция вычитания двух чисел, из числа "a" вычитается "b"
    public static float residual(float a, float b){
        return a - b;
    }

    public static void outputResidual(){
        System.out.printf("Разность чисел %f и %f = %f\n",numbers[0],numbers[1],residual(numbers[0],numbers[1]));
    }


}
