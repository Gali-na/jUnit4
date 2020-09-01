import org.junit.Assert;
import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;

import static org.junit.Assert.*;

public class CalculeteTest extends Calculete {
    Calculete calculete = new Calculete();
    @BeforeEach
    @Test
    public void test() {
        Calculete calculete = new Calculete();
    }
    @Test
    public void testSumPositive() {
        //Calculete calculete = new Calculete();
         double rez = calculete.sum(3.0,3.0);
         double expend= 6.0;
       Assert.assertEquals(expend,rez,0);
    }
    @Test
    public void testSumNegative(){
       // Calculete calculete = new Calculete();
        double rez = calculete.sum(3.0,3.0);
        Assert.assertNotEquals(-1.0,rez);
    }
    @Test
    public void testSumZero(){
        //Calculete calculete = new Calculete();
        double rez = calculete.sum(0.0,0.0);
        Assert.assertNotEquals(-1.0,rez);
    }
    @Test
    public void testMinusPositive() {
  double rez =calculete.minus(5.0,5.0);
        Assert.assertEquals(0.0,rez,0);
    }
    @Test
    public void testMinusNegative() {
        double rez =calculete.minus(5.0,5.0);
        Assert.assertNotEquals(-1.0,rez);
    }
    @Test
    public void testMinusZero(){
        double rez = calculete.minus(0.0,0.0);
        Assert.assertNotEquals(-1.0,rez);
    }
    @Test
    public void testMultipliedPositive() {
        double rez =calculete.multiplied(5.0,5.0);
        Assert.assertEquals(25.0,rez,1);
    }
    @Test
    public void testMultipliedNegative() {
        double rez =calculete.multiplied(5.0,5.0);
        Assert.assertNotEquals(0.0,rez,0);
    }
    @Test
    public void testMultiplieZero(){
        double rez = calculete.multiplied(0.0,0.0);
        Assert.assertNotEquals(-1.0,rez);
    }
    @Test(expected = ArithmeticException.class)
    public void testDivisionZero() {
        calculete.division(10.0,0);
    }
    @Test
    public void testDivisionNegative() {
        double rez= calculete.division(10.0,1);
        Assert.assertNotEquals(-1.0,rez);
    }
}