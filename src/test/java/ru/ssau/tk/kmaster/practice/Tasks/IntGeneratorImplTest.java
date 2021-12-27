package ru.ssau.tk.kmaster.practice.Tasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class IntGeneratorImplTest {

    @Test
    public static void testNextInt() {
        IntGenerator object = new IntGeneratorImpl();
        Assert.assertEquals(object.nextInt(), 0);
    }
}
