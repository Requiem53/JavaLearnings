package MathematicalOperations;

public class Multiplication extends Operation{
    public Multiplication(double left, double right) {
        super(left, right);
    }

    @Override
    public double performOperation() {
        return left*right;
    }
}
