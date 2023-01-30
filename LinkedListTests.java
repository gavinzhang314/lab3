import static org.junit.Assert.*;

import java.util.NoSuchElementException;

import org.junit.*;

public class LinkedListTests {
    LinkedList list;

    @Before
    public void initializeList() {
        list = new LinkedList();
    }

    @Test
    public void testPrepend() {
        list.prepend(10);
        list.prepend(20);
        assertEquals(10, list.root.next.value);
        assertEquals(20, list.root.value);
    }

    @Test
    public void testAppend() {
        list.append(30);
        list.append(40);
        assertEquals(30, list.root.value);
        assertEquals(40, list.root.next.value);
    }

    @Test
    public void testFirst() {
        assertThrows(Exception.class, () -> list.first());
        list.append(50);
        assertEquals(50, list.first());
    }

    @Test
    public void testLast() {
        assertThrows(NoSuchElementException.class, () -> list.last());
        list.append(60);
        assertEquals(60, list.last());
        list.append(70);
        assertEquals(70, list.last());
    }
}
