package br.ufpa.traffic_api.core.engine;

import br.ufpa.traffic_api.domain.model.Aula;

public interface State {

    void handle(Aula aula);

}
