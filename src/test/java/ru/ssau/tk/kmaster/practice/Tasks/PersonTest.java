package ru.ssau.tk.kmaster.practice.Tasks;

import org.testng.annotations.Test;

import org.testng.Assert;

public class PersonTest {
    @Test
    public static void testingSettersAndGetters() {
        Person person = new Person();
        person.setFirstName("Krylov");
        person.setSecondName("Kirill");
        person.setPassportId(3912);

        Assert.assertEquals(person.getFirstName(), "Krylov");
        Assert.assertEquals(person.getSecondName(), "Kirill");
        Assert.assertEquals(person.getPassportId(), 3912);
    }


}