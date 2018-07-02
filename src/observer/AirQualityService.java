package observer;

import observer.observers.AirQualityObserver;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AirQualityService {

    Scanner sc = new Scanner (System.in);
    AirQualityIndex airQualityIndex;
    List<AirQualityObserver> airQualityObservers = new ArrayList<>();

    public void addObserver(AirQualityObserver observer) {
        airQualityObservers.add(observer);
    };

    public void remove(AirQualityObserver observer) {
        airQualityObservers.remove(observer);
    };

    public AirQualityIndex getUserAirQualityInfo () {
        System.out.println("How much PM10 do you have?");
        double pm10 = sc.nextDouble();
        System.out.println("How much PM2.5 do you have?");
        double pm2_5 = sc.nextDouble();
        System.out.println("How much benzopirene do you have?");
        double benzopirene = sc.nextDouble();

        if (pm10 < 50 && pm2_5<10 && benzopirene < 1) {
            airQualityIndex = AirQualityIndex.GOOD_QUALITY;
        } else if (pm10 < 100 && pm2_5<20 && benzopirene < 2) {
            airQualityIndex = AirQualityIndex.MODERATE_QUALITY;
        } else {
            airQualityIndex = AirQualityIndex.BAD_QUALITY;
        }
        return airQualityIndex;
    }

    public AirQualityService() {
    }

    public void notifyObservers() {
       for (AirQualityObserver observer : airQualityObservers) {
            observer.update(airQualityIndex);
        }

    }
}
