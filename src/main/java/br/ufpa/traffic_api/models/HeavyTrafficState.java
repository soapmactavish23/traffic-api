package br.ufpa.traffic_api.models;

import br.ufpa.traffic_api.utils.Constants;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
public class HeavyTrafficState implements TrafficState {
    private final TrafficControl trafficControl;

    @Override
    public void handleTraffic() {
        log.info(Constants.HEAVY);
    }
}
