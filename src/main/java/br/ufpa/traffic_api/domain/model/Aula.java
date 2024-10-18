package br.ufpa.traffic_api.domain.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Date;

@Data
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Aula {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column(name = "data_hora_inicio_planejado")
    private Date dataHoraInicioPlanejado;

    @Column(name = "data_hora_fim_planejado")
    private Date dataHoraFimPlanejado;

    @Column(name = "data_hora_inicio_real")
    private Date dataHoraInicioReal;

    @Column(name = "data_hora_fim_real")
    private Date dataHoraFimReal;

}
