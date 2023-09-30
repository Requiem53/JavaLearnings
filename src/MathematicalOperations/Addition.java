package MathematicalOperations;

public class Addition extends Operation {

    public Addition(double left, double right) {
        super(left, right);
    }

    @Override
    public double performOperation() {
        return left+right;
    }
}
