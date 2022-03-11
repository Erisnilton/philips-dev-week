package com.philips.week.core.us.incidenciaexame;

import com.philips.week.core.domain.IncidenciaExame;
import com.philips.week.core.ports.respository.incidenciaexame.IncidenciaExamePort;
import org.springframework.stereotype.Service;

@Service
public record CreateIncidenciaExameUS(IncidenciaExamePort repository) {

    public IncidenciaExame apply(IncidenciaExame incidenciaExame) {

        return repository.save(incidenciaExame);

    }
}
