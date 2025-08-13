package com.design.patterns.structural.adapter;

/**
 * @author prakashkaruppusamy
 */
public class WeatherAdapter {
    public int findTemperature(int zipcode) {

        String city = null;
        if(zipcode==19406){
            city = "New York";
        }

        WeatherFinder finder =     new WeatherFinderImp();
        return  finder.find(city);
    }
}
