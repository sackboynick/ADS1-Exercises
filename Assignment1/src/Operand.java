public class Operand extends Token{
    private int value;

    public void accept(CalculatorVisitor visitor){
        visitor.pushOperand(this);
    }

    public int getValue() {
        return value;
    }

}
