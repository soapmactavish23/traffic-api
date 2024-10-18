package br.ufpa.traffic_api.models;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class FreeFlowState implements TrafficState {
    private final TrafficControl trafficControl;

    @Override
    public void handleTraffic() {
        log.info("Trânsito fluindo livremente.");
    }
}