package main;

import junit.framework.TestCase;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class ProblemTest extends TestCase {
@Test
    public void testNumberCount() {
        Problem p = new Problem(5, 1, 10, 20);
        assertEquals(5, p.objectCategories.length);
    }
    @Test
    public void testAtLeastOneItem() {
        Problem p = new Problem(5, 1, 10, 20);
        p.objectCategories[0] = new Item(0,1,1);
        Assert.assertEquals(2, p.Solve(2).ObjectIndices.size());
    }
    public void testNoneFillsRequirements() {
        Problem p = new Problem(5, 1, 10, 20);
        p.objectCategories[0] = new Item(0,99,1);
        Assert.assertEquals(0, p.Solve(2).ObjectIndices.size());
    }

    @Test
    public void testResult(){
        Problem p =  new Problem(5,420,0,10);
        List<Integer> l = p.Solve(5).ObjectIndices;
        System.out.println(l);
        Integer[] s = new Integer[l.size()];
        l.toArray(s);

        Integer[] check = {2,2};
        Assert.assertArrayEquals(check, s);


    }


}