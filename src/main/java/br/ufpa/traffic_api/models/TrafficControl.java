package br.ufpa.traffic_api.models;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class TrafficControl {

    private TrafficState state;

    private final TrafficState freeFlowState;
    private final TrafficState heavyTrafficState;
    private final TrafficState congestedState;
    private final TrafficState closedState;

    public TrafficControl() {
        freeFlowState = new FreeFlowState(this);
        heavyTrafficState = new HeavyTrafficState(this);
        congestedState = new CongestedState(this);
        closedState = new ClosedState(this);

        state = freeFlowState; // Começa com tráfego livre
    }

    public void changeState(TrafficState newState) {
        this.state = newState;
    }

    public void handleTraffic() {
        state.handleTraffic();
    }

}
