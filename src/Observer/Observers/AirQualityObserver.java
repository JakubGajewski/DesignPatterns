package Observer.Observers;

import Observer.AirQualityIndex;

public interface AirQualityObserver {
    void update(AirQualityIndex airQualityIndex);
}
