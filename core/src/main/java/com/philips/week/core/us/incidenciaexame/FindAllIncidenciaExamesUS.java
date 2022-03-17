package com.philips.week.core.us.incidenciaexame;

import com.philips.week.core.domain.IncidenciaExame;
import com.philips.week.core.domain.Regiao;
import com.philips.week.core.ports.respository.incidenciaexame.IncidenciaExamePort;
import com.philips.week.core.ports.respository.regiao.RegiaoRepositoryPort;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public record FindAllIncidenciaExamesUS(IncidenciaExamePort repository) {
    public List<IncidenciaExame> apply() {
        return repository.findByDeletedFalse(IncidenciaExame.class);
    }
}
