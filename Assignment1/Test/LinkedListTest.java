import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LinkedListTest<T> {

    private LinkedList<T> linkedList;
    @BeforeEach
    void setUp(){
        System.out.println("-->setUp()");
        linkedList=new LinkedList<>();
    }

    @AfterEach
    void tearDown(){
        System.out.println("<--tearDown()");
    }
    @Test
    void isEmpty() {
        assertTrue(linkedList.isEmpty());
    }

    @Test
    void size() {
        linkedList.addToFront((T) "1");
        linkedList.addToFront((T) "2");
        linkedList.addToFront((T) "3");
        linkedList.addToFront((T) "4");

        assertEquals(linkedList.size(),4);
    }

    @Test
    void addToFront() throws EmptyListException {
        linkedList.addToFront((T) "1");
        linkedList.addToFront((T) "2");
        linkedList.addToFront((T) "3");
        linkedList.addToFront((T) "4");

        assertEquals(linkedList.removeFirst(),"4");
    }

    @Test
    void removeFirst() throws EmptyListException {
        linkedList.addToFront((T) "1");
        linkedList.addToFront((T) "2");
        linkedList.addToFront((T) "3");
        linkedList.addToFront((T) "4");

        assertEquals(linkedList.removeFirst(),"4");
    }
}