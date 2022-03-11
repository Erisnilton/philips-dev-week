package com.philips.week.core.us.incidenciaexame;

import com.philips.week.core.domain.IncidenciaExame;
import com.philips.week.core.ports.respository.incidenciaexame.IncidenciaExamePort;
import org.springframework.stereotype.Service;

@Service
public record DeleteIncidenciaExameUS(FindByIdentifierIncidenteExameUS findByIdentifierIncidenteExameUS, IncidenciaExamePort repository) {

    public void apply(String identifier)  {
        var incidenteExame = findByIdentifierIncidenteExameUS.apply(identifier, IncidenciaExame.class);
        incidenteExame.deleted(true);
        repository.save(incidenteExame);
    }
}
