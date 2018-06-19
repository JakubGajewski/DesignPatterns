package Observer.Observers;

import Observer.AirQualityIndex;

public class SchoolDirector implements AirQualityObserver {
    @Override
    public void update(AirQualityIndex airQualityIndex) {
        switch (airQualityIndex){
            case GOOD_QUALITY:
                System.out.println("Children go to school!");
                break;
            case MODERATE_QUALITY:
                System.out.println("Children don't go anywhere!");
                break;
            case BAD_QUALITY:
                System.out.println("Let's take a train to Mielno!");
                break;
        }
    }
}
