package ru.ssau.tk.kmaster.practice.Tasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyLinesTest {

    @Test
    public static void testStringCharacter() {
        String string = "This is string";
        MyLines.stringCharacter(string);
    }

    @Test
    public static void testStringOfBytes() {
        String string = "Hello, world!";
        MyLines.stringOfBytes(string);
        System.out.println();
        String newString = "Привет, мир!";
        MyLines.stringOfBytes(newString);
    }

    @Test
    public static void testComparison() {
        MyLines.comparison();
    }

    @Test
    public static void testPalindrome() {
        String string = "123321";
        Assert.assertTrue(MyLines.palindrome(string));

        String newString = "123456";
        Assert.assertFalse(MyLines.palindrome(newString));
    }

    @Test
    public static void testStringComparison() {
        String stringOne = "hello";
        String stringTwo = "WORLD";
        Assert.assertTrue(MyLines.stringComparison(stringOne, stringTwo));
        Assert.assertFalse(MyLines.stringComparison(null, stringTwo));
        Assert.assertFalse(MyLines.stringComparison(null, null));
        Assert.assertFalse(MyLines.stringComparison(stringOne, "HELLO"));
        Assert.assertFalse(MyLines.stringComparison(stringOne, "hello"));
    }

    @Test
    public static void testScreening() {
        MyLines.screening();
    }

    @Test
    public static void testIndexOfString() {
        Assert.assertEquals(MyLines.indexOfString("понимать", "мать"), 4);
        Assert.assertEquals(MyLines.indexOfString("абракадабра", "бра"), 1);
        Assert.assertEquals(MyLines.indexOfString("абракадабра", "бам"), -1);
    }

    @Test
    public static void testIndexOfStringTwo() {
        Assert.assertEquals(MyLines.indexOfStringTwo("asfasfa", "asf"), 3);
        Assert.assertEquals(MyLines.indexOfStringTwo("12345343534", "34"), 5);
        Assert.assertEquals(MyLines.indexOfStringTwo("345121212", "45"), -1);
    }
}
