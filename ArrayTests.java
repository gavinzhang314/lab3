import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 3, 4, 5, 6, 7, 8, 9 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 9, 8, 7, 6, 5, 4, 3 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = { 10, 20, 30, 40, 50, 60, 70 };
    assertArrayEquals(new int[]{ 70, 60, 50, 40, 30, 20, 10 }, ArrayExamples.reversed(input1));
  }

  @Test
  public void testAverageWithoutLowest() {
    double[] input1 = { 1, 2, 3, 4, 5 };
    assertEquals(14 / 4.0, ArrayExamples.averageWithoutLowest(input1), 0.01);

    double[] input2 = { 1, 1, 2, 3, 4, 5};
    assertEquals(3.0, ArrayExamples.averageWithoutLowest(input2), 0.01);
  }
}