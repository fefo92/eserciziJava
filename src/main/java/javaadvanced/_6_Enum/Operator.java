package javaadvanced._6_Enum;

public enum Operator {
    ADD, SUBTRACT, MULTIPLY, DIVIDE;

     public static double calculate(double num1, double num2, Operator operator) {
         return switch (operator) {
             case ADD -> num1 + num2;
             case SUBTRACT -> num1 - num2;
             case MULTIPLY -> num1 * num2;
             case DIVIDE -> num1 / num2;

         };
    }
}





