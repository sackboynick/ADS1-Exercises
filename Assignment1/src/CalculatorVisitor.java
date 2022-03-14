import java.util.ArrayList;

public class CalculatorVisitor implements Visitor,Calculator{
    private LinkedStack<Token> tokenLinkedStack;

    public CalculatorVisitor(){
        tokenLinkedStack=new LinkedStack<>();
    }
    public void pushOperand(Operand operand){
        tokenLinkedStack.push(operand);
    }

    public void performOperation(Operator operator) throws MalformedExpressionException, EmptyListException {
        tokenLinkedStack.push(operator);
    }

    @Override
    public void visit(Operand operand) {

    }

    @Override
    public void visit(Operator operator) {
    }

    @Override
    public int getResult() throws MalformedExpressionException, EmptyListException {
        int result=0;
        StringBuilder tempInt= new StringBuilder();
        ArrayList<Integer> integers=new ArrayList<>();
        ArrayList<Operator> operators=new ArrayList<>();
        while(!tokenLinkedStack.isEmpty()){
            Token token= tokenLinkedStack.pop();
            if ((token instanceof Operand)){
                tempInt.append(((Operand) token).getValue());
            }
            else if(token instanceof Operator){
                tempInt = new StringBuilder(tempInt.toString()).reverse();
                integers.add(Integer.parseInt(tempInt.toString()));
                operators.add((Operator) token);
            }
        }
        result=integers.get(0);
        int y=0;
        for(int i=1;i< integers.size();i++){
            switch (operators.get(y).getOperation()){
                case ADDITION:
                    result+=integers.get(i);
                    break;
                case SUBTRACTION:
                    result-=integers.get(i);
                    break;
                case MULTIPLICATION:
                    result*=integers.get(i);
                    break;
                case DIVISION:
                    result/=integers.get(i);
            }

            y++;
        }
        return result;
    }
}
