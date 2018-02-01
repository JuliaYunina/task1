/**
 * Massive change elements Java
 * @author Julia Yunina
 */
public class Masminmax {
    public static void main(String[] args) {
        /**
         * Change elements of massiv: minPol & maxOtr
         *
         * @author Julia Yunina
         */
        int[] ten = new int[20];
        //заполнение массива значениями от -10 до 10
        for (int i = 0; i < ten.length; i++) {
            ten[i] = (int) ((Math.random()) * 21) - 10;
            //вывод элементов массива
            System.out.println((i+1) + " элемент массива равен " + ten[i]);
        }
        int maxOtr = -10;
        int num1 = 30;
        int minPol = 10;
        int num2 = 30;
        //поиск максимальноого отрицательного элемента: считаем, что если длины равны - берем элемент с большим номером
        //поиск минимального положительного элемента: считаем, что если длины равны - берем элемент с большим номером
        for (int i = 0; i < 20; i++) {
            if (ten[i]<0) {
                if (ten[i] >= maxOtr) {
                    maxOtr = ten[i];
                    num1 = i;
                }
            }
            else if (ten[i]>0) {
                if (ten[i] <= minPol) {
                    minPol = ten[i];
                    num2 = i;
                }
            }
        }
        System.out.println(" maxOtr равен " + maxOtr + " номер макс отриц равен " + (num1+1));
        System.out.println(" minPol равен " + minPol + " номер мин положит равен " + (num2+1) );
        int ten1 = 0;
        ten1 = ten[num1];
        ten[num1] = ten[num2];
        ten[num2] = ten1;
        //вывод элементов конечного массива, где минимальный положительный и максимальный отрицательный поменяны местами
        for (int i = 0; i < ten.length; i++) {
            System.out.println((i+1) + " элемент массива равен " + ten[i]);
        }
    }
}
