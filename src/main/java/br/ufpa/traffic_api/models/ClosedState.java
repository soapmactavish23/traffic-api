package br.ufpa.traffic_api.models;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class ClosedState implements TrafficState {
    private final TrafficControl trafficControl;

    @Override
    public void handleTraffic() {
        log.info("Estrada fechada para veículos.");
    }
}