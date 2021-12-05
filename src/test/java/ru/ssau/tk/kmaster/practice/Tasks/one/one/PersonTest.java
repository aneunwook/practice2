package ru.ssau.tk.kmaster.practice.Tasks.one.one;

import org.junit.Assert;
import org.junit.Test;

public class PersonTest {
    private Person person = new Person();
    private String firstName = "Кирилл";
    private String secondName = "Крылов";
    private int passwordId = 3616;

    @Test
    public void testGetSet() {
        person.setFirstName(firstName);
        person.setSecondName(secondName);
        person.setPassportId(passwordId);
        String fN = person.getFirstName();
        String sN = person.getSecondName();
        int pId = person.getPassportId();

        Assert.assertEquals(fN, firstName);
        Assert.assertEquals(sN, secondName);
        Assert.assertEquals(pId, passwordId);
    }
}
