package ru.ssau.tk.kmaster.practice.Tasks.Shipping;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.*;

public class RouteTest {

    @Test
    public void testGetterAndAddNewLocation() {
        Route route = new Route();
        Location city = new Settlement();
        city.setName("Самара");
        Location villageOne = new Waypoint();
        villageOne.setName("Муханово");
        Location villageTwo = new Waypoint();
        villageTwo.setName("МосковСити");
        Location villageThree = new Waypoint();
        villageThree.setName("Безенчук");
        Location villageFour = new Settlement();
        villageFour.setName("Бебра");
        route.addNewLocation(city);
        route.addNewLocation(villageOne);
        route.addNewLocation(villageTwo);
        route.addNewLocation(villageThree);
        route.addNewLocation(1, villageFour);
        List<Location> locations = new ArrayList<>();
        locations.add(city);
        locations.add(villageFour);
        locations.add(villageOne);
        locations.add(villageTwo);
        locations.add(villageThree);
        Assert.assertEquals(route.getLocations(), locations);
    }

    @Test
    public void testRemoveLocation() {
        Route route = new Route();
        Location city = new Settlement();
        city.setName("Самара");
        Location villageOne = new Waypoint();
        villageOne.setName("Муханово");
        Location villageTwo = new Waypoint();
        villageTwo.setName("МоскоуСити");
        Location villageThree = new Waypoint();
        villageThree.setName("Безенчук");
        Location villageFour = new Settlement();
        villageFour.setName("Бебра");
        route.addNewLocation(city);
        route.addNewLocation(villageOne);
        route.addNewLocation(villageTwo);
        route.addNewLocation(villageThree);
        route.addNewLocation(1, villageFour);
        route.removeLocation(0);
        route.removeLocation(0);
        route.removeLocation(0);
        route.removeLocation(0);
        route.removeLocation(0);
        Assert.assertEquals(route.getLocations(), new ArrayList<>());
    }
}
