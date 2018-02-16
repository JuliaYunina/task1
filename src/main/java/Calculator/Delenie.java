package Calculator;

public class Delenie implements Calculate {
    float arg1;
    float arg2;
    public Delenie(float arg1, float arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }
    @Override
    public void calcOper() {
        float delen = 0;
        delen = arg1 / arg2;

        System.out.printf("Частное от деления числа %f на число %f равно: %.4f", arg1, arg2, delen);
    }
}