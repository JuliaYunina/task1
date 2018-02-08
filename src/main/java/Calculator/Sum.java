package Calculator;

public class Sum implements Calculate {
    float arg1;
    float arg2;

    Sum(float arg1, float arg2) {
        this.arg1 = arg1;
        this.arg2 = arg2;
    }
    @Override
    public void calcOper() {
        float sum=0;
        sum = arg1 + arg2;
        System.out.printf("Сумма чисел %f и %f равна: %.4f", arg1, arg2, sum);
    }
}
