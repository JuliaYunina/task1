
import java.util.Scanner;

/**
 * Third test Java
 * @author Julia Yunina
 */
public class Lenword {
    /**
     * Calculator two 32-bit floating point number
     *
     * @author Julia Yunina
     */
    public static final void main(String[] args) {
        //max lenhgt of all words
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размерность массива");
        int i1 = scanner.nextInt();
        String[] words = new String[i1];
        for (int i = 0; i < words.length; i++) {
            System.out.println("Введите " + (i+1) + "-ый элемент массива");
            words[i] = scanner.next();
        }
        int lenw = 0;
        for (int i = 0; i < i1; i++) {
                if (words[i].length()>lenw) {
                lenw = i;
            }
        }
        System.out.printf("Максимальная длина у %d элемента массива равна %d. Самое длинное слово: %s", (lenw+1),words[lenw].length(),words[lenw]);
        scanner.close();
    }
}

