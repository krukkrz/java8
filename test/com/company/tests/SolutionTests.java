package com.company.tests;

import com.company.Solution;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SolutionTests {

    @Test
    public void shouldReturn5(){
        Solution sol = new Solution();
        int A[] = {1,2,3,4,6};
        assertEquals(5, sol.solution(A));
    }
}
