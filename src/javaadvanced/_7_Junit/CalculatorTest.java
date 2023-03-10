package javaadvanced._7_Junit;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    /**
     * 1:
     * Create JUnit test for the add() and subtract() methods in the Calculator class.
     * <p>
     * Test the methods with multiple test cases, including positive and negative numbers, and zero.
     * <p>
     * Verify that the methods return the correct result for each test case.
     * <p>
     * If there is an error you may have to change the code in Calculator to fix it!
     */
    @Test
    void exercise1() {
        System.out.println("\nExercise 1: ");
        // Your code here
        Calculator calculator = new Calculator();
        Assertions.assertEquals(10, calculator.add(8, 2));
        Assertions.assertEquals(-50, calculator.add(-100, 50));

        Assertions.assertEquals(0, calculator.subtract(10, 10));
        Assertions.assertEquals(333, calculator.subtract(999, 666));
    }

    /**
     * 2:
     * Create JUnit test for the multiply() and divide() methods in the Calculator class.
     * <p>
     * Test the same kind of inputs as before as exercise 1
     * <p>
     * If there is an error you may have to change the code in Calculator to fix it!
     */
    @Test
    void exercise2() {
        System.out.println("\nExercise 2: ");
        // Your code here
        Calculator calculator = new Calculator();
        Assertions.assertEquals(16, calculator.multiply(8, 2));
        Assertions.assertEquals(-5000, calculator.multiply(-100, 50));
        Assertions.assertEquals(0, calculator.multiply(0, 0));

        Assertions.assertEquals(1, calculator.divide(10, 10));
        Assertions.assertEquals(-1.5, calculator.divide(-999, 666));

        Assertions.assertThrows(ArithmeticException.class, () -> calculator.divide(10, 0));
    }

    /**
     * 3:
     * Create a JUnit test for the power() method in the Calculator class that raises a number to a power.
     * Test the method with test cases where the base is zero, positive, and negative - the exponent is zero, one and negative
     * Test with decimals too!
     * Verify that the method returns the correct result for each test case.
     * <p>
     * If there is an error you may have to change the code in Calculator to fix it!
     * <p>
     * Don't just write tests that use the result of the program as the expected!!
     */
    @Test
    void exercise3() {
        System.out.println("\nExercise 3: ");
        // Your code here
        Calculator calculator = new Calculator();
        Assertions.assertEquals(9, calculator.power(3, 2));
        Assertions.assertEquals(0, calculator.power(0, 2));
        Assertions.assertEquals(9, calculator.power(-3, 2));
        Assertions.assertEquals(3, calculator.power(3, 1));
        Assertions.assertEquals(1, calculator.power(3, 0));
        Assertions.assertEquals(0.1111111111111111, calculator.power(3, -2));
        Assertions.assertEquals(0.09, calculator.power(0.3, 2));
        Assertions.assertEquals(11.111111111111112, calculator.power(0.3, -2));
        Assertions.assertEquals(0.7860030855966228, calculator.power(0.3, 0.2));
    }
}