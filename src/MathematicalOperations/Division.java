package MathematicalOperations;

public class Division extends Operation {
    public Division(double left, double right) {
        super(left, right);
    }

    @Override
    public double performOperation() {
        return left/right;
    }
}
