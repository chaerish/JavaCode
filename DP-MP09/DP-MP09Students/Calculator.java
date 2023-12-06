public class Calculator {
    State state; // 현재 context의 상태
    private String op1; //피연산자 1 (숫자를 계속 이어붙일 것이기 때문에 String 형태로 변환한다.)
    private String op2; // 피연산자 2 (마찬가지이다.)
    private char ope; // 연산자
    public Calculator(){
        initialize();
        state = new StartState(this); //처음에 불려졌을 때는 시작 상태이다.
    }
    public void initialize(){ //초기화
        this.op1 = "";
        this.op2 = "";
    }
    public void caculate(){
        if(this.ope=='+'){
            int result = ((Integer.parseInt(op1)) + (Integer.parseInt(op2)));
            System.out.println("결과 값: " + (Integer.parseInt(op1)) +ope+(Integer.parseInt(op2))+" = "+result);
        }
        if(this.ope=='-'){
            int result = ((Integer.parseInt(op1)) - (Integer.parseInt(op2)));
            System.out.println("결과 값: " + (Integer.parseInt(op1)) +ope+(Integer.parseInt(op2))+" = "+result);
        }
        if(this.ope=='*'){
            int result = ((Integer.parseInt(op1)) * (Integer.parseInt(op2)));
            System.out.println("결과 값: " + (Integer.parseInt(op1)) +ope+(Integer.parseInt(op2))+" = "+result);
        }
        if(this.ope=='/'){
            int result = ((Integer.parseInt(op1)) / (Integer.parseInt(op2)));
            System.out.println("결과 값: " + (Integer.parseInt(op1)) +ope+(Integer.parseInt(op2))+" = "+result);
        }
    }
    public void processDigit(int digit) {
        state.processDigit(digit);
    }
    public void processArithmeticOperator(char ch) {
       state.processArithmeticOperator(ch);
    }

    public void processEqualOperator() {
        state.processEqualOperator();
    }
    public void changeNextState(State state){
        this.state = state;
    } //setState()

    public State getState() {
        return state;
    }

    public String getOp1() {
        return op1;
    }

    public void setOp1(int op1) {
        this.op1 += op1;
    }

    public String getOp2() {
        return op2;
    }

    public void setOp2(int op2) {
        this.op2 += op2;
    }

    public char getOpe() {
        return ope;
    }

    public void setOpe(char ope) {
        this.ope = ope;
    }
}
