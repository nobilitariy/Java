/*
 * В методе calculate класса Calculator реализовать калькулятор, который будет выполнять математические операции (+, -, *, /) над двумя целыми числами и возвращать результат вещественного типа.

В классе Printer необходимо реализовать проверку переданного оператора, при некорректном операторе программа должна вывести сообщение об ошибке "Некорректный оператор: 'оператор'".
 */
package homework1;

import java.util.Scanner;

public class task3 {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int numberOne = scanner.nextInt();
        System.out.println("Выберете математическую операцию(+, -, *, ): ");
        scanner.nextLine();
        String simbol = scanner.nextLine();
        System.out.println("Введите второе число: ");
        int numberTwo = scanner.nextInt();
        double result = 0;
        switch (simbol) {
            case "+":
                result = numberOne + numberTwo;
                System.out.println("Результат сложения - " + result);
                break;
            case "-":
                result = numberOne - numberTwo;
            System.out.println("Результат вычитания - " + result);
            break;
            case "*":
                result = numberOne * numberTwo;
                System.out.println("Результат умножения - " + result);
                break;
            case "/":
                if (numberTwo == 0) {
                    System.out.println(-1);
                }
                else {
                    result = numberOne / numberTwo;
                    System.out.println("Результат деления - " + result);
                }
                break;
            default:
                break;
    
    
        }
    }
}
