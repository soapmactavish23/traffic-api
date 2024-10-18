package br.ufpa.traffic_api;

import br.ufpa.traffic_api.utils.Constants;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;


@Tag(name = "Controle de Trafego", description = "Todos os recursos da api de Controle de Trafego")
public interface TrafficControlDocumentation {

    @Operation(summary = "Recursos para checar estado atual de tráfego",
    responses = {@ApiResponse(responseCode = "200", description = "O estado do tráfego foi alterado para: ...")})
    String getCurrentState();

    @Operation(summary = "Recursos para modificar o estado para FREE",
            responses = {@ApiResponse(responseCode = "200", description = "Trânsito fluindo livremente.")})
    String freeState();

    @Operation(summary = "Recursos para modificar o estado para HEAVY",
            responses = {@ApiResponse(responseCode = "200", description = "Trânsito intenso, veículos se movendo lentamente.")})
    String heavyState();

    @Operation(summary = "Recursos para modificar o estado para CONGESTED",
            responses = {@ApiResponse(responseCode = "200", description = "Trânsito congestionado, quase parado.")})
    String congestedState();

    @Operation(summary = "Recursos para modificar o estado para CLOSED",
            responses = {@ApiResponse(responseCode = "200", description = "Estrada fechada para veículos.")})
    String closedState();

    @Operation(summary = "Recursos para modificar o estado baseado no parâmetro",
            responses = {@ApiResponse(responseCode = "200", description = "O estado do tráfego foi alterado para: ...")})
    String changeState(String state);

}
