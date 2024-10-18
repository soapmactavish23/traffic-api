package br.ufpa.traffic_api.domain.service;

import br.ufpa.traffic_api.core.engine.*;
import br.ufpa.traffic_api.core.utils.CalendarSystem;
import br.ufpa.traffic_api.domain.model.Aula;
import br.ufpa.traffic_api.domain.model.AulaDTO;
import br.ufpa.traffic_api.domain.repository.AulaRepository;
import jakarta.transaction.Transactional;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Slf4j
@Service
public class AulaService {

    @Autowired
    private AulaRepository repository;
    private State estadoAtual;

    public AulaService() {
        this.estadoAtual = new PlanejadaState();
    }

    @Transactional
    public void iniciarAula(AulaDTO dto) {
        Aula aula = dto.convert();

        this.estadoAtual.handle(aula);
        repository.save(aula);

        boolean isAfter = CalendarSystem.isAfter(dto.getDataHoraInicioPlanejado());
        if(isAfter) {
            this.estadoAtual = new NaoRealizadaState();
            this.estadoAtual.handle(aula);
        } else {
            this.estadoAtual = new EmRealizacaoState();
            estadoAtual.handle(aula);
            this.estadoAtual = new RealizadaState();
            estadoAtual.handle(aula);
        }
    }

}
