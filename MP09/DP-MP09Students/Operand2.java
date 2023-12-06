public class Operand2 implements State {
    private Calculator calculator;
    public Operand2(Calculator calculator){
        this.calculator = calculator;
    }
    @Override
    public void processDigit(int digit) {
        calculator.setOp2(digit);
    }
    public void processEqualOperator() {
        calculator.caculate();
        calculator.changeNextState(new StartState(calculator));
        calculator.initialize();
    }
}
