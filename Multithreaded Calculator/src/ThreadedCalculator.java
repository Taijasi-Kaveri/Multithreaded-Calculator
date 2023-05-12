
public class ThreadedCalculator extends Thread {
    private int result;
    private int a;
    private int b;
    private String operation;

    public ThreadedCalculator(int a, int b, String operation) {
        this.a = a;
        this.b = b;
        this.operation = operation;
    }

    @Override
    public void run() {
        switch (operation) {
            case "+":
                result = Calculator.add(a, b);
                break;
            case "-":
                result = Calculator.subtract(a, b);
                break;
            case "*":
                result = Calculator.multiply(a, b);
                break;
            case "/":
                result = Calculator.divide(a, b);
                break;
            default:
                System.out.println("Invalid operation");
        }
    }

    public int getResult() {
        return result;
    }
}

