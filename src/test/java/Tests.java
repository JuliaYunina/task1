import Calculator.*;
import org.junit.jupiter.api.Test;

import static jdk.nashorn.internal.objects.Global.Infinity;
import static org.junit.Assert.assertTrue;


public class Tests {


    @Test
    public void ProverkaSumma() {

        Calculate s1 = new Sum(3, 1);
        assertTrue(s1.calcOper()==4);
        //assertTrue("тест не прошел",s1.calcOper()==3);

        Calculate s2 = new Sum(0, (float) 2.5);
        assertTrue(s2.calcOper()==2.5);

        Calculate s3 = new Sum((float) 1.34, (float) 0.66);
        assertTrue(s3.calcOper()==2.0000);

        Calculate s4 = new Sum((float) -1.34, (float) -0.66);
        assertTrue(s4.calcOper()==-2);

        Calculate s5 = new Sum((float) -1.34, (float) 0.66);
        assertTrue(s5.calcOper()==(float)-0.68);

        Calculate s6 = new Sum((float) -0.00, (float) 0.0);
        assertTrue(s6.calcOper()==0);
        //assertTrue("тест не прошел",s6.calcOper()==0);
    }

    @Test
    public void ProverkaDelenie() {

        Calculate d1 = new Delenie(2, 5);
        assertTrue(d1.calcOper()==(float)0.4);

        Calculate d2 = new Delenie((float) 4.5,-3);
        assertTrue(d2.calcOper()==(float)-1.5);

        Calculate d3 = new Delenie((float) 1.34, (float) 0.66);
        assertTrue(d3.calcOper()==(float)2.030303);

        Calculate d4 = new Delenie((float) -1.5, 5);
        assertTrue(d4.calcOper()==(float)-0.3);

        Calculate d5 = new Delenie(0, (float) 0.66);
        assertTrue(d5.calcOper()==0);

        Calculate d6 = new Delenie(100,0);
        assertTrue(d6.calcOper()==Infinity);
    }

    @Test
    public void ProverkaProizved() {

        Calculate p1 = new Proizved((float)2.5, 4);
        assertTrue(p1.calcOper()==10);

        Calculate p2 = new Proizved((float) 4.5,-3);
        assertTrue(p2.calcOper()==(float)-13.5);

        Calculate p3 = new Proizved((float) -1.34, (float) -0.35);
        assertTrue(p3.calcOper()==(float)0.469);

        Calculate p4 = new Proizved((float) -1.222253, (float)0.2);
        assertTrue(p4.calcOper()==(float)-0.2444506);

        Calculate p5 = new Proizved(0, (float) 0.66);
        assertTrue(p5.calcOper()==0);

        Calculate p6 = new Proizved(100,0);
        assertTrue(p6.calcOper()==0);
    }

    @Test
    public void ProverkaMinus() {

        Calculate m1 = new Minus((float)-1.25, -1);
        assertTrue(m1.calcOper()==(float)-0.25);

        Calculate m2 = new Minus((float)-3.55,0);
        assertTrue(m2.calcOper()==(float)-3.55);

        Calculate m3 = new Minus(0, (float) -0.35);
        assertTrue(m3.calcOper()==(float)0.35);

        Calculate m4 = new Minus(1, 1);
        assertTrue(m4.calcOper()==0);

        Calculate m5 = new Minus(0, (float) 0.66);
        assertTrue(m5.calcOper()==(float)-0.66);

        Calculate m6 = new Minus((float)3.123456,(float)1.123456);
        assertTrue(m6.calcOper()==2);
    }
}