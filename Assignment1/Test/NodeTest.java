import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertAll;
import static org.junit.jupiter.api.Assertions.assertEquals;


class NodeTest<T> {
    private Node<T> node;

    @BeforeEach void setUp(){
        System.out.println("-->setUp()");
        node=new Node<>();
    }

    @AfterEach void tearDown(){
        System.out.println("<--tearDown()");
    }

    @Test
    void setData(T data){
        node.setData(data);

        assertAll("Test obj1 with obj2 equality",
                () -> assertEquals(data, node.getData()));

    }




}