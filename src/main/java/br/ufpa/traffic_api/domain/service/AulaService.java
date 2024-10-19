package br.ufpa.traffic_api.domain.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.ufpa.traffic_api.core.engine.EmRealizacaoState;
import br.ufpa.traffic_api.core.engine.NaoRealizadaState;
import br.ufpa.traffic_api.core.engine.PlanejadaState;
import br.ufpa.traffic_api.core.engine.RealizadaState;
import br.ufpa.traffic_api.core.engine.State;
import br.ufpa.traffic_api.core.utils.CalendarSystem;
import br.ufpa.traffic_api.domain.model.Aula;
import br.ufpa.traffic_api.domain.model.AulaDTO;
import br.ufpa.traffic_api.domain.repository.AulaRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Service
public class AulaService {

    @Autowired
    private AulaRepository repository;
    private State actualState;

    public AulaService() {
        this.actualState = new PlanejadaState();
    }

    @Transactional
    public void iniciarAula(AulaDTO dto) {
        Aula aula = dto.convert();

        this.actualState.handle(aula);
        repository.save(aula);

        boolean isAfter = CalendarSystem.isAfter(dto.getDataHoraInicioPlanejado());
        if(isAfter) {
            this.actualState = new NaoRealizadaState();
            this.actualState.handle(aula);
        } else {
            this.actualState = new EmRealizacaoState();
            actualState.handle(aula);
            this.actualState = new RealizadaState();
            actualState.handle(aula);
        }
    }

}
