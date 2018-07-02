package observer.observers;

import observer.AirQualityIndex;

public interface AirQualityObserver {
    void update(AirQualityIndex airQualityIndex);
}
