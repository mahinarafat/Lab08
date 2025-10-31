package com.example.lab08;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CustomListTest {
    @Test
    public void testHasCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        list.addCity(calgary);
// This will fail initially because hasCity() doesn't exist
        assertTrue(list.hasCity(calgary));
    }

    public void testDeleteCity() {
        CustomList list = new CustomList();
        City calgary = new City("Calgary", "AB");
        City edmonton = new City("Edmonton", "AB");

        list.addCity(calgary);
        list.addCity(edmonton);

        list.deleteCity(calgary);

        assertFalse(list.hasCity(calgary));
        assertTrue(list.hasCity(edmonton));
    }

//    public void testCountCities() {
//        CustomList list = new CustomList();
//        assertEquals(0, list.countCities());
//
//        City calgary = new City("Calgary", "AB");
//        City edmonton = new City("Edmonton", "AB");
//
//        list.addCity(calgary);
//        assertEquals(1, list.countCities());
//
//        list.addCity(edmonton);
//        assertEquals(2, list.countCities());
//
//        list.deleteCity(calgary);
//        assertEquals(1, list.countCities());
//    }
}