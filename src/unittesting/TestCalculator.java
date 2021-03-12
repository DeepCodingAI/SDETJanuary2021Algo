package unittesting;


import org.testng.Assert;

public class TestCalculator {
    public static void main(String[] args) {
        Calculator cal = new Calculator();
        int additionResult = cal.addition(100,90);
        Assert.assertEquals(190, additionResult);

        int subtractionResult = cal.subtraction(100,90);
        Assert.assertEquals(10, subtractionResult);

        int multiplicationResult = cal.multiplication(100,90);
        Assert.assertEquals(9000, multiplicationResult);
    }
}
