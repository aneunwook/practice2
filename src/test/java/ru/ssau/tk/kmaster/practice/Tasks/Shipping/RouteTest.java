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

    @Test
    public static void testIterator() {
        Route route = new Route();
        Location city = new Settlement();
        city.setId(0);
        Location villageOne = new Waypoint();
        villageOne.setId(1);
        Location villageTwo = new Settlement();
        villageTwo.setId(2);
        route.addNewLocation(city);
        route.addNewLocation(villageOne);
        route.addNewLocation(villageTwo);
    }

    @Test
    public static void testGetterFirstAndLastLocations() {
        Route route = new Route();
        Location city = new Settlement();
        city.setName("Самара");
        Location villageOne = new Waypoint();
        villageOne.setName("Безенчук");
        Location villageTwo = new Settlement();
        villageTwo.setName("Бебра");
        route.addNewLocation(city);
        route.addNewLocation(villageOne);
        route.addNewLocation(villageTwo);
        Assert.assertEquals(route.getFirstLocation().getName(), "Самара");
        Assert.assertEquals(route.getLastLocation().getName(), "Бебра");
    }
}
