package Stacks;
import java.util.Stack;
public class InfixEvaluation2stack {

    static int precedence(char op) {

        if(op == '+' || op == '-')
            return 1;

        if(op == '*' || op == '/')
            return 2;

        return 0;
    }

    static int apply(int a, int b, char op) {

        switch(op) {

            case '+':
                return a + b;

            case '-':
                return a - b;

            case '*':
                return a * b;

            case '/':
                return a / b;
        }

        return 0;
    }

    static int evaluate(String exp) {

        Stack<Integer> values = new Stack<>();

        Stack<Character> ops = new Stack<>();

        for(int i = 0; i < exp.length(); i++) {

            char ch = exp.charAt(i);

            // ignore spaces
            if(ch == ' ')
                continue;

            // digit
            if(Character.isDigit(ch)) {

                int num = 0;

                while(i < exp.length() &&
                      Character.isDigit(exp.charAt(i))) {

                    num = num * 10 +
                          (exp.charAt(i) - '0');

                    i++;
                }

                i--;

                values.push(num);
            }

            
            else if(ch == '(') {
                ops.push(ch);
            }

            
            else if(ch == ')') {

                while(ops.peek() != '(') {

                    int b = values.pop();
                    int a = values.pop();

                    char op = ops.pop();

                    values.push(apply(a,b,op));
                }

                ops.pop();
            }

            
            else {

                while(!ops.isEmpty() &&
                      precedence(ops.peek()) >= precedence(ch)) {

                    int b = values.pop();
                    int a = values.pop();

                    char op = ops.pop();

                    values.push(apply(a,b,op));
                }

                ops.push(ch);
            }
        }

        // remaining operators
        while(!ops.isEmpty()) {

            int b = values.pop();
            int a = values.pop();

            char op = ops.pop();

            values.push(apply(a,b,op));
        }

        return values.pop();
    }

    public static void main(String[] args) {

        String exp = "2 + 3 * 4";

        System.out.println(evaluate(exp));
    }
}

