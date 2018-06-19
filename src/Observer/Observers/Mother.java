package Observer.Observers;

import Observer.AirQualityIndex;

public class Mother implements AirQualityObserver {
    @Override
    public void update(AirQualityIndex airQualityIndex) {
        switch (airQualityIndex){
            case GOOD_QUALITY:
                System.out.println("Let's go for a walk!");
                break;
            case MODERATE_QUALITY:
                System.out.println("Let's stay inside!");
                break;
            case BAD_QUALITY:
                System.out.println("Let's take a train to Mielno!");
                break;
        }
    }
}
