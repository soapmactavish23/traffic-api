package br.ufpa.traffic_api.controller;

import br.ufpa.traffic_api.models.TrafficControl;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/traffic-control")
public class TrafficControlController {

    private final TrafficControl trafficControl;

    public TrafficControlController() {
        this.trafficControl = new TrafficControl();
    }

    @GetMapping("/current-state")
    public String getCurrentState() {
        trafficControl.handleTraffic();
        return "Estado atual do tráfego processado.";
    }

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