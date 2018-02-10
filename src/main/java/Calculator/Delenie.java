package Calculator;

public class Delenie implements Calculate {
    float arg1;
    float arg2;
     Delenie(float arg1, float arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }
    @Override
        public void calcOper () {
        float delen = 0;
//        try {
            delen = arg1 / arg2;
 /*           if (arg2 == 0)
            {throw new ArithmeticException();}
        }
        catch (ArithmeticException err1) {
            System.out.println("Деление на 0\n");
        }*/
        System.out.printf("Частное от деления числа %f на число %f равно: %.4f", arg1, arg2, delen);
    }
}
