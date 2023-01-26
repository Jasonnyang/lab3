import static org.junit.Assert.*;
import org.junit.*;
import java.util.*;

public class ListTests {
    @Test
    public void testMerge1() {
        List<String> arr = Arrays.asList("aa", "bb", "cc");
        List<String> arr1 = Arrays.asList("dd", "ee", "ff");
        List<String> arr2 = Arrays.asList("aa", "bb", "cc", "dd", "ee", "ff");
        
        assertArrayEquals(ListExamples.merge(arr, arr1).toArray(), arr2.toArray());
      }

      @Test 
      public void testSumEvenLength5() {
        int[] input1 = { 12, 13, 7, 2, 33};
        assertEquals(EvensExample.sumEvenIndices(input1), 52);
      }
}
