import java.util.Scanner;

/**
 * First test Java
 * @author Julia Yunina
 */
public class Base {
    /**
     * Calculator two 32-bit floating point number
     * @author Julia Yunina
     */
    public static final void main(String[] args) {
        //Summa i1 and i2
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое дробное число (разделить запятая)");
        float i1 = scanner.nextFloat();
        System.out.println("Введите второе дробное число (разделить запятая)");
        float i2 = scanner.nextFloat();
        float s;
        s = i1 + i2;
        System.out.printf("Сумма чисел %f и %f равна: %.4f", i1, i2, s);
        scanner.close();
    }
}