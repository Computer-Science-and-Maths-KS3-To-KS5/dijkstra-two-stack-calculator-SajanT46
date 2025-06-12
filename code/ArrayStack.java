package MAin;

public class ArrayStack {
    private String[] operationStack;
    private double[] operandStack;
    private int operationTop = -1;
    private int operandTop = -1;

    public ArrayStack(int capacity) {
        operationStack = new String[capacity];
        operandStack = new double[capacity];
    }

    public void pushOperation(String operation) {
        operationStack[++operationTop] = operation;
    }

    public String popOperation() {
        return operationStack[operationTop--];
    }

    public boolean isOperationEmpty() {
        return operationTop == -1;
    }

    public void pushOperand(double operand) {
        operandStack[++operandTop] = operand;
    }

    public double popOperand() {
        return operandStack[operandTop--];
    }

    public boolean isOperandEmpty() {
        return operandTop == -1;
    }
}
