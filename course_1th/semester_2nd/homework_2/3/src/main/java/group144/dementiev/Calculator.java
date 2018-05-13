package group144.dementiev;

/** Class realizing calculator logic.*/
public class Calculator {

    /**
     * Method that considers the value of an expression.
     * @param expression value of expression.
     */
    public int calculate(String expression) {
        String[] tokens = expression.split(" ");
        Stack stack = new ListStack();
        for (String token : tokens) {
            if (isNumber(token)) {
                stack.push(Integer.parseInt(token));
            } else {
                int secondOperand = stack.pop();
                int firstOperand = stack.pop();
                stack.push(operation(token, firstOperand, secondOperand));
            }
        }
        return stack.pop();
    }

    private int operation(String operation, int first, int second) {
        switch (operation) {
            case "+":
                return first + second;
            case "-":
                return first - second;
            case "*":
                return first * second;
            case "/":
                return first / second;
        }
        return -1;
    }

    private boolean isNumber(String number) {
        for (int i = 1; i < number.length(); i++) {
            if (!Character.isDigit(number.charAt(i))) {
                return false;
            }
        }
        return (number.charAt(0) == '-' && number.length() > 1) || Character.isDigit(number.charAt(0));
    }
}
