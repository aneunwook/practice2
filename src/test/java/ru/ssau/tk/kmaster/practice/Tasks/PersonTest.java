package ru.ssau.tk.kmaster.practice.Tasks;

import org.testng.annotations.Test;

import org.testng.Assert;

public class PersonTest {

    @Test
    public static void testingFirstName() {
        Person person = new Person();
        person.setFirstName("Kirill");
        Assert.assertEquals(person.getFirstName(), "Kirill");
    }

    @Test
    public static void testingLastName() {
        Person person = new Person();
        person.setSecondName("Krylov");
        Assert.assertEquals(person.getSecondName(), "Krylov");
    }

    @Test
    public static void testingPassportId() {
        Person person = new Person();
        person.setPassportId(1234);
        Assert.assertEquals(person.getPassportId(), 1234);
    }

    @Test
    public static void testingConstructorWithoutParametersConstructor() {
        Person person = new Person();
        Assert.assertEquals(person.getFirstName(), "Unknown");
        Assert.assertEquals(person.getSecondName(), "Unknown");
        Assert.assertEquals(person.getPassportId(), 0);
        Assert.assertEquals(person.getGender(), Gender.MALE);
    }

    @Test
    public static void testingConstructorWithOneParameter() {
        Person person = new Person(1234);
        Assert.assertEquals(person.getPassportId(), 1234);
    }

    @Test
    public static void testingConstructorWithTwoParameter() {
        Person person = new Person("Kirill", "Krylov");
        Assert.assertEquals(person.getFirstName(), "Kirill");
        Assert.assertEquals(person.getSecondName(), "Krylov");
    }

    @Test
    public static void testingConstructorWithThreeParameter() {
        Person person = new Person("Kirill", "Krylov", 1234, Gender.MALE);
        Assert.assertEquals(person.getFirstName(), "Kirill");
        Assert.assertEquals(person.getSecondName(), "Krylov");
        Assert.assertEquals(person.getPassportId(), 1234);
        Assert.assertEquals(person.getGender(), Gender.MALE);
    }

    @Test
    public static void testToString() {
        Person person = new Person("Kirill", "Krylov");
        Assert.assertEquals(person.toString(), "Это Kirill Krylov");
    }
}