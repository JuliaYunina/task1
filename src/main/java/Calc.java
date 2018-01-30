import java.util.Scanner;

/**
 * Second test Java
 * @author Julia Yunina
 */
public class Calc {
    /**
     * Calculator two 32-bit floating point number
     *
     * @author Julia Yunina
     */
    public static void calculate() {
        //calculator
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое дробное число (разделить запятая)");
        float i1 = scanner.nextFloat();
        System.out.println("Введите второе дробное число (разделить запятая)");
        float i2 = scanner.nextFloat();
        System.out.println("Введите действие, которое будет выполняться над числами: +, -, *, /");
        String d = scanner.next();
        float s;
        switch (d) {
            case "+":
                s = i1 + i2;
                System.out.printf("Сумма чисел %f и %f равна: %.4f", i1, i2, s);
                break;
            case "-":
                s = i1 - i2;
                System.out.printf("Разность чисел %f и %f равна: %.4f", i1, i2, s);
                break;
            case "*":
                s = i1 * i2;
                System.out.printf("Произведение чисел %f и %f равно: %.4f", i1, i2, s);
                break;
            case "/":
                s = i1 / i2;
                System.out.printf("Частное от деления числа %f на число %f равно: %.4f", i1, i2, s);
                break;
            default:
                System.out.println("Задан некорректный оператор");
        }
        scanner.close();
    }
}