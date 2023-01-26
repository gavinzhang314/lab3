import static org.junit.Assert.*;
import java.util.ArrayList;
import org.junit.*;

public class ListTests {

    ArrayList<String> list1, list2;

    class ExampleStringChecker implements StringChecker {
        @Override
        /**
         * Returns {@code false} if {@code s} is equal to {@code a}; returns 
         * {@code true} otherwise.
         */
        public boolean checkString(String s) {
            return !s.equals("a");
        }
    }

    @Before
    public void initializeList() {
        list1 = new ArrayList<String>();
        list1.add("a");
        list1.add("m");
        list1.add("p");

        list2 = new ArrayList<String>();
        list2.add("b");
        list2.add("n");
        list2.add("z");
    }

    @Test
    public void testFilter() {
        ArrayList<String> expected = new ArrayList<>();
        expected.add("m");
        expected.add("p");
        assertEquals(expected, ListExamples.filter(list1, new ExampleStringChecker()));
    }

    @Test
    public void testMerge() {
        ArrayList<String> expected = new ArrayList<>();
        expected.add("a");
        expected.add("b");
        expected.add("m");
        expected.add("n");
        expected.add("p");
        expected.add("z");
        assertEquals(expected, ListExamples.merge(list1, list2));
    }

}
