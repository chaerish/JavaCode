public class Operand1 implements State {
    private Calculator calculator;
    public Operand1(Calculator calculator){
        this.calculator = calculator;
    }

    @Override
    public void processDigit(int digit) {
        calculator.setOp1(digit);
    }
    public void processArithmeticOperator(char ch) {
        calculator.setOpe(ch);
        calculator.changeNextState(new Operator(calculator));
    }
}
