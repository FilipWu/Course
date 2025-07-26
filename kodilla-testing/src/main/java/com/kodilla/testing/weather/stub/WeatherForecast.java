package com.kodilla.testing.weather.stub;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WeatherForecast {
    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {
        Map<String, Double> resultMap = new HashMap<>();

        for (Map.Entry<String, Double> temperature :
                temperatures.getTemperatures().entrySet()) {

            // adding 1 celsius degree to current value
            // as a temporary weather forecast
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); //
        }
        return resultMap;
    }

    public double calculateAverageTemperature() {
        double sum = 0;
        int count = 0;
         Map<String,Double> temperatureMap  = temperatures.getTemperatures();
         for (Double temperature : temperatureMap .values()) {
             sum += temperature;
             count++;
         }
         return sum / count;
    }

    public double calculateMedianTemperature() {
        Map<String, Double> temperatureMap  = temperatures.getTemperatures();
        List<Double> temperaturesList = temperatureMap.values().stream().collect(Collectors.toList());
        Collections.sort(temperaturesList);

        int size = temperaturesList.size();
        if (size % 2 == 1) {
            return temperaturesList.get(size / 2);
        } else {
            return temperaturesList.get(size / 2 - 1) + temperaturesList.get(size / 2) /2.0;
        }
    }
}
