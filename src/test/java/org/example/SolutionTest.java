package org.example;

import org.junit.Assert;
import org.junit.Test;


public class SolutionTest {

    @Test
    public void romanToIntTest() {
        Solution solution = new Solution();
        Assert.assertEquals(solution.romanToInt("III"), 3);
        Assert.assertEquals(solution.romanToInt("LVIII"), 58);
        Assert.assertEquals(solution.romanToInt("MCMXCIV"), 1994);
    }
}