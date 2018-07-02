package observer;

import observer.observers.Mother;
import observer.observers.NewspaperEditor;
import observer.observers.SchoolDirector;

public class Main {
    public static void main(String[] args) {

        AirQualityService airQualityService = new AirQualityService();

        Mother Grazyna = new Mother();
        Mother Krystyna = new Mother();
        SchoolDirector Krycha = new SchoolDirector();
        NewspaperEditor Tereska = new NewspaperEditor();

        airQualityService.addObserver(Grazyna);
        airQualityService.addObserver(Krycha);
        airQualityService.addObserver(Tereska);
        airQualityService.addObserver(Krystyna);

        airQualityService.getUserAirQualityInfo();
    }
}
