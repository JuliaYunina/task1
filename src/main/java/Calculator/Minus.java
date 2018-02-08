package Calculator;

public class Minus implements Calculate{
    float arg1;
    float arg2;

    Minus(float arg1, float arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }
    @Override
    public void calcOper() {
        float minus=0;
        minus = arg1 - arg2;
        System.out.printf("Разность чисел %f и %f равна: %.4f", arg1, arg2, minus);
    }
}
