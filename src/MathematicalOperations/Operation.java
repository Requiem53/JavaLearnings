package MathematicalOperations;

public abstract class Operation {
    public double left;
    public double right;

    public Operation(double left, double right) {
        this.left = left;
        this.right = right;
    }

    public abstract double performOperation();

    public void printResult(){
        System.out.printf("Result: %.2f\n", performOperation());
    }
}
