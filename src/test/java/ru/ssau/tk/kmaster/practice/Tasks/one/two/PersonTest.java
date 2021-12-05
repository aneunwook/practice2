package ru.ssau.tk.kmaster.practice.Tasks.one.two;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    private String firstName = "Кирилл";
    private String secondName = "Крылов";
    private int passwordId = 3616;

    private Person p_1 = new Person(firstName, secondName);
    private Person p_2 = new Person(passwordId);
    private Person p_3 = new Person(firstName, secondName, passwordId);

    @Test
    public void testConstructors() {
        Assert.assertEquals(p_1.getFirstName(), firstName);
        Assert.assertEquals(p_1.getSecondName(), secondName);
        Assert.assertEquals(p_2.getPassportId(), passwordId);
        Assert.assertEquals(p_3.getFirstName(), firstName);
        Assert.assertEquals(p_3.getSecondName(), secondName);
        Assert.assertEquals(p_3.getPassportId(), passwordId);
    }
}
