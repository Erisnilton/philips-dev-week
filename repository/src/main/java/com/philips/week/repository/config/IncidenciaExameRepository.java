package com.philips.week.repository.config;

import com.philips.week.core.domain.IncidenciaExame;
import com.philips.week.core.ports.respository.incidenciaexame.IncidenciaExamePort;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface IncidenciaExameRepository extends MongoRepository<IncidenciaExame, String>, IncidenciaExamePort {
}
