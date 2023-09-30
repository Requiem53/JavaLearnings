package MathematicalOperations;

public class Subtraction extends Operation{
    public Subtraction(double left, double right) {
        super(left, right);
    }

    @Override
    public double performOperation() {
        return left-right;
    }
}
