package br.ufpa.traffic_api.domain.model;

import java.util.Date;

import jakarta.validation.constraints.NotNull;
import lombok.Data;

@Data
public class AulaDTO {

    @NotNull
    private Date dataHoraInicioPlanejado;
    private Date dataHoraFimPlanejado;

    public Aula convert() {
        Aula aula = new Aula();
        aula.setDataHoraInicioPlanejado(dataHoraInicioPlanejado);
        aula.setDataHoraFimPlanejado(dataHoraFimPlanejado);
        return aula;
    }

}
