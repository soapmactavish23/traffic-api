package br.ufpa.traffic_api.controller;

import br.ufpa.traffic_api.TrafficControlDocumentation;
import br.ufpa.traffic_api.models.TrafficControl;
import br.ufpa.traffic_api.utils.Constants;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/traffic-control")
public class TrafficControlController implements TrafficControlDocumentation {

    private final TrafficControl trafficControl;

    public TrafficControlController() {
        this.trafficControl = new TrafficControl();
    }

    @Override
    @GetMapping("/current-state")
    public String getCurrentState() {
        trafficControl.handleTraffic();
        return "Estado atual do tráfego processado.";
    }

    @Override
    @PutMapping("/free")
    public String freeState() {
        trafficControl.changeState(trafficControl.getFreeFlowState());
        return Constants.FREE;
    }

    @Override
    @PutMapping("/heavy")
    public String heavyState() {
        trafficControl.changeState(trafficControl.getHeavyTrafficState());
        return Constants.HEAVY;
    }

    @Override
    @PutMapping("/congested")
    public String congestedState() {
        trafficControl.changeState(trafficControl.getCongestedState());
        return Constants.CONGESTED;
    }

    @Override
    @PutMapping("/closed")
    public String closedState() {
        trafficControl.changeState(trafficControl.getClosedState());
        return Constants.CLOSED;
    }

    @Override
    @PostMapping("/change-state")
    public String changeState(@RequestParam String state) {
        switch (state.toLowerCase()) {
            case "free":
                trafficControl.changeState(trafficControl.getFreeFlowState());
                break;
            case "heavy":
                trafficControl.changeState(trafficControl.getHeavyTrafficState());
                break;
            case "congested":
                trafficControl.changeState(trafficControl.getCongestedState());
                break;
            case "closed":
                trafficControl.changeState(trafficControl.getClosedState());
                break;
            default:
                return "Estado inválido!";
        }
        return "O estado do tráfego foi alterado para: " + state;
    }
}