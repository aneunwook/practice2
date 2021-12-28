package ru.ssau.tk.kmaster.practice.Tasks;

import org.testng.annotations.Test;

public class MyLinesTest {

    @Test
    public static void testStringCharacter() {
        String string = "This is string";
        MyLines.stringCharacter(string);
    }
}
