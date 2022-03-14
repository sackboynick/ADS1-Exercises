public abstract class Token{
    private Client client;
    private Visitor calculatorVisitor;

    public abstract void accept(CalculatorVisitor calculatorVisitor);
}
