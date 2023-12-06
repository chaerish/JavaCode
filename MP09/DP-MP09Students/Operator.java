public class Operator implements State {
    private Calculator calculator;
    public Operator(Calculator calculator){
        this.calculator = calculator;
    }

    @Override
    public void processDigit(int digit) {
        calculator.setOp2(digit);
        calculator.changeNextState(new Operand2(calculator));
    }
    public void processArithmeticOperator(char ch) {
        calculator.setOpe(ch);
    }
}
