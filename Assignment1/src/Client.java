import java.util.ArrayList;

public class Client {
    private CalculatorVisitor calculatorVisitor;
    public Client(){
        this.calculatorVisitor=new CalculatorVisitor();
    }
    public int evaluateExpression()
    {
        try {
            return calculatorVisitor.getResult();
        } catch (MalformedExpressionException | EmptyListException e) {
            throw new RuntimeException(e);
        }
    }
}
