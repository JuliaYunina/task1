package Calculator;
import java.lang.System;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        //calculator: dannie + deistvie + exception+add file
        try {
            Scanner number = new Scanner(System.in);
            System.out.println("Введите первое дробное число (разделить запятая)");
            float num1 = number.nextFloat();
            System.out.println("Введите второе дробное число (разделить запятая)");
            float num2 = number.nextFloat();
            System.out.println("Введите действие, которое будет выполняться над числами: +, -, *, /");
            String calc = number.next();
            switch (calc) {
                case "+":
                    Calculate s1 = new Sum(num1, num2);
                    s1.calcOper();
                    break;
                case "-":
                    Calculate s2 = new Minus(num1, num2);
                    s2.calcOper();
                    break;
                case "*":
                    Calculate s3 = new Proizved(num1, num2);
                    s3.calcOper();
                    break;
                case "/":
                    if (num2 == 0)
                    {throw new ArithmeticException();
                    }
                    else
                    {Calculate s4 = new Delenie(num1, num2);
                        s4.calcOper();

                    break;}
               default:
                    System.out.println("Задан некорректный оператор");
            }
            number.close();
        }
        catch (ArithmeticException err1) {
            System.out.println("Деление на 0 запрещено\n");
        }
        catch (InputMismatchException e) {
            System.out.println("Введены некорректные данные: тип данных не соответствует float");
        }
    }
}
