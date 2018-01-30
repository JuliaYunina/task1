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
    public static void getMaxLen() {
        //максимальная длина слова в массиве 
        Scanner scanner = new Scanner(System.in);
        //определение размерности массива
        System.out.println("Введите размерность массива");
        int i1 = scanner.nextInt();
        String[] words = new String[i1];
        //заполнение массива
        for (int i = 0; i < words.length; i++) {
            System.out.println("Введите " + (i+1) + "-ый элемент массива");
            words[i] = scanner.next();
        }
        //задание переменной 'номер элемента с максимальной длиной'
        int maxLenNum = 0;
        //поиск элемента с максимальной длиной: считаем, что если длины равны - берем элемент с большим номером
        for (int i = 0; i < i1; i++) {
            if ((words[i].length())>=(words[maxLenNum].length())) {
                maxLenNum = i;
            }
        }
        System.out.printf("Максимальная длина у %d элемента массива равна %d. Самое длинное слово: %s", (maxLenNum+1),words[maxLenNum].length(),words[maxLenNum]);
        scanner.close();
    }
}