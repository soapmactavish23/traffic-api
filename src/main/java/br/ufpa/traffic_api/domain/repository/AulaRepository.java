package br.ufpa.traffic_api.domain.repository;

import br.ufpa.traffic_api.domain.model.Aula;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AulaRepository extends JpaRepository<Aula, Integer> {
}
