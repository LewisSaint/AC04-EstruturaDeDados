package tests;

import discNode.DiscNode;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class discNodeTest {



    @Test
    void discNodeTeste() {
        DiscNode<String> nodo = new DiscNode("/1024");
        assertEquals("/1024", nodo.getElement());

    }

}
