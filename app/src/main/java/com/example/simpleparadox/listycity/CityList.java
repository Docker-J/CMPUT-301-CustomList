package com.example.simpleparadox.listycity;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CityList {
    private List<City> cities = new ArrayList<>();

    /**
     * This adds a city to the list if the city does not exist
     *
     * @param city This is a candidate city to add
     */
    public void add(City city) {
        if (cities.contains(city)) {
            throw new IllegalArgumentException();
        }
        cities.add(city);
    }

    /**
     * This returns a sorted list of cities
     *
     * @return Return the sorted list
     */
    public List<City> getCities() {
        List<City> list = cities;
        Collections.sort(list);
        return list;
    }

    /**
     * This checks the given city in the list or not
     *
     * @param city This is a candidate city to check
     * @return Return true or false
     */
    public boolean hasCity(City city) {
        return cities.contains(city);
    }

//    /**
//     * This removes the given city from the list if it is in there
//     *
//     * @param city This is a candidate city to delete
//     */
//    public void delete(City city) {
//        if (!cities.contains(city)) {
//            throw new IllegalArgumentException();
//        }
//        cities.remove(city);
//    }
//
//    /**
//     * This counts how many cities are in the list.
//     *
//     * @return Return the size of the city list
//     */
//    public int countCities() {
//        return this.cities.size();
//    }
}
