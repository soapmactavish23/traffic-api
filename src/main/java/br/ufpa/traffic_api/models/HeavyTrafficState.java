package br.ufpa.traffic_api.models;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class HeavyTrafficState implements TrafficState {
    private final TrafficControl trafficControl;

    @Override
    public void handleTraffic() {
        log.info("Trânsito intenso, veículos se movendo lentamente.");
    }
}
