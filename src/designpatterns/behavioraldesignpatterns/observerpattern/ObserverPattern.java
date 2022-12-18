package designpatterns.behavioraldesignpatterns.observerpattern;

public class ObserverPattern {
    public ObserverPattern() {
        WeatherStation weatherStation = new WeatherStation();
        WeatherObserver weatherObserver = new WeatherObserver(weatherStation);

        weatherStation.setHumidity(100);
        weatherStation.setTemperature(32);
    }
}
