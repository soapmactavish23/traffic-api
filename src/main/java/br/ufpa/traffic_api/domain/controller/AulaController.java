package br.ufpa.traffic_api.domain.controller;

import br.ufpa.traffic_api.domain.model.AulaDTO;
import br.ufpa.traffic_api.domain.service.AulaService;
import jakarta.validation.Valid;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@AllArgsConstructor
@RequestMapping("/api/aulas")
public class AulaController {

    private final AulaService aulaService;

    @PostMapping("/iniciar")
    @ResponseStatus(code = HttpStatus.NO_CONTENT)
    public void iniciarAula(@RequestBody @Valid AulaDTO aula) {
        aulaService.iniciarAula(aula);
    }
}