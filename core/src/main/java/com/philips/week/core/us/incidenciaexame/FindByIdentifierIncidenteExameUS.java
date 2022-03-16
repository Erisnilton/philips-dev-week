package com.philips.week.core.us.incidenciaexame;

import com.philips.week.core.ports.respository.incidenciaexame.IncidenciaExamePort;
import org.springframework.stereotype.Service;

import java.util.NoSuchElementException;

@Service
public record FindByIdentifierIncidenteExameUS(IncidenciaExamePort repository) {

    public  <S> S apply(String identifier, Class<S> projection) {
        return repository.findByIdentifierAndDeletedFalse(identifier, projection).orElseThrow(() -> new NoSuchElementException("Incidência Exame não encontrada"));
    }
}
