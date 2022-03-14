import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedStackTest<T> {

    private LinkedStack<T> linkedStack;

    @BeforeEach
    void setUp(){
        System.out.println("-->setUp()");
        linkedStack=new LinkedStack<>();
    }

    @AfterEach
    void tearDown(){
        System.out.println("<--tearDown()");
    }
    @Test
    void isEmpty() {
        assertTrue(linkedStack.isEmpty());
    }

    @Test
    void push() throws EmptyListException {
        String elm="Hello";
        linkedStack.push((T) elm);
        assertEquals("Hello", linkedStack.pop());
    }

    @Test
    void pop() throws EmptyListException {
        String elm="Hello";
        linkedStack.push((T) elm);
        linkedStack.push((T) "Hi");
        linkedStack.push((T) "Good Morning");
        assertEquals("Good Morning", linkedStack.pop());
    }
}