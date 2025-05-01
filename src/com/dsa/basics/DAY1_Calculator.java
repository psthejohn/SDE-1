public class DAY1_Calculator {
    public static void main(String[] args) {
        DAY1_Calculator calculator = new DAY1_Calculator();
        try {
            System.out.println(calculator.calculate(10, 5, '+'));
            System.out.println(calculator.calculate(10, 0, '/'));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }

    private double calculate(int a, int b, char operation) {
        switch (operation) {
            case '+':
                return (double) (a + b);
            case '-':
                return (double) (a - b);
            case '/':
                if (b == 0)
                    throw new ArithmeticException("Cannot divide by zero");
                return (double) (a / b);
            case '*':
                return (double) (a * b);
            default:
                throw new IllegalArgumentException("Please enter a valid operator: +, -, *, or /.");
        }
    }
}
