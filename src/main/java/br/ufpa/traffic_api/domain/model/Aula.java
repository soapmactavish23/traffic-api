package br.ufpa.traffic_api.domain.model;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
