package br.com.joaomassan.codility.lesson;

import org.junit.Assert;
import org.junit.Test;

public class PermMissingElemTest {

    @Test
    public void solutionTest() {
        PermMissingElem perm = new PermMissingElem();
        Assert.assertEquals(4, perm.solution(new int[]{2, 3, 1, 5}));
        Assert.assertEquals(1, perm.solution(new int[]{}));
        Assert.assertEquals(1, perm.solution(new int[]{2}));
        Assert.assertEquals(1, perm.solution(new int[]{2, 3}));
    }

}