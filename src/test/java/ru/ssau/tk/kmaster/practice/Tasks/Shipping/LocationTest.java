package ru.ssau.tk.kmaster.practice.Tasks.Shipping;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LocationTest {

    @Test
    public static void testEqualsAndHashCode() {
        Location city = new Settlement();
        city.setId(0);
        city.setName("Москва");
        Location villageOne = new Waypoint();
        villageOne.setId(1);
        villageOne.setName("Самара");
        Location villageTwo = new Waypoint();
        villageTwo.setId(1);
        villageTwo.setName("Урюпинск");
        Assert.assertNotEquals(villageOne, city);
        Assert.assertNotEquals(villageTwo, city);
        Assert.assertEquals(villageTwo, villageOne);
    }
}
