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

    @Test
    public static void testRemove() {
        Route route = new Route();

        Location city = new Settlement();
        city.setName("Москва");
        city.setId(123);
        city.setLatitude(234.55);
        city.setLongitude(345.75);

        Location villageOne = new Waypoint();
        villageOne.setName("Сызрань");
        villageOne.setId(345);
        villageOne.setLatitude(123.45);
        villageOne.setLongitude(789.65);

        Location villageTwo = new Settlement();
        villageTwo.setName("Урюпинск");
        villageTwo.setId(567);
        villageTwo.setLatitude(275.89);
        villageTwo.setLongitude(195.38);

        route.addNewLocation(city);
        route.addNewLocation(villageOne);
        route.addNewLocation(villageTwo);

        Location locationOne = new Location();
        locationOne.setName("Мухосранск");
        locationOne.setId(345);
        locationOne.setLatitude(123.45);
        locationOne.setLongitude(789.65);

        route.remove(locationOne);

        List<Location> locations = new ArrayList<>();
        locations.add(city);
        locations.add(villageOne);
        locations.add(villageTwo);

        Assert.assertEquals(route.getLocations(), locations);

        locationOne.setName("Самара");
        locationOne.setId(345);
        locationOne.setLatitude(752.341);
        locationOne.setLongitude(1234.865);
        route.remove(locationOne);

        Assert.assertEquals(route.getLocations(), locations);

        locationOne.setName("Самара");
        locationOne.setId(781);
        locationOne.setLatitude(752.341);
        locationOne.setLongitude(1234.865);

        Assert.assertEquals(route.getLocations(), locations);
    }

    @Test
    public static void testEquals() {
        Route routeOne = new Route();
        Route routeTwo = new Route();
        Location city = new Settlement();
        city.setName("Москва");
        city.setId(123);
        city.setLatitude(234.55);
        city.setLongitude(345.75);

        Location villageOne = new Waypoint();
        villageOne.setName("Павлово");
        villageOne.setId(345);
        villageOne.setLatitude(123.45);
        villageOne.setLongitude(789.65);

        Location villageTwo = new Settlement();
        villageTwo.setName("Иваново");
        villageTwo.setId(567);
        villageTwo.setLatitude(275.89);
        villageTwo.setLongitude(195.38);

        routeOne.addNewLocation(city);
        routeOne.addNewLocation(villageOne);
        routeOne.addNewLocation(villageTwo);

        routeTwo.addNewLocation(city);
        routeTwo.addNewLocation(villageOne);
        routeTwo.addNewLocation(villageTwo);

        Assert.assertEquals(routeTwo, routeOne);

        routeOne.removeLocation(1);
        routeOne.addNewLocation(villageOne);

        Assert.assertNotEquals(routeTwo, routeOne);
    }
}
