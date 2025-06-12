package MAin;

public class StackCalculator
{
    public static double evaluate(String expression) {
        ArrayStack stacks = new ArrayStack(100);
        String[] characters = expression.split(" ");

        for (int i = 0; i<characters.length;i++) {
            character = characters[i];
            if (character.equals("(")) {
            } else if (character.equals("+") || character.equals("-") ||
                    character.equals("*") || character.equals("/")) {
                stacks.pushOperation(character);
            } else if (character.equals(")")) {
                double rightOperand = stacks.popOperand();
                double leftOperand = stacks.popOperand();
                String operation = stacks.popOperation();

                double result = 0;
                if (operation.equals("+")) {
                    result = leftOperand + rightOperand;
                } else if (operation.equals("-")) {
                    result = leftOperand - rightOperand;
                } else if (operation.equals("*")) {
                    result = leftOperand * rightOperand;
                } else if (operation.equals("/")) {
                    result = leftOperand / rightOperand;
                }

                stacks.pushOperand(result);
            } else {
                stacks.pushOperand(Double.parseDouble(character));
            }
        }

        return stacks.popOperand();
    }

    public static void main(String[] args) {
        String expression = "( 1 + ( ( 2 + 3 ) * ( 4 * 5 ) ) )";
        System.out.println(evaluate(expression)); 
    }
}
