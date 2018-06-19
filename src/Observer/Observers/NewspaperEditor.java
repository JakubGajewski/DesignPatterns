package Observer.Observers;

import Observer.AirQualityIndex;

public class NewspaperEditor implements AirQualityObserver {
    @Override
    public void update(AirQualityIndex airQualityIndex) {
        switch (airQualityIndex){
            case GOOD_QUALITY:
                System.out.println("Everything is okay with the pollution, let's write something about politics!");
                break;
            case MODERATE_QUALITY:
                System.out.println("There is some pollution, let's blame political opposition!");
                break;
            case BAD_QUALITY:
                System.out.println("Let's take a train to Mielno!");
                break;
        }
    }
}
