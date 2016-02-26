package com.arthurneuman;

public class WeatherData {
    // class fields
    private final static String TEMP_UNIT = "F";
    private final static String HUMIDITY_UNIT = "%";
    private final static String PRECIPITATION_UNIT = "%";
    public final static int FEEZEING_TEMP = 32;

    // instance fields
    public String cityName;
    private double temperature;
    public double humidity;
    public double precipitation;

    // constructor
    public WeatherData(String cityName, double temperature,
                       double humidity, double precipitation) {
        this.cityName = cityName;
        setTemperature(temperature);
        this.humidity = humidity;
        this.precipitation = precipitation;
    }

    // class methods
    public static double tempFtoC(double tempF) {
        return 5.0 / 9 * (tempF - 32);
    }

    public static double tempCtoF(double tempC) {
        return 9.0 / 5 * tempC + 32;
    }

    // instance methods
    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double newTemp) {
        temperature = newTemp < -461 ? -461 : newTemp;
    }

    private boolean willSnow() {
        return (temperature <= FEEZEING_TEMP) && (precipitation >= 50);
    }

    public void displayWeatherReport() {
        String temp = temperature + TEMP_UNIT;
        String humid = humidity + HUMIDITY_UNIT;
        String precip = precipitation + PRECIPITATION_UNIT;
        String snowLikely = willSnow() ? "likely" : "unlikely";

        System.out.println("The current temperature in " + cityName
                + " is " + temp
                + ". The current relative humidity is " + humid
                + ". The current chance of precipitation is " + precip
                + ". It is " + snowLikely + " to snow.");
    }

    public String toString() {
        String temp = temperature + TEMP_UNIT;
        String humid = humidity + HUMIDITY_UNIT;
        String precip = precipitation + PRECIPITATION_UNIT;
        String snowLikely = willSnow() ? "likely" : "unlikely";

        return "The current temperature in " + cityName
                + " is " + temp
                + ". The current relative humidity is " + humid
                + ". The current chance of precipitation is " + precip
                + ". It is " + snowLikely + " to snow.";
    }
}