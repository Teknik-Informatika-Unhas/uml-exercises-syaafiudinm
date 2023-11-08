import java.util.Scanner;
public class Main {
    public static void main(String[] args){

        Scanner myScan = new Scanner(System.in);
        Calc calculate = new Calc ();
        AdvCalc calc   = new AdvCalc();

        System.out.println("Welcome to basic calc!!");
        System.out.println("Please the first num : ");
        double operand1 = myScan.nextDouble();
        System.out.println("Please the second num : ");
        double operand2 = myScan.nextDouble();

        System.out.println("Please select your Operator : ");
        System.out.println("1. Addition (+)");
        System.out.println("2. Subtraction (-)");
        System.out.println("3. Multiplication (*)");
        System.out.println("4. Division (/)");
        System.out.println("5. Modulo (%)");

        String operator = myScan.next();
        double result = 0;
        switch (operator) {
            case "+":
                result = calculate.addition(operand1, operand2);
                break;
            case "-":
                result = calculate.substraction(operand1, operand2);
                break;
            case "*":
                result = calculate.multiplication(operand1, operand2);
                break;
            case "/":
                result = calculate.division(operand1, operand2);
                break;
            case "%":
                result = calc.modulo(operand1, operand2);
            default:
                System.out.println("Invalid operator");
                return;

        }
        System.out.println("Result = " + result);
    }
}