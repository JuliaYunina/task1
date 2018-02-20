import Calculator.Calculate;
import Calculator.Delenie;
import Calculator.Sum;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public abstract class Tests {
    //   Calculate s3 = new Proizved(num1, num2);

   /* public class Test1 implements Calculate {
        float a1;
        float a2;
    }*/

    @Test
    public void test1() {
    /*
    public void delenienull() {
        Test1 test1 = new Test1(a1, a2);
        assertEquals("1", 0.0, Test1.calcOper(), 0.0);*/

        //protected abstract Delenie createDelenie ();
  /*      public void sum1(){
            Calculate ts1 = new Sum(1.0, 3.5);
            
            assertEquals(4.0000,ts1.calcOper(),0.0);
            System.out.printf("Сумма чисел равна: %.4f", ts1);
        }
    }

    protected abstract void assertEquals(double v, void aVoid, double v1);*/
        Calculate s1 = new Sum(1, 2);

        //assertEquals("1111",3.0,s1.calcOper());
        assertTrue(s1.calcOper()==5);
    }

}