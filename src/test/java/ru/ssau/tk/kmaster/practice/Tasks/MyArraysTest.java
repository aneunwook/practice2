package ru.ssau.tk.kmaster.practice.Tasks;

import org.testng.Assert;
import org.testng.annotations.Test;

import static ru.ssau.tk.kmaster.practice.Tasks.MyArrays.*;

public class MyArraysTest {

    @Test
    public static void testSize() {
        Assert.assertEquals(size(13).length, 13);
        Assert.assertEquals(size(1).length, 1);
        Assert.assertEquals(size(0).length, 0);
    }
}
