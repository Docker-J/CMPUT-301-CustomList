package com.example.simpleparadox.listycity;

public class City implements Comparable<City>{
    private String city;
    private String province;

    /**
     * Constructor
     *
     * @param city This is a name of new city
     * @param province This is a province of the new city
     */
    City(String city, String province){
        this.city = city;
        this.province = province;
    }

    /**
     * This returns the name of the city
     *
     * @return Return name of the city as a String
     */
    String getCityName(){
        return this.city;
    }

    /**
     * This returns the province of the city
     *
     * @return Return province of the city as a String
     */
    String getProvinceName(){
        return this.province;
    }

    /**
     * This compares City objects with their name
     *
     * @param city This is a candidate city to compare
     * @return Return result of the comparison by name of the city
     */
    @Override
    public int compareTo(City city) {
        return this.city.compareTo(city.getCityName());
    }
}
