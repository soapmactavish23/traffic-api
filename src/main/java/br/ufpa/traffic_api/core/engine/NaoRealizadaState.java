package br.ufpa.traffic_api.core.engine;

import br.ufpa.traffic_api.domain.model.Aula;
import lombok.extern.slf4j.Slf4j;

@Slf4j
public class NaoRealizadaState implements State {

    @Override
    public void handle(Aula aula) {
        log.info("Aula não realizada.");
        aula.setDataHoraInicioReal(null);
        aula.setDataHoraFimReal(null);
    }
}