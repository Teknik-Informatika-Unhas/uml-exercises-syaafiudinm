public class Calc {
    protected double result;
    protected double operand1;
    protected double operand2;

    protected void setOperand(double operand1, double operand2){
        this.operand1 = operand1;
        this.operand2 = operand2;
    }

    protected void getOperand (){
        System.out.println("Operand 1 : " + operand1);
        System.out.println("Operand 2 : " + operand2);
    }

    protected double addition (double operand1, double operand2){
        return operand1 + operand2;
    }
    protected double substraction (double operand1, double operand2){
        return operand1 - operand2;
    }
    protected double multiplication (double operand1, double operand2){
        return operand1 * operand2;
    }
    protected double division (double operand1, double operand2){
        if (operand2 == 0){
            System.out.println("Error cause division by zero!");
        }
        return operand1 / operand2;
    }

}
