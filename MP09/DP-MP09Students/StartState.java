public class StartState implements State {
    private Calculator calculator;
    public StartState(Calculator calculator){
        this.calculator = calculator;
    }

    @Override
    public void processDigit(int digit) {
        calculator.setOp1(digit);
        calculator.changeNextState(new Operand1(calculator));
    }
}
