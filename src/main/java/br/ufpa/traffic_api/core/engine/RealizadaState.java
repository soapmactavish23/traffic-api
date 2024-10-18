package br.ufpa.traffic_api.core.engine;

import br.ufpa.traffic_api.domain.model.Aula;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

@Slf4j
public class RealizadaState implements State {

    @Override
    public void handle(Aula aula) {
        aula.setDataHoraFimReal(new Date());
        log.info("Aula finalizada.");
    }
}
