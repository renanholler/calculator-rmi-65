package server;

public class CalculatorState {
    private double value = 0.0;

    public synchronized double getValue() {
        return value;
    }

    public synchronized void setValue(double value) {
        this.value = value;
    }

    public synchronized double updateValue(double a, String operation) {
        switch (operation) {
            case "add":
                value += a;
                break;
            case "subtract":
                value -= a;
                break;
            case "multiply":
                value *= a;
                break;
            case "divide":
                if (a == 0) throw new ArithmeticException("Cannot divide by zero");
                value /= a;
                break;
        }
        return value;
    }
}
