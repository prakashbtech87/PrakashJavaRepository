package com.design.patterns.structural.adapter;

/**
 * @author prakashkaruppusamy
 */
public class WeatherUI {
    public void showTemperature(int zipCode) {

        WeatherAdapter adapter = new WeatherAdapter();
        int temperature = adapter.findTemperature(zipCode);
        System.out.println("Temperature in " + zipCode + " is " + temperature);


    }

    public static void main(String[] args) {
        WeatherUI ui= new WeatherUI();
        ui.showTemperature(19406);
    }
}
