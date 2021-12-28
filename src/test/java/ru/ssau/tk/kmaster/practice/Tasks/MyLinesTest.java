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

    @Test
    public static void testLastIndexOfString() {
        Assert.assertEquals(MyLines.lastIndexOfString("солнышко", "ко"), 6);
        Assert.assertEquals(MyLines.lastIndexOfString("12345343534", "35"), 7);
        Assert.assertEquals(MyLines.lastIndexOfString("345121212", "99"), -1);
    }

    @Test
    public static void testPostfixAndPrefix() {
        String[] string = new String[]{"1234", "12678", "2348"};
        Assert.assertEquals(MyLines.postfixAndPrefix(string, "12", "8"), 1);
        string = new String[]{"abcdf", "adref", "antjkf", "dsgbf"};
        Assert.assertEquals(MyLines.postfixAndPrefix(string, "a", "f"), 3);
    }

    @Test
    public static void testNumberOfRows() {
        String[] string = new String[]{"     1237653425    ", "   98534575  ", "  1366475  "};
        Assert.assertEquals(MyLines.numberOfRows(string, "1", "5"), 2);
    }

    @Test
    public static void testReplacingString() {
        Assert.assertEquals(MyLines.replacingString("ороророро", "оро", "ро"), "роррро");
        Assert.assertEquals(MyLines.replacingString("гиппопотам", "по", "тук"), "гиптуктуктам");
    }

    @Test
    public static void testSubstring() {
        Assert.assertEquals(MyLines.substring("аргентина", 2, 5), "ген");
        Assert.assertEquals(MyLines.substring("аргентина", -1, 11), "аргентина");
        Assert.assertEquals(MyLines.substring("аргентина", -1, -2), "");
    }

    @Test
    public static void testPrintObject() {
        Person person = new Person("Kirill", "Krylov", 1234, Gender.MALE);
        Point point = new Point(1, 2, 3);
        NamedPoint namedPoint = new NamedPoint(1, 2, 3, "Точка");
        Matrix matrix = new Matrix(2, 3);
        matrix.setAt(0, 0, 1);
        matrix.setAt(0, 1, 2);
        matrix.setAt(0, 2, 3);
        matrix.setAt(1, 0, 4);
        matrix.setAt(1, 1, 5);
        matrix.setAt(1, 2, 6);
        MyLines.printObject(person);
        MyLines.printObject(point);
        MyLines.printObject(namedPoint);
        MyLines.printObject(matrix);
    }

    @Test
    public static void testArrayString() {
        Assert.assertEquals(MyLines.arrayString("rtrta a  sgafg aetag"), new String[]{"Rtrta", "A", "", "Sgafg", "Aetag"});
    }

    @Test
    public static void testFromArrayToString() {
        String[] array = new String[]{"gdag", "argarg", "adaerh"};
        Assert.assertEquals(MyLines.fromArrayToString(array), "gdag, argarg, adaerh");
    }

    @Test
    public static void testReplacingCharacterWithIndex() {
        Assert.assertEquals(MyLines.replacingCharacterWithIndex("абракадабра"), "01р8а6а4а2б0");
    }
}
