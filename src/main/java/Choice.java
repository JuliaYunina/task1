import java.util.Scanner;

/**
 * Choice test Java
 * @author Julia Yunina
 * @see Calc#calculate()
 * @see Lenword#getMaxLen()
 */
public class Choice {
    /**
     * Calculator or Length
     *
     * @author Julia Yunina
     */
    public static final void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        //определение выполняемого действия
        System.out.println("Введите 1, если требуется запустить калькулятор, 2 - для определения максимального элемента массива");
        int i = scanner.nextInt();
        if (i == 1)
        {
            //вызов калькулятора
            Calc.calculate();;
            //вызов определения максимальной длины элемента массива
        } else if (i == 2){
            Lenword.getMaxLen();
        }
        //указана цифра, отличная от 1 и 2
        else {System.out.println("Некорректно задано действие");}
    }
}


