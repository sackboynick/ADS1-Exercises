public class LinkedStack<T> implements Stack<T> {
    private LinkedList<T> list;

    public LinkedStack(){
        list=new LinkedList<>();
    }

    public boolean isEmpty() {
        return list.isEmpty();
    }

    @Override
    public void push(T elm) {

        list.addToFront(elm);
    }

    public T pop() throws EmptyListException {
        return list.removeFirst();
    }

}
