public class Operator extends Token{
    private Operation operation;

    public Operator(){

    }

    public void accept(CalculatorVisitor visitor){
        try {
            visitor.performOperation(this);
        } catch (MalformedExpressionException | EmptyListException e) {
            throw new RuntimeException(e);
        }
    }

    public Operation getOperation() {
        return operation;
    }
}
