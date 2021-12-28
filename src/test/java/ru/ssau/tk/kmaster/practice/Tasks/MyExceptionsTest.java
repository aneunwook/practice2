package ru.ssau.tk.kmaster.practice.Tasks;

import org.testng.Assert;
import org.testng.annotations.Test;

public class MyExceptionsTest {

    @Test
    public static void testExceptionForPerson() {
        Person person = new Person("Kirill", "Krylov");
        Assert.assertEquals(MyExceptions.exceptionForPerson(person), "Это Kirill Krylov");
    }
}
