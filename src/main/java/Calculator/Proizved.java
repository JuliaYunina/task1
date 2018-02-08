package Calculator;

public class Proizved implements Calculate{
    float arg1;
    float arg2;

    Proizved(float arg1, float arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }
    @Override
    public void calcOper() {
        float proizv = 0;
        proizv = arg1 * arg2;
        System.out.printf("Произведение чисел %f и %f равна: %.4f", arg1, arg2, proizv);
    }
}
